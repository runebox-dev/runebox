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