package io.runebox.asm.expr

import io.runebox.asm.print
import org.objectweb.asm.tree.JumpInsnNode

class GotoExpr(
    insn: JumpInsnNode,
    pops: Int,
    pushes: Int
) : JumpExpr(insn, pops, pushes) {

    override fun toString(): String {
        return "GOTO[to=${insn.label.print().trim()}]"
    }
}