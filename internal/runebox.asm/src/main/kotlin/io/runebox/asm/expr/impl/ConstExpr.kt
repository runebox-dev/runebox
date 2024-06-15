package io.runebox.asm.expr.impl

import io.runebox.asm.expr.Expr
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.IntInsnNode

class ConstExpr(
    override val instruction: AbstractInsnNode,
    index: Int,
    size: Int
) : Expr(instruction, index, size) {

    val number: Number? get() = when(instruction.opcode) {
        in ICONST_M1..ICONST_5 -> (instruction.opcode - ICONST_0)
        in LCONST_0..LCONST_1 -> (instruction.opcode - LCONST_0).toLong()
        in FCONST_0..FCONST_2 -> (instruction.opcode - FCONST_0).toFloat()
        in DCONST_0..DCONST_1 -> (instruction.opcode - DCONST_0).toDouble()
        BIPUSH, SIPUSH -> (instruction as IntInsnNode).operand
        else -> null
    }

    fun isInt() = number is Int
    fun isLong() = number is Long

    override fun toString(): String {
        return "CONST[$number]"
    }
}