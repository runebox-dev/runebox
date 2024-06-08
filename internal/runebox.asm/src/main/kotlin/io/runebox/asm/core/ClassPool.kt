package io.runebox.asm.core

import io.runebox.asm.MemberRef
import io.runebox.asm.remap.AsmRemapper
import io.runebox.asm.remap.NameMappings
import io.runebox.asm.remap.remap
import io.runebox.asm.toByteArray
import io.runebox.asm.toClassNode
import org.objectweb.asm.ClassReader
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode
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
        if(classMap.containsKey(oldName)) {
            classMap.remove(oldName)
            classMap[cls.name] = cls
        }
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

    fun resolveMethod(owner: String, name: String, desc: String): MethodNode? {
        return findClass(owner).findSuperMethod(name, desc)
    }

    fun resolveField(owner: String, name: String, desc: String): FieldNode? {
        return findClass(owner).findSuperField(name, desc)
    }

    fun resolveMethod(ref: MemberRef) = resolveMethod(ref.owner, ref.name, ref.desc)
    fun resolveField(ref: MemberRef) = resolveField(ref.owner, ref.name, ref.desc)

    fun remap(mappings: NameMappings) {
        val remapper = AsmRemapper(mappings)
        for(cls in allClasses) cls.remap(remapper)
    }
}