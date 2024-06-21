package io.runebox.updater.asm.tree

import io.runebox.updater.asm.ObfInfo
import io.runebox.updater.asm.asmName
import io.runebox.updater.asm.toByteArray
import io.runebox.updater.asm.toClassNode
import org.objectweb.asm.tree.ClassNode
import java.io.File
import java.net.URLClassLoader
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

    fun loadObfuscatedInfo() {
        for(cls in classes) {
            val clsAnno = cls.annotation("io/runebox/ObfInfo") ?: continue
            cls.obfInfo = ObfInfo(
                owner = clsAnno["owner", ""],
                name = clsAnno["name", ""],
                desc = clsAnno["desc", ""],
                opaque = clsAnno["opaque", ""],
                intMultiplier = clsAnno["intMultiplier", 0],
                longMultiplier = clsAnno["longMultiplier", 0L]
            )
            for(method in cls.methods) {
                val methodAnno = method.annotation("io/runebox/ObfInfo") ?: continue
                method.obfInfo = ObfInfo(
                    owner = methodAnno["owner", ""],
                    name = methodAnno["name", ""],
                    desc = methodAnno["desc", ""],
                    opaque = methodAnno["opaque", ""],
                    intMultiplier = methodAnno["intMultiplier", 0],
                    longMultiplier = methodAnno["longMultiplier", 0L]
                )
            }
            for(field in cls.fields) {
                val fieldAnno = field.annotation("io/runebox/ObfInfo") ?: continue
                field.obfInfo = ObfInfo(
                    owner = fieldAnno["owner", ""],
                    name = fieldAnno["name", ""],
                    desc = fieldAnno["desc", ""],
                    opaque = fieldAnno["opaque", ""],
                    intMultiplier = fieldAnno["intMultiplier", 0],
                    longMultiplier = fieldAnno["longMultiplier", 0L]
                )
            }
        }
    }

    inner class ClassLoader(parent: java.lang.ClassLoader = java.lang.ClassLoader::class.java.classLoader) : URLClassLoader(arrayOf(), parent) {
        override fun findClass(name: String): Class<*>? {
            val cls = this@ClassGroup.findClass(name.asmName) ?: return super.findClass(name)
            val bytes = cls.toByteArray()
            return super.defineClass(name, bytes, 0, bytes.size)
        }
    }
}