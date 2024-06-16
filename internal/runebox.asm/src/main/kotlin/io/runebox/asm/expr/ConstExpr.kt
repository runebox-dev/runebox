package io.runebox.asm.expr

import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.IntInsnNode
import org.objectweb.asm.tree.LdcInsnNode

class ConstExpr(insn: AbstractInsnNode, pops: Int, pushes: Int) : Expr(insn, pops, pushes) {

    val number: Number?
        get() = when(insn.opcode) {
            BIPUSH, SIPUSH, NEWARRAY -> (insn as IntInsnNode).operand
            in ICONST_M1..ICONST_5 -> insn.opcode - ICONST_0
            in LCONST_0..LCONST_1 -> insn.opcode - LCONST_0
            in FCONST_0..FCONST_2 -> insn.opcode - FCONST_0
            in DCONST_0..DCONST_1 -> insn.opcode - DCONST_0
            LDC -> (insn as LdcInsnNode).cst as? Number
            else -> null
        }

    val isInt get() = insn.opcode in ICONST_M1..ICONST_5 || (insn.opcode == LDC && (insn as LdcInsnNode).cst is Int)
    val isLong get() = insn.opcode in LCONST_0..LCONST_1 || (insn.opcode == LDC && (insn as LdcInsnNode).cst is Long)

    override fun toString(): String {
        return "NUMBER[$number]"
    }
}