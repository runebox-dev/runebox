package io.runebox.asm.expr.impl

import io.runebox.asm.MemberRef
import io.runebox.asm.expr.Expr
import org.objectweb.asm.tree.AbstractInsnNode

abstract class MemberExpr<T : AbstractInsnNode>(
    override val instruction: T,
    index: Int,
    size: Int
) : Expr(instruction, index, size) {

    abstract val ref: MemberRef

    val owner get() = ref.owner
    val name get() = ref.name
    val desc get() = ref.desc

    override fun toString(): String {
        return "MEMBER[$ref]"
    }
}