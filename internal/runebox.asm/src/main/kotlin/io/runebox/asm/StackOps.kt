@file:Suppress("MemberVisibilityCanBePrivate", "UnclearPrecedenceOfBinaryExpression")

package io.runebox.asm

import io.runebox.asm.core.isDoubleOrLong
import io.runebox.asm.util.T
import io.runebox.asm.util.isDoubleOrLong
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type
import org.objectweb.asm.tree.*
import org.objectweb.asm.tree.AbstractInsnNode.*

data class StackOps(val pops: Int, val pushes: Int) {
    companion object {
        val NONE = StackOps(pops = 0, pushes = 0)
        val POP1 = StackOps(pops = 1, pushes = 0)
        val POP2 = StackOps(pops = 2, pushes = 0)
        val POP3 = StackOps(pops = 3, pushes = 0)
        val POP4 = StackOps(pops = 4, pushes = 0)
        val PUSH1 = StackOps(pops = 0, pushes = 1)
        val PUSH2 = StackOps(pops = 0, pushes = 2)
        val POP1_PUSH1 = StackOps(pops = 1, pushes = 1)
        val POP1_PUSH2 = StackOps(pops = 1, pushes = 2)
        val POP2_PUSH1 = StackOps(pops = 2, pushes = 1)
        val POP2_PUSH2 = StackOps(pops = 2, pushes = 2)
        val POP2_PUSH3 = StackOps(pops = 2, pushes = 3)
        val POP2_PUSH4 = StackOps(pops = 2, pushes = 4)
        val POP3_PUSH2 = StackOps(pops = 3, pushes = 2)
        val POP3_PUSH4 = StackOps(pops = 3, pushes = 4)
        val POP3_PUSH5 = StackOps(pops = 3, pushes = 5)
        val POP4_PUSH1 = StackOps(pops = 4, pushes = 1)
        val POP4_PUSH2 = StackOps(pops = 4, pushes = 2)
        val POP4_PUSH6 = StackOps(pops = 4, pushes = 6)

        val OPCODES = mapOf(
            -1 to NONE,
            NOP to NONE,
            ACONST_NULL to PUSH1,
            ICONST_M1 to PUSH1,
            ICONST_0 to PUSH1,
            ICONST_1 to PUSH1,
            ICONST_2 to PUSH1,
            ICONST_3 to PUSH1,
            ICONST_4 to PUSH1,
            ICONST_5 to PUSH1,
            LCONST_0 to PUSH2,
            LCONST_1 to PUSH2,
            FCONST_0 to PUSH1,
            FCONST_1 to PUSH1,
            FCONST_2 to PUSH1,
            DCONST_0 to PUSH2,
            DCONST_1 to PUSH2,
            BIPUSH to PUSH1,
            SIPUSH to PUSH1,
            LDC to PUSH1,
            ILOAD to PUSH1,
            LLOAD to PUSH2,
            FLOAD to PUSH1,
            DLOAD to PUSH2,
            ALOAD to PUSH1,
            IALOAD to POP2_PUSH1,
            LALOAD to POP2_PUSH2,
            FALOAD to POP2_PUSH1,
            DALOAD to POP2_PUSH2,
            AALOAD to POP2_PUSH1,
            BALOAD to POP2_PUSH1,
            CALOAD to POP2_PUSH1,
            SALOAD to POP2_PUSH1,
            ISTORE to POP1,
            LSTORE to POP2,
            FSTORE to POP1,
            DSTORE to POP2,
            ASTORE to POP1,
            IASTORE to POP3,
            LASTORE to POP4,
            FASTORE to POP3,
            DASTORE to POP4,
            AASTORE to POP3,
            BASTORE to POP3,
            CASTORE to POP3,
            SASTORE to POP3,
            POP to POP1,
            POP2 to POP2,
            DUP to POP1_PUSH2,
            DUP_X1 to POP2_PUSH3,
            DUP_X2 to POP3_PUSH4,
            DUP2 to POP2_PUSH4,
            DUP2_X1 to POP3_PUSH5,
            DUP2_X2 to POP4_PUSH6,
            SWAP to POP2_PUSH2,
            IADD to POP2_PUSH1,
            LADD to POP4_PUSH2,
            FADD to POP2_PUSH1,
            DADD to POP4_PUSH2,
            ISUB to POP2_PUSH1,
            LSUB to POP4_PUSH2,
            FSUB to POP2_PUSH1,
            DSUB to POP4_PUSH2,
            IMUL to POP2_PUSH1,
            LMUL to POP4_PUSH2,
            FMUL to POP2_PUSH1,
            DMUL to POP4_PUSH2,
            IDIV to POP2_PUSH1,
            LDIV to POP4_PUSH2,
            FDIV to POP2_PUSH1,
            DDIV to POP4_PUSH2,
            IREM to POP2_PUSH1,
            LREM to POP4_PUSH2,
            FREM to POP2_PUSH1,
            DREM to POP4_PUSH2,
            INEG to POP1_PUSH1,
            LNEG to POP2_PUSH2,
            FNEG to POP1_PUSH1,
            DNEG to POP2_PUSH2,
            ISHL to POP2_PUSH1,
            LSHL to POP3_PUSH2,
            ISHR to POP2_PUSH1,
            LSHR to POP3_PUSH2,
            IUSHR to POP2_PUSH1,
            LUSHR to POP3_PUSH2,
            IAND to POP2_PUSH1,
            LAND to POP4_PUSH2,
            IOR to POP2_PUSH1,
            LOR to POP4_PUSH2,
            IXOR to POP2_PUSH1,
            LXOR to POP4_PUSH2,
            IINC to NONE,
            I2L to POP1_PUSH2,
            I2F to POP1_PUSH1,
            I2D to POP1_PUSH2,
            L2I to POP2_PUSH1,
            L2F to POP2_PUSH1,
            L2D to POP2_PUSH2,
            F2I to POP1_PUSH1,
            F2L to POP1_PUSH2,
            F2D to POP1_PUSH2,
            D2I to POP2_PUSH1,
            D2L to POP2_PUSH2,
            D2F to POP2_PUSH1,
            I2B to POP1_PUSH1,
            I2C to POP1_PUSH1,
            I2S to POP1_PUSH1,
            LCMP to POP4_PUSH1,
            FCMPL to POP2_PUSH1,
            FCMPG to POP2_PUSH1,
            DCMPL to POP4_PUSH1,
            DCMPG to POP4_PUSH1,
            IFEQ to POP1,
            IFNE to POP1,
            IFLT to POP1,
            IFGE to POP1,
            IFGT to POP1,
            IFLE to POP1,
            IF_ICMPEQ to POP2,
            IF_ICMPNE to POP2,
            IF_ICMPLT to POP2,
            IF_ICMPGE to POP2,
            IF_ICMPGT to POP2,
            IF_ICMPLE to POP2,
            IF_ACMPEQ to POP2,
            IF_ACMPNE to POP2,
            GOTO to NONE,
            JSR to PUSH1,
            RET to NONE,
            TABLESWITCH to POP1,
            LOOKUPSWITCH to POP1,
            IRETURN to POP1,
            LRETURN to POP2,
            FRETURN to POP1,
            DRETURN to POP2,
            ARETURN to POP1,
            RETURN to NONE,
            GETSTATIC to NONE,
            PUTSTATIC to NONE,
            GETFIELD to NONE,
            PUTFIELD to NONE,
            INVOKEVIRTUAL to NONE,
            INVOKESPECIAL to NONE,
            INVOKESTATIC to NONE,
            INVOKEINTERFACE to NONE,
            INVOKEDYNAMIC to NONE,
            NEW to PUSH1,
            NEWARRAY to POP1_PUSH1,
            ANEWARRAY to POP1_PUSH1,
            ARRAYLENGTH to POP1_PUSH1,
            ATHROW to POP1_PUSH1,
            CHECKCAST to POP1_PUSH1,
            INSTANCEOF to POP1_PUSH1,
            MONITORENTER to POP1,
            MONITOREXIT to POP1,
            MULTIANEWARRAY to NONE,
            IFNULL to POP1,
            IFNONNULL to POP1,
        )

        val AbstractInsnNode.stackOps: StackOps get() {
            var pops = 0
            var pushes = 0
            when(type) {
                INSN, INT_INSN, VAR_INSN, TYPE_INSN, JUMP_INSN, TABLESWITCH_INSN, LOOKUPSWITCH_INSN -> {
                    pops = OPCODES[opcode]!!.pops
                    pushes = OPCODES[opcode]!!.pushes
                }
                FIELD_INSN -> {
                    this is FieldInsnNode
                    when(opcode) {
                        GETSTATIC -> pushes = isDoubleOrLong T 2 ?: 1
                        GETFIELD -> {
                            pops = 1
                            pushes = isDoubleOrLong T 2 ?: 1
                        }
                        PUTSTATIC -> pops = isDoubleOrLong T 2 ?: 1
                        PUTFIELD -> pops = isDoubleOrLong T 3 ?: 2
                    }
                }
                METHOD_INSN -> {
                    this as MethodInsnNode
                    val args = Type.getArgumentsAndReturnSizes(desc)
                    pops = when (opcode) {
                        INVOKESTATIC, INVOKEDYNAMIC -> (args shr 2) - 1
                        else -> args shr 2
                    }
                    pushes = args and 0x3
                }
                LDC_INSN -> {
                    this as LdcInsnNode
                    pushes = cst.isDoubleOrLong T 2 ?: 1
                }
                MULTIANEWARRAY_INSN -> {
                    this as MultiANewArrayInsnNode
                    pops = dims
                    pushes = 1
                }
                LABEL, IINC_INSN, FRAME, LINE -> { /* Do Nothing */ }
                else -> throw RuntimeException("Unhandled instruction type: $type.")
            }

            return StackOps(pops, pushes)
        }
    }
}

