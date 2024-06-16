package io.runebox.asm

import io.runebox.asm.core.findField
import io.runebox.asm.core.findMethod
import org.objectweb.asm.tree.*

data class MemberDef(val name: String, val desc: String) {
    constructor(method: MethodNode) : this(method.name, method.desc)
    constructor(field: FieldNode) : this(field.name, field.desc)
    constructor(insn: MethodInsnNode) : this(insn.name, insn.desc)
    constructor(insn: FieldInsnNode) : this(insn.name, insn.desc)
    constructor(ref: MemberRef) : this(ref.name, ref.desc)

    fun toRef(owner: String) = MemberRef(owner, name, desc)
    fun toRef(cls: ClassNode) = MemberRef(cls.name, name, desc)
    fun resolveMethod(cls: ClassNode) = cls.findMethod(name, desc)
    fun resolveField(cls: ClassNode) = cls.findField(name, desc)

    val isMethod get() = desc.startsWith("(")
    val isField get() = !isMethod

    override fun toString(): String {
        return "$name $desc"
    }
}