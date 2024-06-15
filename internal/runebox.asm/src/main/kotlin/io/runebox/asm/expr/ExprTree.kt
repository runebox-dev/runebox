package io.runebox.asm.expr

import io.runebox.asm.core.isDoubleOrLong
import io.runebox.asm.core.pops
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.MethodNode
import java.util.concurrent.atomic.AtomicInteger

class ExprTree private constructor(private val exprs: ArrayDeque<Expr>) : Iterable<Expr> {

    init {
        for(expr in exprs) expr.tree = this
    }

    override fun iterator(): Iterator<Expr> {
        return exprs.iterator()
    }

    fun add(expr: Expr) {
        exprs.addLast(expr)
    }

    fun addFirst(expr: Expr) {
        exprs.addFirst(expr)
    }

    fun insert(target: Expr, expr: Expr) {
        exprs.add(exprs.indexOf(target) + 1, expr)
    }

    fun insertBefore(target: Expr, expr: Expr) {
        exprs.add(exprs.indexOf(target), expr)
    }

    fun remove(vararg exprs: Expr) {
        for(expr in exprs) {
            this.exprs.remove(expr)
        }
    }

    private fun accept(visitor: ExprTreeVisitor, parent: Expr) {
        visitor.visit(parent)
        for(expr in parent) accept(visitor, expr)
    }

    fun accept(visitor: ExprTreeVisitor) {
        visitor.visitStart(this)
        for(expr in this) {
            accept(visitor, expr)
        }
        visitor.visitEnd(this)
    }

    companion object {
        fun build(method: MethodNode) = build(method.instructions.toList())
        fun build(instructions: List<AbstractInsnNode>): ExprTree {
            if(instructions.isEmpty()) return ExprTree(ArrayDeque())

            val stack = mutableListOf<AbstractInsnNode>()
            stack.addAll(instructions)
            stack.reverse()


            val exprList = mutableListOf<Expr>()
            val stackIdx = AtomicInteger(0)
            for(insn in stack) {
                val expr = createExpr(insn, stackIdx.getAndIncrement(), insn.pops)
                exprList.add(expr)
            }

            val exprs = ArrayDeque<Expr>()
            val idx = AtomicInteger(0)
            var prev: Expr? = null
            while(idx.get() < exprList.size) {
                val startIdx = idx.get()
                handleExpr(exprList, -1, idx)
                idx.incrementAndGet()
                val expr = exprList[startIdx]
                if(prev != null) {
                    expr.next = prev
                    prev.previous = expr
                }
                exprs.addFirst(expr)
                prev = expr
            }

            return ExprTree(exprs)
        }

        private fun handleExpr(exprList: MutableList<Expr>, parentIdx: Int, idx: AtomicInteger): Int {
            val expr = if(idx.get() >= exprList.size) null else exprList[idx.get()]
            var pops = 0
            if(expr != null) {
                if(parentIdx != -1) {
                    exprList[parentIdx].addChild(expr)
                }
                if(expr.opcode == GOTO) {
                    if(expr.parent != null) {
                        pops = expr.parent!!.size
                    }
                } else {
                    if(expr.opcode == POP2 || expr.opcode == DUP_X1) {
                        pops = 1
                    } else if(expr.opcode in listOf(DUP2, DUP_X2, DUP2_X1, DUP2_X2)) {
                        val isWide = exprList[idx.get() + 1].instruction.isDoubleOrLong
                        pops = if(isWide) 1 else 2
                    }
                    var prev: Expr? = null
                    var i = 0
                    while(i < expr.size) {
                        idx.incrementAndGet()
                        val child = if(exprList.size > idx.get()) exprList[idx.get()] else null
                        if(child != null && prev != null) {
                            child.next = prev
                            prev.previous = child
                        }
                        i += handleExpr(exprList, expr.index, idx)
                        prev = child
                        i++
                    }
                }
            } else {
                throw ArrayIndexOutOfBoundsException("Failed to fetch expr @ ${idx.get()}.")
            }
            return pops
        }

        private fun createExpr(insn: AbstractInsnNode, index: Int, size: Int): Expr {
            return Expr(insn, index, size)
        }
    }
}