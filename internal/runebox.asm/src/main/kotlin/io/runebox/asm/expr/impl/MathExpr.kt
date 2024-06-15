package io.runebox.asm.expr.impl

import io.runebox.asm.expr.Expr
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.util.Printer

class MathExpr(
    instruction: AbstractInsnNode,
    index: Int,
    size: Int
) : Expr(instruction, index, size) {

    var left: Expr
        get() = children[0]
        set(value) { children[0] = value }

    var right: Expr
        get() = children[1]
        set(value) { children[1] = value }

    override fun toString(): String {
        return "MATH[${Printer.OPCODES[opcode]}](LEFT: $left, RIGHT: $right)"
    }
}