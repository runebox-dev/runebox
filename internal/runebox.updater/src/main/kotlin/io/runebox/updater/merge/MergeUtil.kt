package io.runebox.updater.merge

import io.runebox.asm.core.*
import io.runebox.asm.isStatic
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

object MergeUtil {

    fun resolveMethod(cls: ClassNode, name: String, desc: String): MethodNode? {
        val ret = cls.memberMethods.firstOrNull { it.name == name && it.desc == desc }
        if(ret != null) return ret
        val superCls = cls.superClass
        if(superCls != null) return resolveMethod(superCls, name, desc)
        return null
    }

    fun resolveField(cls: ClassNode, name: String, desc: String): FieldNode? {
        val ret = cls.memberFields.firstOrNull { it.name == name && it.desc == desc }
        if(ret != null) return ret
        val superCls = cls.superClass
        if(superCls != null) return resolveField(superCls, name, desc)
        return null
    }

    fun resolveStaticMethod(cls: ClassNode, name: String, desc: String): MethodNode? {
        var ret = cls.staticMethods.firstOrNull { it.name == name && it.desc == desc }
        if(ret != null) return ret
        val superCls = cls.superClass
        if(superCls != null) {
            ret = resolveStaticMethod(superCls, name, desc)
            if(ret != null) return ret
        }
        for(itfCls in cls.interfaceClasses) {
            ret = resolveStaticMethod(itfCls, name, desc)
            if(ret != null) return ret
        }
        return null
    }

    fun resolveStaticField(cls: ClassNode, name: String, desc: String): FieldNode? {
        var ret = cls.staticFields.firstOrNull { it.name == name && it.desc == desc }
        if(ret != null) return ret
        val superCls = cls.superClass
        if(superCls != null) {
            ret = resolveStaticField(superCls, name, desc)
            if(ret != null) return ret
        }
        for(itfCls in cls.interfaceClasses) {
            ret = resolveStaticField(itfCls, name, desc)
            if(ret != null) return ret
        }
        return null
    }

    fun isMaybeEqual(cls1: ClassNode?, cls2: ClassNode?): Boolean {
        if(cls1 == null && cls2 == null) return true
        if(cls1 == null || cls2 == null) return false
        if((cls1.superClass != null && !cls1.superClass!!.isJvm) || (cls2.superClass != null && !cls2.superClass!!.isJvm)) {
            if(!isMaybeEqual(cls1.superClass, cls2.superClass)) return false
        } else {
            if(cls1.superName != cls2.superName) return false
        }
        val ifs1 = cls1.interfaceClasses
        val ifs2 = cls2.interfaceClasses
        return ifs1.size == ifs2.size
    }

    fun isMaybeEqual(method1: MethodNode?, method2: MethodNode?): Boolean {
        if(method1 == null && method2 == null) return true
        if(method1 == null || method2 == null) return false
        if(method1.access.isStatic != method2.access.isStatic) return false
        return isMethodTypeMaybeEqual(Type.getMethodType(method1.desc), Type.getMethodType(method2.desc))
    }

    fun isMaybeEqual(field1: FieldNode?, field2: FieldNode?): Boolean {
        if(field1 == null && field2 == null) return true
        if(field1 == null || field2 == null) return false
        if(field1.access.isStatic != field2.access.isStatic) return false
        return isTypeMaybeEqual(Type.getType(field1.desc), Type.getType(field2.desc))
    }

    fun isTypeMaybeEqual(type1: Type, type2: Type): Boolean {
        if(type1.sort != type2.sort) return false
        if(type1.sort == Type.ARRAY && type2.sort == Type.ARRAY) {
            if(type1.dimensions != type2.dimensions) return false
            var t1 = type1.elementType
            var t2 = type2.elementType
            if(type1.sort <= 8 || type2.sort <= 8) return type1 == type2
        }
        return true
    }

    fun isMethodTypeMaybeEqual(type1: Type, type2: Type): Boolean {
        val args1 = type1.argumentTypes
        val args2 = type2.argumentTypes
        if(args1.size != args2.size) return false
        if(!isTypeMaybeEqual(type1.returnType, type2.returnType)) return false
        for(i in args1.indices) {
            val arg1 = args1[i]
            val arg2 = args2[i]
            if(!isTypeMaybeEqual(arg1, arg2)) return false
        }
        return true
    }

    fun String.isObfuscatedName(): Boolean {
        return listOf("Class", "method", "field").any { this.startsWith(it) }
    }
}