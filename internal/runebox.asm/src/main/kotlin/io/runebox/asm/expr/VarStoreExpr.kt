package io.runebox.asm.expr

import org.objectweb.asm.tree.VarInsnNode

class VarStoreExpr(
    insn: VarInsnNode,
    pops: Int,
    pushes: Int
) : VarExpr(insn, pops, pushes) {

    override val isLoad = false

    override fun toString(): String {
        return "VAR-STORE[$idx]"
    }
}