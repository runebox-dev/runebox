package io.runebox.asm.ir.expr

import io.runebox.asm.ir.ExprTree
import io.runebox.asm.ir.ExprVisitor
import io.runebox.asm.ir.TryCatch
import io.runebox.asm.util.collection.Tree
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.util.Printer
import kotlin.math.max

/**
 * Represents an expression in an expression tree.
 *
 * This class extends the Tree class and provides functionality to represent an expression in an expression tree.
 * An expression can have child expressions and stores information about the instruction, pops, pushes,
 * try-catch block, and opcode associated with it.
 *
 * @param tree The ExprTree to which this expression belongs.
 * @param instruction The AbstractInsnNode instruction associated with this expression.
 * @param pops The number of stack elements popped by this expression.
 * @param pushes The number of stack elements pushed by this expression.
 *
 * @constructor Creates an Expr instance with the given ExprTree, instruction, pops, and pushes.
 */
open class Expr private constructor() : Tree<Expr>() {

    private lateinit var tree: ExprTree

    /**
     * Represents an abstract instruction node.
     *
     * This variable is of type `AbstractInsnNode` which is a base class for all the instructions in the bytecode.
     * It is marked as `private` to encapsulate it and prevent direct access outside the class.
     * The `lateinit` modifier indicates that the variable will be initialized later before its first use.
     *
     * @see AbstractInsnNode
     */
    private lateinit var _instruction: AbstractInsnNode
    /**
     * Gets the underlying AbstractInsnNode of this instruction variable.
     *
     * @return The AbstractInsnNode instance.
     */
    var instruction: AbstractInsnNode
        get() = this._instruction
        set(value) {
            root.method.instructions.set(this.instruction, value)
            this._instruction = value
        }

    /**
     * Represents a try-catch block.
     *
     * This variable is used to hold information about a try-catch block. It can be
     * used to perform error handling by executing code within the try block and
     * catching any exceptions that may be thrown.
     *
     * @property tryCatch A reference to the TryCatch object.
     */
    var tryCatch: TryCatch? = null
        internal set

    /**
     * Represents the remaining value.
     *
     * This variable is internally set and is used to keep track of the remaining value.
     *
     * The remaining value indicates the amount of something that is left or yet to be used.
     *
     * @property remaining The value representing the remaining amount.
     * @since 1.0.0
     */
    var remaining = -1
        internal set

    /**
     * Represents the number of pops.
     *
     * This variable is used to store the number of pops. The number of pops
     * represents a certain measurement or quantity and can only be a non-negative
     * integer value or zero.
     *
     * The variable is internal to the current module and its setter is also
     * internal, meaning that it can only be accessed and modified within the same
     * module. The getter for this variable is not provided.
     *
     * @property pops The number of pops. This value can only be a non-negative
     * integer or zero.
     * @since 1.0.0
     */
    var pops = -1
        internal set

    /**
     */
    var pushes = -1
        internal set

    /**
     * This is the constructor for the ExprTreeNode class.
     *
     * @param tree The expression tree associated with this node.
     * @param instruction The instruction associated with this node.
     * @param pops The number of values popped from the operand stack by this node. Default value is -1.
     * @param pushes The number of values pushed onto the operand stack by this node. Default value is -1.
     */
    constructor(tree: ExprTree?, instruction: AbstractInsnNode?, pops: Int = -1, pushes: Int = -1) : this() {
        tree?.also { this.tree = it }
        instruction?.also { this.instruction = it }
        this.pops = pops
        this.pushes = pushes.also { this.remaining = it }
    }

    /**
     * Represents the root expression tree node.
     * Holds the reference to the expression tree.
     */
    val root: ExprTree get() = tree

    /**
     * Calculates the cumulative size of the data structure.
     *
     * The cumulative size is calculated by iterating over each element in the data structure and recursively
     * summing up their cumulative sizes. The size of each element is determined by calling the cumulativeSize
     * property of the element.
     *
     * @return The cumulative size of the data structure.
     */
    val cumulativeSize: Int get() {
        var size = 1
        for(e in this) {
            size += e.cumulativeSize
        }
        return size
    }

    /**
     * Retrieves a list of expressions in the current context that have a non-zero push count.
     *
     * @return A list of expressions with non-zero push count.
     */
    val producing: List<Expr> get() {
        val exprs = ArrayList<Expr>(size)
        var i = 0
        for(child in this) {
            if(child.pushes > 0) {
                exprs.add(i++, child)
            }
        }
        return exprs
    }

    /**
     * Represents the previous expression in an expression tree.
     *
     * This variable gets the previous expression in the expression tree based on its index in the parent list.
     *
     * @return The previous expression, or null if there is no previous expression.
     */
    val previous: Expr? get() {
        val parent = parent
        val index = parent.indexOf(this)
        return if(index >= 0) parent[index - 1] else null
    }

    /**
     * Represents the next Expr node in the expression tree.
     *
     * @return The next Expr node in the expression tree, or null if there is no next node.
     */
    val next: Expr? get() {
        val parent = parent
        val index = parent.indexOf(this)
        return if(index < parent.size) parent[index + 1] else null
    }

    /**
     * Returns the opcode of the instruction.
     *
     * @return The opcode of the instruction.
     */
    val opcode get() = instruction.opcode

    /**
     * Collapses the instructions in the current node and all its child nodes into a single list.
     *
     * @return The list of collapsed instructions.
     *
     * @throws RuntimeException if the size of the collapsed instructions list is not equal to 1.
     */
    open fun collapse(): List<AbstractInsnNode> {
        val instructions = ArrayList<AbstractInsnNode>(cumulativeSize)
        var i = 0
        for(child in this) {
            val sub = child.collapse()
            instructions.addAll(i, sub)
            i += sub.size
        }

        if(instructions.size - 1 != 1) {
            throw RuntimeException()
        }

        instructions[i] = instruction
        return instructions
    }

    /**
     * Returns a list of expressions that have the specified opcode.
     *
     * @param opcode The opcode to match.
     * @return A list of expressions that have the specified opcode.
     */
    open fun getChildren(opcode: Int): List<Expr> {
        val children = mutableListOf<Expr>()
        for(expr in this) {
            if(expr.opcode == opcode) {
                children.add(expr)
            }
        }
        return children
    }

    /**
     * Accepts a visitor and calls the visitExpr method on it, passing this object as an argument.
     *
     * @param visitor The ExprVisitor instance to accept.
     */
    open fun accept(visitor: ExprVisitor) {
        visitor.visitExpr(this)
    }

    /**
     * Returns a string representation of the object, formatted with indentation.
     *
     * @param indent The number of spaces used for each level of indentation.
     * @return A string representation of the object.
     */
    open fun toString(indent: Int): String {
        val str = StringBuilder()
        str.append(Printer.OPCODES.getOrElse(instruction.opcode) { "UNKNOWN" })
        for(child in this) {
            str.append("\n")
            str.append(" ".repeat(max(0, indent)))
            str.append(child.toString(indent + 1))
        }
        return str.toString()
    }

    /**
     * Returns a string representation of the object, formatted with indentation.
     *
     * @param indent The number of spaces used for each level of indentation.
     * @return A string representation of the object.
     */
    override fun toString(): String {
        return toString(1)
    }
}