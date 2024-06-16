package io.runebox.asm.expr

import io.runebox.asm.print
import org.objectweb.asm.tree.JumpInsnNode

class IfCmpExpr(
    override val insn: JumpInsnNode,
    pops: Int,
    pushes: Int
) : BinaryExpr(insn, pops, pushes) {

    override fun toString(): String {
        return "IFCMP[${insn.print().trim()}](left=$left, right=$right)"
    }
}