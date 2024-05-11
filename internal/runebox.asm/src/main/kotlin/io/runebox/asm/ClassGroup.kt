package io.runebox.asm

import io.runebox.asm.util.toClassNode
import java.util.*

class ClassGroup {

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
}