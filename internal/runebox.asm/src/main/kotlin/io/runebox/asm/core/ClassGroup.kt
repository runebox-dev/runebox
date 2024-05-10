package io.runebox.asm.core

import io.runebox.asm.visitor.AsmClassVisitor
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.util.CheckClassAdapter
import java.util.*

class ClassGroup {
    private val classMap: SortedMap<String, ClassFile> = TreeMap()
    private val dependencyClassMap: SortedMap<String, ClassFile> = TreeMap()

    val allClasses: Set<ClassFile> get() = classMap.values.filterIsInstanceTo(mutableSetOf())
    val dependencyClasses: Set<ClassFile> get() = dependencyClassMap.values.filterIsInstanceTo(mutableSetOf())
    val classes get() = allClasses.filter { !it.isIgnored }
    val ignoredClasses get() = allClasses.filter { it.isIgnored }

    fun getClass(name: String) = classMap[name] ?: dependencyClassMap[name]

    fun findClass(name: String) = classMap[name] ?: dependencyClassMap.getOrPut(name) {
        val bytes = ClassLoader.getSystemClassLoader().getResourceAsStream("$name.class")
            ?.readBytes()
            ?: throw ClassNotFoundException("Class $name could not be found in current runtime classpath.")
        readClass(bytes).also {
            it.isDependency = true
            addClass(it)
        }
    }

    fun containsClass(name: String) = (classMap[name] ?: dependencyClassMap[name]) != null

    fun addClass(cls: ClassFile): Boolean {
        if(containsClass(cls.name)) return false
        val map = if(cls.isDependency) dependencyClassMap else classMap
        cls.group = this
        map[cls.name] = cls
        return true
    }

    fun removeClass(cls: ClassFile): Boolean {
        val map = if(cls.isDependency) dependencyClassMap else classMap
        return map.remove(cls.name) != null
    }

    fun clear() {
        classMap.clear()
        dependencyClassMap.clear()
    }

    fun build() {
        ClassGroupBuilder(this).build()
    }

    fun readClass(bytes: ByteArray): ClassFile {
        val visitor = AsmClassVisitor(this)
        val reader = ClassReader(bytes)
        reader.accept(visitor, ClassReader.EXPAND_FRAMES)
        return visitor.cls
    }

    fun readClass(klass: Class<*>): ClassFile {
        val reader = ClassReader(klass.name)
        val visitor = AsmClassVisitor(this)
        reader.accept(visitor, ClassReader.EXPAND_FRAMES)
        return visitor.cls
    }

    fun writeClass(cls: ClassFile): ByteArray {
        val writer = ClassWriter(ClassWriter.COMPUTE_MAXS)
        val checker = CheckClassAdapter(writer, false)
        cls.accept(checker)
        return writer.toByteArray()
    }
}