package io.runebox.asm.expr

import io.runebox.asm.print
import org.objectweb.asm.tree.JumpInsnNode

open class IfExpr(
    override val insn: JumpInsnNode,
    pops: Int,
    pushes: Int
) : UnaryExpr(insn, pops, pushes) {

    override fun toString(): String {
        return "IF[${insn.print().trim()}](value=$value)"
    }
}