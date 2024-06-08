package io.runebox.asm.ir

import io.runebox.asm.ir.expr.Expr

/**
 * Represents a visitor for expressions in an expression tree.
 *
 * This abstract class provides a mechanism to visit expressions in an expression tree.
 * It allows subclasses to perform operations on each expression in the tree.
 * It also provides a way to chain multiple visitors together by calling the `visitExpr` method on an optional `ev` visitor.
 *
 * @param ev The optional Expr visitor to chain with. It represents the next visitor to be called in the chain.
 */
abstract class ExprVisitor(private val ev: ExprVisitor? = null) {

    /**
     * Calls the `visitExpr` method of the optional `ev` visitor.
     * This method is used to visit an expression in an expression tree.
     * It allows subclasses to perform operations on each expression in the tree.
     *
     * @param expr The expression to be visited.
     */
    open fun visitExpr(expr: Expr) {
        ev?.visitExpr(expr)
    }

}