package io.runebox.updater.asm.core

import io.runebox.updater.asm.toClassNode
import org.objectweb.asm.tree.ClassNode
import java.io.File
import java.util.jar.JarFile

class ClassGroup {

    private val classMap = LinkedHashMap<String, ClassNode>()
    val classes: Set<ClassNode> get() = classMap.values.filter{ !it.isIgnored }.filterIsInstanceTo(mutableSetOf())
    val ignoredClasses: Set<ClassNode> get() = classMap.values.filter { it.isIgnored }.filterIsInstanceTo(mutableSetOf())
    val classNameMap: Map<String, ClassNode> get() = classMap

    operator fun contains(name: String) = classMap.containsKey(name)
    operator fun get(name: String) = classMap[name]

    fun addClass(cls: ClassNode) = classMap.put(cls.name, cls.also { it.init(this) })
    fun removeClass(cls: ClassNode) = classMap.remove(cls.name)
    fun removeClass(name: String) = classMap.remove(name)

    fun findClass(name: String) = classMap[name]

    fun read(file: File): ClassGroup {
        JarFile(file).use { jar ->
            jar.entries().asSequence().forEach { entry ->
                val name = entry.name
                if(name.endsWith(".class")) {
                    val cls = jar.getInputStream(entry).toClassNode()
                    addClass(cls)
                }
            }
        }
        return this
    }

    fun ignoreClasses(predicate: (ClassNode) -> Boolean) {
        for(cls in classes) { if(predicate(cls)) cls.isIgnored = true }
    }

    fun ignoreBouncyCastle() = ignoreClasses { it.name.startsWith("org/bouncycastle/") }
    fun ignoreJson() = ignoreClasses { it.name.startsWith("org/json/") }
    fun ignoreAllDependencies() = ignoreClasses { it.name.startsWith("org/") }

    fun build() {
        buildInheritance()
        resolveInstructions()
    }

    fun buildInheritance() {
        for(cls in classes) cls.clearInheritance()
        for(cls in classes) cls.buildInheritance()
    }

    fun resolveInstructions() {
        for(cls in classes) {
            for(method in cls.methods) {
                method.instructions.resolveInstructions(this)
            }
        }
    }
}