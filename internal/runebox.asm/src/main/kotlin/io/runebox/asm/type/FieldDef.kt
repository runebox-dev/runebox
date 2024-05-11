package io.runebox.asm.type

import io.runebox.asm.FieldInfo
import org.objectweb.asm.tree.FieldInsnNode
import org.objectweb.asm.tree.FieldNode

data class FieldDef(val name: String, val desc: String) {
    constructor(field: FieldInfo) : this(field.name, field.desc)
    constructor(field: FieldNode) : this(field.name, field.desc)
    constructor(insn: FieldInsnNode) : this(insn.name, insn.desc)

    override fun toString(): String {
        return "$name $desc"
    }
}