package io.runebox.asm.expr.impl

import io.runebox.asm.MemberRef
import org.objectweb.asm.tree.MethodInsnNode

class MethodExpr(
    instruction: MethodInsnNode,
    index: Int,
    size: Int
) : MemberExpr<MethodInsnNode>(instruction, index, size) {

    override val ref get() = MemberRef(instruction)

    override fun toString(): String {
        return "METHOD[$ref]"
    }
}