package io.runebox.asm

import io.runebox.asm.type.MethodDef
import io.runebox.asm.type.MethodRef
import org.objectweb.asm.tree.MethodNode

class MethodInfo(override var cls: ClassInfo, override val node: MethodNode) : MemberInfo<MethodNode>() {
    var isReal: Boolean = true

    override var access by node::access
    override var name by node::name
    override var desc by node::desc

    var tryCatchBlocks by node::tryCatchBlocks
    var exceptions by node::exceptions
    var instructions by node::instructions
    var maxLocals by node::maxLocals
    var maxStack by node::maxStack

    val def get() = MethodDef(this)
    val ref get() = MethodRef(cls, this)

    val isConstructor get() = name == "<init>"
    val isInitializer get() = name == "<clinit>"

    val virtualMethods: List<MethodInfo> get() {
        fun findAllParentMethods(cls: ClassInfo?, def: MethodDef, methods: MutableList<MethodInfo>): MutableList<MethodInfo> {
            if(cls == null) return methods

            val method = cls.findMethod(def)
            if(method != null && !method.isStatic) methods.add(method)

            val parentMethods = findAllParentMethods(cls.superClass, def, mutableListOf())
            for(itfCls in cls.interfaceClasses) {
                parentMethods.addAll(findAllParentMethods(itfCls, def, mutableListOf()))
            }

            return if(parentMethods.isEmpty()) methods else parentMethods
        }

        fun visitChildMethods(cls: ClassInfo?, def: MethodDef, methods: MutableList<MethodInfo>, visited: MutableSet<ClassInfo>) {
            if(cls == null || visited.contains(cls)) return
            visited.add(cls)

            val method = cls.findMethod(def)
            if(method != null && !method.isStatic) methods.add(method)

            for(childCls in cls.childClasses) {
                visitChildMethods(childCls, def, methods, visited)
            }
        }

        val list = mutableListOf<MethodInfo>()
        if(this.isStatic) {
            list.add(this)
            return list
        }

        val parentMethods = findAllParentMethods(cls, def, mutableListOf())
        for(parentMethod in parentMethods) {
            visitChildMethods(parentMethod.cls, parentMethod.def, list, mutableSetOf())
        }

        return list
    }

    override fun toString(): String {
        return "$cls.$name $desc"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MethodInfo) return false

        if (cls != other.cls) return false
        if (name != other.name) return false
        if (desc != other.desc) return false

        return true
    }

    override fun hashCode(): Int {
        var result = cls.hashCode()
        result = 31 * result + (name?.hashCode() ?: 0)
        result = 31 * result + (desc?.hashCode() ?: 0)
        return result
    }
}