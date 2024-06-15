package io.runebox.asm.expr.impl

import io.runebox.asm.expr.Expr
import org.objectweb.asm.tree.JumpInsnNode

open class BranchExpr(
    override val instruction: JumpInsnNode,
    index: Int,
    size: Int
) : Expr(instruction, index, size) {

    override fun toString(): String {
        return "BRANCH"
    }
}