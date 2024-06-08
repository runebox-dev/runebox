package io.runebox.asm

import io.runebox.asm.tree.*
import org.objectweb.asm.tree.*

data class MemberRef(val owner: String, val name: String, val desc: String) : Comparable<MemberRef> {
    constructor(method: MethodNode) : this(method.cls.name, method.name, method.desc)
    constructor(field: FieldNode) : this(field.cls.name, field.name, field.desc)
    constructor(owner: String, method: MethodNode) : this(owner, method.name, method.desc)
    constructor(owner: String, field: FieldNode) : this(owner, field.name, field.desc)
    constructor(owner: String, def: MemberDef) : this(owner, def.name, def.desc)
    constructor(cls: ClassNode, method: MethodNode) : this(cls.name, method.name, method.desc)
    constructor(cls: ClassNode, field: FieldNode) : this(cls.name, field.name, field.desc)
    constructor(cls: ClassNode, def: MemberDef) : this(cls.name, def.name, def.desc)
    constructor(insn: MethodInsnNode) : this(insn.owner, insn.name, insn.desc)
    constructor(insn: FieldInsnNode) : this(insn.owner, insn.name, insn.desc)

    fun toDef() = MemberDef(this)
    fun resolveMethod(pool: ClassPool) = pool.findClass(owner).findMethod(name, desc)
    fun resolveField(pool: ClassPool) = pool.findClass(owner).findField(name, desc)
    fun resolveSuperMethod(pool: ClassPool) = pool.findClass(owner).findSuperMethod(name, desc)
    fun resolveSuperField(pool: ClassPool) = pool.findClass(owner).findSuperField(name, desc)

    val isMethod get() = toDef().isMethod
    val isField get() = toDef().isField

    override fun compareTo(other: MemberRef): Int {
        var ret = owner.compareTo(other.owner)
        if(ret != 0) return ret

        ret = name.compareTo(other.name)
        if(ret != 0) return ret

        return desc.compareTo(other.desc)
    }

    override fun toString(): String {
        return "$owner.$name $desc"
    }
}