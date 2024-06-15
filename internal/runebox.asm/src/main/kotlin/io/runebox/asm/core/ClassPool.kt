package io.runebox.asm.core

import io.runebox.asm.*
import io.runebox.asm.util.collection.DisjointSet
import io.runebox.asm.util.collection.ForestDisjointSet
import org.objectweb.asm.ClassReader
import org.objectweb.asm.tree.ClassNode
import java.io.File
import java.util.*
import java.util.jar.JarEntry
import java.util.jar.JarFile
import java.util.jar.JarOutputStream

class ClassPool {

    val resources = mutableMapOf<String, ByteArray>()
    private val classMap: SortedMap<String, ClassNode> = TreeMap()
    private val jvmClassMap: SortedMap<String, ClassNode> = TreeMap()

    val allClasses: Set<ClassNode> get() = classMap.values.filterIsInstanceTo(mutableSetOf())
    val classes get() = allClasses.filter { !it.isIgnored }
    val ignoredClasses get() = allClasses.filter { it.isIgnored }
    val jvmClasses: Set<ClassNode> get() = jvmClassMap.values.filterIsInstanceTo(mutableSetOf())

    fun addClass(cls: ClassNode) {
       if(classMap.containsKey(cls.name)) return
        cls.init(this)
        classMap[cls.name] = cls
    }

    fun removeClass(cls: ClassNode) {
        if(!classMap.containsKey(cls.name)) return
        classMap.remove(cls.name)
    }

    fun containsClass(name: String): Boolean {
        return classMap.containsKey(name)
    }

    fun updateClassName(cls: ClassNode, oldName: String) {
        classMap.remove(oldName)
        classMap[cls.name] = cls
    }

    fun replaceClass(old: ClassNode, new: ClassNode) {
        removeClass(old)
        addClass(new)
    }

    fun findClass(name: String): ClassNode = classMap[name] ?: jvmClassMap.getOrPut(name) {
        val input = ClassLoader.getSystemClassLoader().getResourceAsStream("$name.class")
            ?: throw RuntimeException("Failed to find the class: $name in the runtime JVM classpath.")
        val cls = input.readBytes().toClassNode(ClassReader.SKIP_CODE)
        cls.isJvm = true
        cls.init(this)
        jvmClassMap[cls.name] = cls
        return cls
    }

    fun clear() {
        classMap.clear()
        jvmClassMap.clear()
    }

    fun loadJar(file: File) {
        JarFile(file).use { jar ->
            for((index, entry) in jar.entries().asSequence().withIndex()) {
                val bytes = jar.getInputStream(entry).readBytes()
                if(entry.name.endsWith(".class")) {
                    val cls = bytes.toClassNode()
                    cls.jarIndex = index
                    addClass(cls)
                } else if(!entry.isDirectory) {
                    resources[entry.name] = bytes
                }
            }
        }
    }

    fun saveJar(file: File, includeIgnored: Boolean = true, includeResources: Boolean = true) {
        if(file.exists()) file.delete()
        if(file.parentFile?.exists() != true) file.parentFile?.mkdirs()
        file.createNewFile()
        JarOutputStream(file.outputStream()).use { jos ->
            val entries = mutableMapOf<String, ByteArray>()
            for(cls in classes) entries["${cls.name}.class"] = cls.toByteArray()
            if(includeIgnored) for(cls in ignoredClasses) entries["${cls.name}.class"] = cls.toByteArray()
            if(includeResources) for((name, bytes) in resources) entries[name] = bytes

            for((name, bytes) in entries) {
                jos.putNextEntry(JarEntry(name))
                jos.write(bytes)
                jos.closeEntry()
            }
        }
    }

    fun createMethodHierarchy() = createMemberHierarchy(ClassNode::methodDefs, ClassNode::methodAccess)
    fun createFieldHierarchy() = createMemberHierarchy(ClassNode::fieldDefs, ClassNode::fieldAccess)

    private fun createMemberHierarchy(
        getMembers: (ClassNode) -> List<MemberDef>,
        getAccess: (ClassNode, MemberDef) -> Int?
    ): DisjointSet<MemberRef> {
        val disjointSet = ForestDisjointSet<MemberRef>()
        val ancestorCache = mutableMapOf<ClassNode, Set<MemberDef>>()
        for(cls in allClasses) {
            visitMemberHierarchy(
                cls,
                getMembers,
                getAccess,
                disjointSet,
                ancestorCache
            )
        }
        return disjointSet
    }

    private fun visitMemberHierarchy(
        cls: ClassNode,
        getMembers: (ClassNode) -> List<MemberDef>,
        getAccess: (ClassNode, MemberDef) -> Int?,
        disjointSet: DisjointSet<MemberRef>,
        ancestorCache: MutableMap<ClassNode, Set<MemberDef>>
    ): Set<MemberDef> {
        var ancestors = ancestorCache[cls]?.toMutableSet()
        if(ancestors != null) return ancestors

        ancestors = mutableSetOf()

        for(parentCls in listOfNotNull(cls.superClass).plus(cls.interfaceClasses)) {
            val members = visitMemberHierarchy(parentCls, getMembers, getAccess, disjointSet, ancestorCache)
            for(member in members) {
                val access = getAccess(cls, member)
                if(access != null && (access.isStatic || member.name == "<init>" || member.isField)) continue

                val set1 = disjointSet.add(MemberRef(cls.name, member))
                val set2 = disjointSet.add(MemberRef(parentCls.name, member))
                disjointSet.union(set1, set2)

                ancestors.add(member)
            }
        }

        for(member in getMembers(cls)) {
            disjointSet.add(MemberRef(cls.name, member))
            ancestors.add(member)
        }

        ancestorCache[cls] = ancestors
        return ancestors
    }
}