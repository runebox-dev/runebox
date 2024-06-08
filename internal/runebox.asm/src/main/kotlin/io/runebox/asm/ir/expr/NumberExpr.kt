package io.runebox.asm.ir.expr

import io.runebox.asm.ir.ExprTree
import org.objectweb.asm.tree.AbstractInsnNode

class NumberExpr(
    tree: ExprTree,
    instruction: AbstractInsnNode,
    pops: Int,
    pushes: Int
) : ConstantExpr<Number>(tree, instruction, pops, pushes) {

    override val value: Number get() = super.value as Number
}