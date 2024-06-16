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

    val opcode get() = insn.opcode

    override fun iterator(): Iterator<Expr> {
        return children.iterator()
    }

    fun addChild(child: Expr) {
        child.parent = this
        children.addFirst(child)
    }

    fun accept(visitor: ExprVisitor) {
        visitor.visitAny(this)
        if (this is LabelExpr) visitor.visitLabel(this)
        if (this is LineExpr) visitor.visitLine(this)
        if (this is ConstExpr) visitor.visitNumber(this)
        if (this is JumpExpr) visitor.visitJump(this)
        if (this is GotoExpr) visitor.visitGoto(this)
        if (this is FieldExpr) visitor.visitField(this)
        if (this is MethodExpr) visitor.visitMethod(this)
        if(this is UnaryExpr) visitor.visitUnary(this)
        if(this is BinaryExpr) visitor.visitBinary(this)
        if (this is IfExpr) visitor.visitIf(this)
        if (this is IfCmpExpr) visitor.visitIfCmp(this)
        if (this is MathExpr) visitor.visitMath(this)
        if(this is VarExpr) visitor.visitVar(this)
        if (this is VarLoadExpr) visitor.visitVarLoad(this)
        if (this is VarStoreExpr) visitor.visitVarStore(this)
    }

    fun collapse(): List<AbstractInsnNode> {
        val insns = mutableListOf<AbstractInsnNode>()
        for(child in children) {
            insns.addAll(child.collapse())
        }
        insns.add(insn)
        return insns
    }

    override fun toString(): String {
        return "EXPR"
    }
}