package io.runebox.asm.expr.impl

import org.objectweb.asm.tree.JumpInsnNode

class CompBranchExpr(
    instruction: JumpInsnNode,
    index: Int,
    size: Int
) : BranchExpr(instruction, index, size) {

    override fun toString(): String {
        return "COMPBRANCH"
    }
}