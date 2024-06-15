package io.runebox.asm.expr.impl

import io.runebox.asm.expr.Expr
import org.objectweb.asm.tree.LdcInsnNode

class LdcExpr(
    override val instruction: LdcInsnNode,
    index: Int,
    size: Int
) : Expr(instruction, index, size) {

    val cst get() = instruction.cst

    override fun toString(): String = "LDC[$cst]"
}