package io.runebox.asm.expr.impl

import io.runebox.asm.MemberRef
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.FieldInsnNode

class FieldExpr(
    instruction: FieldInsnNode,
    index: Int,
    size: Int
) : MemberExpr<FieldInsnNode>(instruction, index, size) {

    override val ref get() = MemberRef(instruction)

    fun isGetter() = opcode == GETFIELD || opcode == GETSTATIC
    fun isPutter() = opcode == PUTFIELD || opcode == PUTSTATIC

    override fun toString(): String {
        return "${if(isGetter()) "GET" else "PUT"}FIELD[$ref]"
    }
}