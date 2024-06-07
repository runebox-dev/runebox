package io.runebox.asm

import io.runebox.asm.tree.findField
import io.runebox.asm.tree.findMethod
import io.runebox.asm.tree.findSuperField
import io.runebox.asm.tree.findSuperMethod
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
    fun resolveSuperMethod(cls: ClassNode) = cls.findSuperMethod(name, desc)
    fun resolveSuperField(cls: ClassNode) = cls.findSuperField(name, desc)

    val isMethod get() = desc.startsWith("(")
    val isField get() = !isMethod

    override fun toString(): String {
        return "$name $desc"
    }
}