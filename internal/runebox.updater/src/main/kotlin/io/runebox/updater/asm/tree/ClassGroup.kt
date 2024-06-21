package io.runebox.updater.asm.tree

import io.runebox.updater.asm.toClassNode
import org.objectweb.asm.tree.ClassNode
import java.io.File
import java.util.*
import java.util.jar.JarFile

class ClassGroup {

    private val classMap: SortedMap<String, ClassNode> = TreeMap()
    val classes: Set<ClassNode> get() = classMap.values.filterIsInstanceTo(mutableSetOf())
    val classNameMap: Map<String, ClassNode> get() = classMap

    operator fun contains(name: String) = classMap.containsKey(name)
    operator fun get(name: String) = classMap[name]

    fun addClass(cls: ClassNode) = classMap.put(cls.name, cls.also { it.init(this) })
    fun removeClass(cls: ClassNode) = classMap.remove(cls.name)

    fun getClass(name: String) = classMap[name]

    fun read(file: File): ClassGroup {
        JarFile(file).use { jar ->
            jar.entries().asSequence().forEach { entry ->
                val name = entry.name
                if(!name.startsWith("org/") && name.endsWith(".class")) {
                    val cls = jar.getInputStream(entry).toClassNode()
                    addClass(cls)
                }
            }
        }
        return this
    }
}