package io.runebox.asm

import io.runebox.asm.archive.Archive
import io.runebox.asm.type.FieldDef
import io.runebox.asm.type.FieldRef
import io.runebox.asm.type.MethodDef
import io.runebox.asm.type.MethodRef
import io.runebox.asm.util.*
import java.util.*

class ClassGroup {

    internal val inputArchives = mutableSetOf<Archive>()
    internal val outputArchives = mutableSetOf<Archive>()

    val resources = hashMapOf<String, ByteArray>()
    private val classMap: SortedMap<String, ClassInfo> = TreeMap()
    private val dependencyClassMap: SortedMap<String, ClassInfo> = TreeMap()

    val allClasses: Set<ClassInfo> get() = classMap.values.filterIsInstanceTo(mutableSetOf())
    val dependencyClasses: Set<ClassInfo> get() = dependencyClassMap.values.filterIsInstanceTo(mutableSetOf())
    val classes get() = allClasses.filter { !it.isIgnored }
    val ignoredClasses get() = allClasses.filter { it.isIgnored }

    fun findClass(name: String) = classMap[name] ?: dependencyClassMap.getOrPut(name) {
        val node = Class.forName(name.replace("/", ".")).toClassNode()
        ClassInfo(this, node).also {
            it.isDependency = true
            dependencyClassMap[it.name] = it
        }
    }

    fun containsClass(name: String) = (classMap[name] ?: dependencyClassMap[name]) != null

    fun addClass(cls: ClassInfo): Boolean {
        if(containsClass(cls.name)) return false
        classMap[cls.name] = cls
        return true
    }

    fun addClass(klass: Class<*>): Boolean {
        val cls = ClassInfo(this, klass.toClassNode())
        return addClass(cls)
    }

    fun addClass(bytes: ByteArray): Boolean {
        val cls = ClassInfo(this, bytes.toClassNode())
        return addClass(cls)
    }

    fun removeClass(cls: ClassInfo): Boolean {
        if(!containsClass(cls.name)) return false
        return classMap[cls.name] != null
    }

    fun clear() {
        classMap.clear()
        dependencyClassMap.clear()
    }

    fun buildHierarchy() {
        for(cls in allClasses) cls.clearHierarchy()
        for(cls in allClasses) cls.buildHierarchy()
    }

    fun readArchive(archive: Archive) {
        inputArchives.add(archive)
        val entries = archive.read()
        for((name, bytes) in entries) {
            if(name.endsWith(".class")) {
                val node = bytes.toClassNode().recomputeFrames(this)
                val cls = ClassInfo(this, node)
                addClass(cls)
            } else {
                resources[name] = bytes
            }
        }
    }

    fun writeArchive(archive: Archive, writeIgnored: Boolean = true, writeResources: Boolean = true) {
        outputArchives.add(archive)
        val entries = hashMapOf<String, ByteArray>()
        classes.forEach { cls -> entries["${cls.name}.class"] = cls.node.toByteArray() }
        if(writeIgnored) {
            ignoredClasses.forEach { cls -> entries["${cls.name}.class"] = cls.node.toByteArray() }
        }
        if(writeResources) {
            resources.forEach { (name, bytes) -> entries[name] = bytes }
        }
        archive.write(entries)
    }

    fun createMethodHierarchySets(): DisjointSet<MethodRef> {
        fun visitParentMethods(
            cls: ClassInfo,
            hierarchyMethodsMap: MutableMap<ClassInfo, Set<MethodDef>>,
            disjointSet: DisjointSet<MethodRef>
        ): Set<MethodDef> {
            var hierarchyMethods = hierarchyMethodsMap[cls]
            if(hierarchyMethods != null) return hierarchyMethods
            hierarchyMethods = mutableSetOf()
            for(parentCls in cls.parentClasses) {
                val methodDefs = visitParentMethods(parentCls, hierarchyMethodsMap, disjointSet)
                for(def in methodDefs) {
                    val info = cls.findMethod(def)
                    if(info != null && (info.isStatic || def.name == "<init>")) {
                        continue
                    }
                    val set1 = disjointSet.add(MethodRef(cls.name, def))
                    val set2 = disjointSet.add(MethodRef(parentCls.name, def))
                    disjointSet.union(set1, set2)
                    hierarchyMethods.add(def)
                }
            }
            for(method in cls.methods) {
                disjointSet.add(MethodRef(cls.name, method))
                hierarchyMethods.add(method.def)
            }

            hierarchyMethodsMap[cls] = hierarchyMethods
            return hierarchyMethods
        }

        val disjointSet = ForestDisjointSet<MethodRef>()
        val hierarchyMethodsMap = mutableMapOf<ClassInfo, Set<MethodDef>>()
        for(cls in allClasses) visitParentMethods(cls, hierarchyMethodsMap, disjointSet)
        return disjointSet
    }

    fun createFieldHierarchySets(): DisjointSet<FieldRef> {
        fun visitParentFields(
            cls: ClassInfo,
            hierarchyFieldsMap: MutableMap<ClassInfo, Set<FieldDef>>,
            disjointSet: DisjointSet<FieldRef>
        ): Set<FieldDef> {
            hierarchyFieldsMap[cls]?.apply { return this }
            val hierarchyFields = mutableSetOf<FieldDef>()
            for(parentCls in cls.parentClasses) {
                val fieldDefs = visitParentFields(parentCls, hierarchyFieldsMap, disjointSet)
                for(def in fieldDefs) {
                    val info = cls.findField(def)
                    if(info != null) {
                        continue
                    }
                    val set1 = disjointSet.add(FieldRef(cls.name, def))
                    val set2 = disjointSet.add(FieldRef(parentCls.name, def))
                    disjointSet.union(set1, set2)
                    hierarchyFields.add(def)
                }
            }
            for(field in cls.fields) {
                disjointSet.add(FieldRef(cls.name, field))
                hierarchyFields.add(field.def)
            }

            hierarchyFieldsMap[cls] = hierarchyFields
            return hierarchyFields
        }

        val disjointSet = ForestDisjointSet<FieldRef>()
        val hierarchyFieldsMap = mutableMapOf<ClassInfo, Set<FieldDef>>()
        for(cls in allClasses) visitParentFields(cls, hierarchyFieldsMap, disjointSet)
        return disjointSet
    }
}