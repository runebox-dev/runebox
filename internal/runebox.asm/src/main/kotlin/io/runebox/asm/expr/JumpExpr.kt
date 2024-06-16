package io.runebox.asm.expr

import io.runebox.asm.print
import org.objectweb.asm.tree.JumpInsnNode

open class JumpExpr(
    override val insn: JumpInsnNode,
    pops: Int,
    pushes: Int
) : Expr(insn, pops, pushes) {

    override fun toString(): String {
        return "JUMP[${insn.print().trim()} -> ${insn.label.print().trim()}]"
    }
}