package io.runebox.asm.expr

abstract class ExprVisitor(private val ev: ExprVisitor? = null) {

    constructor() : this(null)

    open fun visitAny(expr: Expr) { ev?.visitAny(expr) }
    open fun visitExpr(expr: Expr) { ev?.visitExpr(expr) }
    open fun visitNumber(expr: ConstExpr) { ev?.visitNumber(expr) }
    open fun visitLabel(expr: LabelExpr) { ev?.visitLabel(expr) }
    open fun visitLine(expr: LineExpr) { ev?.visitLine(expr) }
    open fun visitJump(expr: JumpExpr) { ev?.visitJump(expr) }
    open fun visitGoto(expr: GotoExpr) { ev?.visitGoto(expr) }
    open fun visitField(expr: FieldExpr) { ev?.visitField(expr) }
    open fun visitMethod(expr: MethodExpr) { ev?.visitMethod(expr) }
    open fun visitUnary(expr: UnaryExpr) { ev?.visitUnary(expr) }
    open fun visitBinary(expr: BinaryExpr) { ev?.visitBinary(expr) }
    open fun visitIf(expr: IfExpr) { ev?.visitIf(expr) }
    open fun visitIfCmp(expr: IfCmpExpr) { ev?.visitIfCmp(expr) }
    open fun visitMath(expr: MathExpr) { ev?.visitMath(expr) }
    open fun visitVar(expr: VarExpr) { ev?.visitVar(expr) }
    open fun visitVarLoad(expr: VarLoadExpr) { ev?.visitVarLoad(expr) }
    open fun visitVarStore(expr: VarStoreExpr) { ev?.visitVarStore(expr) }
}