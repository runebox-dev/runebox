package io.runebox.asm

import io.runebox.asm.archive.Archive
import io.runebox.asm.util.recomputeFrames
import io.runebox.asm.util.toByteArray
import io.runebox.asm.util.toClassNode
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
}