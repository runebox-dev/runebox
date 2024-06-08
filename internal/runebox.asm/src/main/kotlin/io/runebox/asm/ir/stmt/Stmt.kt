package io.runebox.asm.ir.stmt

import io.runebox.asm.ir.ExprTree
import io.runebox.asm.ir.expr.Expr
import org.objectweb.asm.tree.AbstractInsnNode

open class Stmt(
    tree: ExprTree,
    instruction: AbstractInsnNode,
    pops: Int,
    pushes: Int
) : Expr(tree, instruction, pops, pushes) {

}