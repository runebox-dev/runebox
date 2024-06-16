package io.runebox.asm.expr

import io.runebox.asm.print
import org.objectweb.asm.tree.LabelNode

class LabelExpr(
    override val insn: LabelNode,
    pops: Int,
    pushes: Int
) : Expr(insn, pops, pushes) {

    val targeters = mutableListOf<Expr>()

    fun resolve(): Expr {
        var expr: Expr? = this
        while(expr != null && expr.opcode == -1) {
            expr = expr.next
        }
        return expr ?: parent!!
    }

    override fun toString(): String {
        return "LABEL[${insn.print().trim()}]"
    }
}