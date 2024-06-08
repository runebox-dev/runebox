package io.runebox.asm.expr

import io.runebox.asm.StackOps.Companion.stackOps
import io.runebox.asm.core.nextReal
import io.runebox.asm.util.T
import org.objectweb.asm.Opcodes.ATHROW
import org.objectweb.asm.Opcodes.MONITOREXIT
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.AbstractInsnNode.LABEL
import org.objectweb.asm.tree.MethodNode
import java.util.*

/**
 * Represents an expression tree for a given method.
 *
 * This class extends the Expr class and provides functionality to build an expression tree
 * based on the instructions of a MethodNode.
 *
 * @property method The MethodNode representing the method for which the expression tree is built.
 * @property exprs A linked list of Expr nodes representing the expressions in the tree.
 * @property ptr An integer representing the current position in the instructions array.
 *
 * @constructor Creates an ExprTree instance with the given MethodNode.
 */
class ExprTree(val method: MethodNode) : Expr(null, null, -1, -1) {

    private var exprs: LinkedList<Expr> = LinkedList()
    private var ptr: Int = 0

    /**
     * Collapses the expression tree into a list of AbstractInsnNode instructions.
     *
     * @return List of AbstractInsnNode instructions representing the collapsed expression tree.
     */
    override fun collapse(): List<AbstractInsnNode> {
        val instructions = super.collapse()
        val offset = (instructions.size > 1 && instructions[instructions.size - 2].type == LABEL) T 2 ?: 1
        return mutableListOf<AbstractInsnNode>().also { it.addAll(instructions) }.dropLast(offset)
    }

    /**
     * Builds the expression tree by iterating over the MethodNode instructions.
     */
    fun build() {
        val instructions = method.instructions.toArray()
        exprs = LinkedList()

        for(i in instructions.indices) {
            val instruction = instructions[i]
            val opcode = instruction.opcode
            val stackOps = instruction.stackOps
            exprs.add(i, createExpr(instruction, opcode, stackOps.pops, stackOps.pushes))
        }

        ptr = instructions.size - 1

        for(tcb in method.tryCatchBlocks) {
            val start = tcb.start.nextReal
            val end = tcb.end.nextReal
            val handler = tcb.handler.nextReal
            for(expr in exprs) {
                val instruction = expr.instruction
                expr.tryCatch = TryCatch(
                    instruction == start,
                    instruction == end,
                    instruction == handler
                )
            }
        }

        while(true) {
            val next = seek() ?: break
            addFirst(next)
        }
    }

    /**
     * Creates an Expr instance based on the given instruction, opcode, pops, and pushes.
     *
     * @param instruction The AbstractInsnNode instruction.
     * @param opcode The opcode of the instruction.
     * @param pops The number of stack elements popped by the instruction.
     * @param pushes The number of stack elements pushed by the instruction.
     * @return The created Expr instance.
     */
    private fun createExpr(instruction: AbstractInsnNode, opcode: Int, pops: Int, pushes: Int): Expr {
        return Expr(this, instruction, pops, pushes)
    }

    /**
     * Seeks and returns the next Expr in the expression tree.
     *
     * @return The next Expr in the expression tree, or null if not found.
     */
    private fun seek(): Expr? {
        if(ptr < 0) return null

        val expr = exprs[ptr--]
        if(expr.pops == 0) {
            return expr
        }

        var pops = expr.pops
        while(pops != 0) {
            val child = seek() ?: break
            if(child.opcode == MONITOREXIT && expr.opcode == ATHROW) {
                child.pushes = 1
            }

            expr.addFirst(child)

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
}