package io.runebox.updater.asm

import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.*

data class MemberDef(val name: String, val desc: String, val access: Int = -1) {
    constructor(method: MethodNode) : this(method.name, method.desc, method.access)
    constructor(field: FieldNode) : this(field.name, field.desc, field.access)
    constructor(insn: MethodInsnNode) : this(insn.name, insn.desc, if(insn.opcode == INVOKEINTERFACE || insn.itf) ACC_INTERFACE else if(insn.opcode == INVOKESTATIC) ACC_STATIC else -1)
    constructor(insn: FieldInsnNode) : this(insn.name, insn.desc)
    constructor(ref: MemberRef) : this(ref.name, ref.desc)

    fun toRef(owner: String) = MemberRef(owner, name, desc)
    fun toRef(cls: ClassNode) = MemberRef(cls.name, name, desc)

    val isMethod get() = desc.startsWith("(")
    val isField get() = !isMethod

    override fun toString(): String {
        return "$name $desc"
    }
}