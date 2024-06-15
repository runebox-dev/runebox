package io.runebox.asm.expr

import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.FrameNode
import org.objectweb.asm.tree.LabelNode
import org.objectweb.asm.tree.LineNumberNode
import org.objectweb.asm.util.Printer

open class Expr(open val instruction: AbstractInsnNode, val index: Int, val size: Int) : Iterable<Expr> {

    lateinit var tree: ExprTree internal set

    val opcode get() = instruction.opcode

    var previous: Expr? = null
    var next: Expr? = null

    var parent: Expr? = null
    val children = ArrayDeque<Expr>()

    fun addChild(expr: Expr) {
        expr.parent = this
        children.addFirst(expr)
    }

    override fun iterator(): Iterator<Expr> {
        return children.iterator()
    }

    open fun visitTree(visitor: ExprTreeVisitor) {
        for(child in children) {
            visitor.visit(child)
            child.visitTree(visitor)
        }
    }

    fun hasChildInTree(expr: Expr): Boolean {
        for(child in children) {
            if(child == expr || child.hasChildInTree(expr)) return true
        }
        return false
    }

    override fun toString(): String {
        return "[${when(instruction) {
            is LabelNode -> "LABEL"
            is LineNumberNode -> "LINE ${(instruction as LineNumberNode).line}"
            is FrameNode -> "FRAME"
            else -> Printer.OPCODES[opcode]
        }}](${children.joinToString(", ") { it.toString() }})"
    }
}