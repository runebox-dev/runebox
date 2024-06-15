package io.runebox.asm.expr

import org.objectweb.asm.tree.AbstractInsnNode

abstract class AbstractExpr<T : AbstractInsnNode>(override val instruction: T, index: Int, size: Int) : Expr(instruction, index, size) {
    override fun toString(): String {
        return "ABSTRACT${super.toString()}"
    }
}