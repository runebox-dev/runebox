package io.runebox.asm.expr

import org.objectweb.asm.tree.VarInsnNode

class VarLoadExpr(
    insn: VarInsnNode,
    pops: Int,
    pushes: Int
) : VarExpr(insn, pops, pushes) {

    override val isLoad = true

    override fun toString(): String {
        return "VAR-LOAD[$idx]"
    }
}