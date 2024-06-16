package io.runebox.asm.expr

import org.objectweb.asm.tree.VarInsnNode

abstract class VarExpr(
    override val insn: VarInsnNode,
    pops: Int,
    pushes: Int
) : Expr(insn, pops, pushes) {

    val idx get() = insn.`var`

    abstract val isLoad: Boolean
    val isStore get() = !isLoad

}