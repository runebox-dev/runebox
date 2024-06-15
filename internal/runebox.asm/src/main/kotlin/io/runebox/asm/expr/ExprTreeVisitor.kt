package io.runebox.asm.expr

interface ExprTreeVisitor {
    fun visitStart(tree: ExprTree) {}
    fun visitEnd(exprTree: ExprTree) {}

    fun visit(expr: Expr) {
        visitExpr(expr)
    }

    fun visitExpr(expr: Expr) {}
}