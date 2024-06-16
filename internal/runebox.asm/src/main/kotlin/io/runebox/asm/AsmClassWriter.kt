package io.runebox.asm

import io.runebox.asm.core.ClassPool
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Type

class AsmClassWriter(private val pool: ClassPool, flags: Int = COMPUTE_FRAMES or COMPUTE_MAXS) : ClassWriter(flags) {

    private val classNames = pool.allClasses.associateBy { it.name }

    override fun getCommonSuperClass(type1: String, type2: String): String {
        try {
            return super.getCommonSuperClass(type1, type2)
        } catch (e: Exception) {
            if(pool.containsClass(type1) && pool.containsClass(type2)) {
                val super1 = pool.findClass(type1).superName
                val super2 = pool.findClass(type2).superName
                if(super1 == super2) {
                    return super1
                }
            }
            return "java/lang/Object"
        }
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