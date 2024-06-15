package io.runebox.asm.expr

import io.runebox.asm.expr.impl.ConstExpr
import io.runebox.asm.expr.impl.FieldExpr
import io.runebox.asm.expr.impl.LdcExpr
import io.runebox.asm.expr.impl.MethodExpr

interface ExprTreeVisitor {
    fun visitStart(tree: ExprTree) {}
    fun visitEnd(exprTree: ExprTree) {}

    fun visit(expr: Expr) {
        when (expr) {
            is ConstExpr -> visitConstExpr(expr)
            is LdcExpr -> visitLdcExpr(expr)
            is FieldExpr -> visitFieldExpr(expr)
            is MethodExpr -> visitMethodExpr(expr)
            else -> visitExpr(expr)
        }
    }

    fun visitExpr(expr: Expr) {}
    fun visitConstExpr(expr: ConstExpr) {}
    fun visitLdcExpr(expr: LdcExpr) {}
    fun visitFieldExpr(expr: FieldExpr) {}
    fun visitMethodExpr(expr: MethodExpr) {}
}