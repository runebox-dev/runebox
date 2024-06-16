package io.runebox.asm.expr

import hu.webarticum.treeprinter.SimpleTreeNode
import hu.webarticum.treeprinter.decorator.BorderTreeNodeDecorator
import hu.webarticum.treeprinter.printer.listing.ListingTreePrinter
import io.runebox.asm.core.toRef
import io.runebox.asm.print
import io.runebox.asm.stackMetadata
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type
import org.objectweb.asm.tree.*
import org.objectweb.asm.tree.AbstractInsnNode.*
import java.util.*

class ExprTree(val method: MethodNode) : Iterable<Expr> {

    private var exprs = LinkedList<Expr>()
    private var ptr = -1

    init {
        build()
        exprs.forEach { it.tree = this }
    }

    override fun iterator(): Iterator<Expr> {
        return exprs.iterator()
    }

    fun accept(visitor: ExprVisitor) {
        for(expr in this) accept(visitor, expr)
    }

    fun accept(visitor: ExprVisitor, expr: Expr) {
        for(child in expr) accept(visitor, child)
        expr.accept(visitor)
    }

    operator fun get(index: Int) = exprs[index]

    fun indexOf(expr: Expr) = exprs.indexOf(expr)

    val instructions: List<AbstractInsnNode> get() {
        val insns = mutableListOf<AbstractInsnNode>()
        for(expr in this) {
            insns.addAll(expr.collapse())
        }
        return insns
    }

    private fun build() {
        val insns = method.instructions.toArray()
        exprs = LinkedList()
        repeat(insns.size) { exprs.add(Expr(InsnNode(NOP))) }

        for(i in insns.indices) {
            val insn = insns[i]
            val opcode = insn.opcode
            val type = insn.type
            var pops = 0
            var pushes = 0
            when(type) {
                INSN, INT_INSN, VAR_INSN, TYPE_INSN, JUMP_INSN, TABLESWITCH_INSN, LOOKUPSWITCH_INSN -> {
                    val stackMetadata = insn.stackMetadata
                    pops = stackMetadata.pops
                    pushes = stackMetadata.pushes
                }
                FIELD_INSN -> {
                    val f = (insn as FieldInsnNode).desc[0]
                    when(opcode) {
                        GETSTATIC -> pushes = if(f.isDoubleOrLong) 2 else 1
                        GETFIELD -> {
                            pops = 1
                            pushes = if(f.isDoubleOrLong) 2 else 1
                        }
                        PUTSTATIC -> pops = if(f.isDoubleOrLong) 2 else 1
                        PUTFIELD -> pops = if(f.isDoubleOrLong) 3 else 2
                    }
                }
                METHOD_INSN -> {
                    val args = Type.getArgumentsAndReturnSizes((insn as MethodInsnNode).desc)
                    if(opcode == INVOKESTATIC || opcode == INVOKEDYNAMIC) {
                        pops = (args shr 2) - 1
                    } else {
                        pops = args shr 2
                    }
                    pushes = args and 0x3
                }
                LDC_INSN -> {
                    val cst = (insn as LdcInsnNode).cst
                    pushes = if(cst is Long || cst is Double) 2 else 1
                }
                MULTIANEWARRAY_INSN -> {
                    pops = (insn as MultiANewArrayInsnNode).dims
                    pushes = 1
                }
                LABEL, FRAME, LINE, IINC_INSN -> { /* Nothing */ }
                else -> throw RuntimeException()
            }

            exprs[i] = createExpr(insn, opcode, pops, pushes)
        }

        ptr = insns.size - 1

        val exprList = LinkedList<Expr>()
        var prev: Expr? = null
        while(true) {
            val next = seek() ?: break
            next.next = prev
            prev?.previous = next
            prev = next
            exprList.addFirst(next)
        }
        exprs = exprList
    }

    private fun seek(): Expr? {
        if(ptr < 0) return null

        val expr = exprs[ptr--]
        if(expr.pops == 0) return expr

        var pops = expr.pops
        while(pops != 0) {
            val child = seek() ?: break
            if(child.insn.opcode == MONITOREXIT && expr.insn.opcode == ATHROW) {
                child.pushes = 1
            }
            expr.addChild(child)
            val delta = pops - child.pushes
            if(delta < 0) {
                expr.pushes -= delta
                child.pushes = 0
                break
            }
            pops -= child.pushes
            child.pushes = 0
        }

        return expr
    }

    private fun createExpr(insn: AbstractInsnNode, opcode: Int, pops: Int, pushes: Int): Expr {
        return when {
            insn is LabelNode -> LabelExpr(insn, pops, pushes)
            insn is LineNumberNode -> LineExpr(insn, pops, pushes)
            opcode in ICONST_M1..LDC -> ConstExpr(insn, pops, pushes)
            opcode == GOTO -> GotoExpr(insn as JumpInsnNode, pops, pushes)
            opcode in GETSTATIC..PUTFIELD -> FieldExpr(insn as FieldInsnNode, pops, pushes)
            insn is MethodInsnNode -> MethodExpr(insn, pops, pushes)
            opcode in IFEQ..IFLE -> IfExpr(insn as JumpInsnNode, pops, pushes)
            opcode in IF_ICMPEQ..IF_ACMPNE -> IfCmpExpr(insn as JumpInsnNode, pops, pushes)
            opcode in IADD..LXOR -> MathExpr(insn, pops, pushes)
            opcode in ILOAD..ALOAD -> VarLoadExpr(insn as VarInsnNode, pops, pushes)
            opcode in ISTORE..ASTORE -> VarStoreExpr(insn as VarInsnNode, pops, pushes)
            else -> Expr(insn, pops, pushes)
        }
    }

    private val Char.isDoubleOrLong: Boolean get() = this == 'D' || this == 'J'

    fun prettyPrint() {
        val root = SimpleTreeNode("ExprTree: [${method.toRef()}]")
        for(expr in this) {
            prettyPrintExpr(expr, root)
        }
        ListingTreePrinter().print(BorderTreeNodeDecorator(root))
    }

    private fun prettyPrintExpr(expr: Expr, node: SimpleTreeNode) {
        val str = StringBuilder()
        str.appendLine(expr.toString()+" : "+expr.insn.print().trim())
        str.appendLine()
        for(child in expr) {
            str.appendLine(child.insn.print().trim())
        }
        val n = SimpleTreeNode(str.toString())
        node.addChild(n)
    }
}