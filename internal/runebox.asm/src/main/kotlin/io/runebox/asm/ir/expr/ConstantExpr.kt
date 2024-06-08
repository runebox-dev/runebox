@file:Suppress("UNCHECKED_CAST")

package io.runebox.asm.ir.expr

import io.runebox.asm.ir.ExprTree
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.IntInsnNode
import org.objectweb.asm.tree.LdcInsnNode

open class ConstantExpr<T>(
    tree: ExprTree,
    instruction: AbstractInsnNode,
    pops: Int,
    pushes: Int
) : Expr(tree, instruction, pops, pushes) {

    open val value: T? get() {
        val insn = instruction
        val op = insn.opcode
        when(op) {
            NEWARRAY, BIPUSH, SIPUSH -> {
                insn as IntInsnNode
                return insn.operand as T
            }
            in ICONST_M1 .. ICONST_5 -> op - ICONST_0
            in LCONST_0 .. LCONST_1 -> op - LCONST_0
            in FCONST_0 .. FCONST_2 -> op - FCONST_0
            in DCONST_0 .. DCONST_1 -> op - DCONST_0
            LDC -> {
                insn as LdcInsnNode
                val cst = insn.cst
                return if(cst is Number) when (cst) {
                    is Int -> cst as T
                    is Long -> cst as T
                    else -> cst as T
                } else {
                    cst as T?
                }
            }
        }
        return null
    }

    val isNumber get() = value is Number
    val isInteger get() = value is Int
    val isLong get() = value is Long


}