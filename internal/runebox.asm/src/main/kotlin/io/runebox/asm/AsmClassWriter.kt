package io.runebox.asm

import io.runebox.asm.core.ClassPool
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Type

class AsmClassWriter(private val pool: ClassPool, flags: Int = COMPUTE_FRAMES or COMPUTE_MAXS) : ClassWriter(flags) {

    private val classNames = pool.allClasses.associateBy { it.name }

    override fun getCommonSuperClass(type1: String, type2: String): String {
        if(isAssignable(type1, type2)) return type2
        if(isAssignable(type2, type1)) return type1
        var cls = type1
        do {
            cls = checkNotNull(cls.superName)
        } while(!isAssignable(type2, cls))
        return cls
    }

    private fun isAssignable(from: String, to: String): Boolean {
        if(from == to) return true
        val superCls = from.superName ?: return false
        if(isAssignable(superCls, to)) return true
        return from.interfaceNames.any { isAssignable(it, to) }
    }

    private val String.superName: String? get() {
        return if(this in classNames) {
            classNames.getValue(this).superName
        } else {
            val klass = Class.forName(this.replace("/", "."))
            if(klass.isInterface) "java/lang/Object"
            else klass.superclass?.let { Type.getInternalName(it) }
        }
    }

    private val String.interfaceNames: List<String> get() {
        return if(this in classNames) {
            classNames.getValue(this).interfaces
        } else {
            Class.forName(this.replace("/", ".")).interfaces.map { Type.getInternalName(it) }
        }
    }
}