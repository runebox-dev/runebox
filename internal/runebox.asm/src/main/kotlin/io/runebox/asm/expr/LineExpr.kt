package io.runebox.asm.expr

import org.objectweb.asm.tree.LineNumberNode

class LineExpr(
    override val insn: LineNumberNode,
    pops: Int,
    pushes: Int
) : Expr(insn, pops, pushes) {

    val line get() = insn.line

    override fun toString(): String {
        return "LINE[${insn.line}]"
    }
}