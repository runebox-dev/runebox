package io.runebox.asm.expr

import org.objectweb.asm.tree.AbstractInsnNode

sealed class BinaryExpr(
    insn: AbstractInsnNode,
    pops: Int,
    pushes: Int
) : Expr(insn, pops, pushes) {

    var left: Expr
        get() = children[1]
        set(v) { children[1] = v }

    var right: Expr
        get() = children[0]
        set(v) { children[0] = v }

    fun swap() {
        val origLeft = left
        val origRight = right
        left = origRight
        right = origLeft
    }
}