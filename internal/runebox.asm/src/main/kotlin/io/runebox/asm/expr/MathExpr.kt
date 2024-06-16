package io.runebox.asm.expr

import io.runebox.asm.print
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.AbstractInsnNode

class MathExpr(
    insn: AbstractInsnNode,
    pops: Int,
    pushes: Int
) : BinaryExpr(insn, pops, pushes) {

    val isAddOp get() = opcode in IADD..DADD
    val isSubOp get() = opcode in ISUB..DSUB
    val isMulOp get() = opcode in IMUL..DMUL
    val isDivOp get() = opcode in IDIV..DDIV

    val field get() = if(left is FieldExpr && right !is FieldExpr) left else if(right is FieldExpr && left !is FieldExpr) right else null
    val const get() = if(left is ConstExpr && right !is ConstExpr) left else if(right is ConstExpr && left !is ConstExpr) right else null

    override fun toString(): String {
        return "MATH[${insn.print().trim()}](left=$left, right=$right)"
    }
}