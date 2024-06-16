package io.runebox.asm.expr

import org.objectweb.asm.tree.AbstractInsnNode

open class Expr(
    open val insn: AbstractInsnNode,
    var pops: Int = -1,
    var pushes: Int = -1
) : Iterable<Expr> {

    lateinit var tree: ExprTree internal set
    val method get() = tree.method

    var parent: Expr? = null
    val children = ArrayDeque<Expr>()

    var previous: Expr? = null
    var next: Expr? = null

    override fun iterator(): Iterator<Expr> {
        return children.iterator()
    }

    fun addChild(child: Expr) {
        child.parent = this
        children.addFirst(child)
    }

    fun accept(visitor: ExprVisitor) {
        visitor.visitAny(this)
        when(this) {
            else -> visitor.visitExpr(this)
        }
    }

    override fun toString(): String {
        return "EXPR"
    }
}