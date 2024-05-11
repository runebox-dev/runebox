package io.runebox.asm.util

import io.runebox.asm.ClassGroup
import org.objectweb.asm.ClassWriter
import java.net.URLClassLoader

class AsmClassWriter(private val group: ClassGroup, flags: Int) : ClassWriter(flags) {

    private val classLoader = URLClassLoader(group.inputArchives.map { it.file.toURI().toURL() }.toTypedArray(), ClassLoader.getSystemClassLoader())

    override fun getCommonSuperClass(type1: String, type2: String): String = try {
        var cls1 = Class.forName(type1.jvmName, false, classLoader)
        val cls2 = Class.forName(type2.jvmName, false, classLoader)
        when {
            cls1.isAssignableFrom(cls2) -> type1
            cls2.isAssignableFrom(cls1) -> type2
            cls1.isInterface || cls2.isInterface -> "java/lang/Object"
            else -> {
                do {
                    cls1 = cls1.superclass
                } while(!cls1.isAssignableFrom(cls2))
                cls1.name.asmName
            }
        }
    } catch (e: Exception) {
        "java/lang/Object"
    }

    private val String.asmName get() = this.replace(".", "/")
    private val String.jvmName get() = this.replace("/", ".")
}