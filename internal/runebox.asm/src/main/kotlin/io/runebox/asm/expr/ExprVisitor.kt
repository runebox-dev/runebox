package io.runebox.asm.expr

abstract class ExprVisitor(private val ev: ExprVisitor? = null) {

    constructor() : this(null)

    open fun visitAny(expr: Expr) {
        ev?.visitAny(expr)
    }

    open fun visitExpr(expr: Expr) {
        ev?.visitExpr(expr)
    }
}