package io.runebox.asm

import io.runebox.asm.type.FieldDef
import io.runebox.asm.type.FieldRef
import org.objectweb.asm.tree.FieldNode

class FieldInfo(override var cls: ClassInfo, override val node: FieldNode) : MemberInfo<FieldNode>() {
    var isReal: Boolean = true

    override var access by node::access
    override var name by node::name
    override var desc by node::desc
    var value by node::value

    val def get() = FieldDef(this)
    val ref get() = FieldRef(cls, this)

    override fun toString(): String {
        return "$cls.$name $desc"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FieldInfo) return false

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