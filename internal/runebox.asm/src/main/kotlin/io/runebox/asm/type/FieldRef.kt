package io.runebox.asm.type

import io.runebox.asm.ClassInfo
import io.runebox.asm.FieldInfo
import org.objectweb.asm.tree.FieldInsnNode
import org.objectweb.asm.tree.FieldNode

data class FieldRef(val owner: String, val name: String, val desc: String) {
    constructor(field: FieldInfo) : this(field.cls.name, field.name, field.desc)
    constructor(owner: String, field: FieldInfo) : this(owner, field.name, field.desc)
    constructor(owner: ClassInfo, field: FieldInfo) : this(owner.name, field)
    constructor(owner: String, field: FieldNode) : this(owner, field.name, field.desc)
    constructor(insn: FieldInsnNode) : this(insn.owner, insn.name, insn.desc)
    constructor(owner: String, def: FieldDef) : this(owner, def.name, def.desc)
    constructor(owner: ClassInfo, def: FieldDef) : this(owner.name, def)

    val def get() = FieldDef(name, desc)

    override fun toString(): String {
        return "$owner.$name $desc"
    }
}