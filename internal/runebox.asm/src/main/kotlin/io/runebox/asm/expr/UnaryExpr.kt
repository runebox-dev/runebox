package io.runebox.asm.expr

import org.objectweb.asm.tree.AbstractInsnNode

sealed class UnaryExpr(
    insn: AbstractInsnNode,
    pops: Int,
    pushes: Int
) : Expr(insn, pops, pushes) {

    var value: Expr
        get() = children[0]
        set(value) { children[0] = value }
}