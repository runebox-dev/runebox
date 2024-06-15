package io.runebox.asm.core

import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type
import org.objectweb.asm.tree.*

val AbstractInsnNode.isDoubleOrLong: Boolean get() {
    when(opcode) {
        in listOf(
            LCONST_0, LCONST_1, DCONST_0, DCONST_1,
            I2L, F2L, D2L, L2D, F2D, I2D,
            LADD, LSUB, LMUL, LDIV, DADD, DSUB, DMUL, DDIV,
            LOR, LAND, LREM, LNEG, LSHL, LSHR,
            LLOAD, DLOAD,
            LSTORE, DSTORE
        ) -> return true
        GETFIELD, GETSTATIC -> {
            this as FieldInsnNode
            return desc == "J" || desc == "D"
        }
        INVOKESTATIC, INVOKEVIRTUAL, INVOKEDYNAMIC -> {
            this as MethodInsnNode
            return desc.endsWith(")J") || desc.endsWith(")D")
        }
        LDC -> {
            this as LdcInsnNode
            if(cst != null && (cst is Long || cst is Double)) return true
        }
    }
    return false
}

val AbstractInsnNode.isReturn: Boolean get() = opcode in IRETURN .. RETURN

val AbstractInsnNode.isTerminal: Boolean get() {
    return this is JumpInsnNode
            || this is TableSwitchInsnNode
            || this is LookupSwitchInsnNode
            || this.isReturn
            || opcode == ATHROW
}

val AbstractInsnNode.pops: Int get() {
    return when(opcode) {
        NOP -> 0
        in ACONST_NULL..LDC -> 0
        in ILOAD..ALOAD -> 0
        in IALOAD..SALOAD -> 2
        in ISTORE..ASTORE -> 1
        in IASTORE..SASTORE -> 3
        POP -> 1
        POP2 -> if(previous.isDoubleOrLong) 1 else 2
        DUP -> 1
        DUP_X1 -> 2
        DUP_X2 -> {
            if(!previous.isDoubleOrLong) {
                if(!previous.previous.isDoubleOrLong) {
                    if(!previous.previous.previous.isDoubleOrLong) {
                        return 3
                    }
                } else {
                    return 2
                }
            }
            error("Illegal DUP_X2")
        }
        DUP2 -> {
            if(!previous.isDoubleOrLong) {
                if(!previous.previous.isDoubleOrLong) {
                    return 2
                }
            } else {
                return 1
            }
            error("Illegal DUP2")
        }
        DUP2_X1 -> {
            if(!previous.isDoubleOrLong) {
                if(!previous.previous.isDoubleOrLong) {
                    if(!previous.previous.previous.isDoubleOrLong) {
                        return 3
                    }
                }
            } else {
                return if(!previous.previous.isDoubleOrLong) {
                    2
                } else {
                    3
                }
            }
            error("Illegal DUP2_X1")
        }
        DUP2_X2 -> {
            if(!previous.isDoubleOrLong) {
                if(!previous.previous.isDoubleOrLong) {
                    if(!previous.previous.previous.isDoubleOrLong) {
                        if(!previous.previous.previous.previous.isDoubleOrLong) {
                            return 4
                        }
                    } else {
                        return 3
                    }
                }
            } else {
                if(!previous.previous.isDoubleOrLong) {
                    if(!previous.previous.previous.isDoubleOrLong) {
                        return 3
                    }
                } else {
                    return 2
                }
            }
            error("Illegal DUP2_X2")
        }
        SWAP -> 2
        in IADD..DREM -> 2
        in INEG..DNEG -> 1
        in ISHL..LXOR -> 2
        IINC -> 1
        in I2L..I2S -> 1
        in LCMP..DCMPG -> 2
        in IFEQ..IFLE -> 1
        in IF_ICMPEQ..IF_ACMPNE -> 2
        GOTO -> 0
        JSR -> 0
        RET -> 0
        in TABLESWITCH..LOOKUPSWITCH -> 1
        in IRETURN..ARETURN -> 1
        RETURN -> 0
        GETSTATIC -> 0
        PUTSTATIC -> 1
        GETFIELD -> 1
        PUTFIELD -> 2
        in INVOKEVIRTUAL..INVOKEDYNAMIC -> {
            this as MethodInsnNode
            var count = 0
            for (i in Type.getArgumentTypes(desc).size downTo 1) count++
            if(opcode != INVOKESTATIC) count++
            count
        }
        NEW -> 0
        in NEWARRAY..ARRAYLENGTH -> 1
        ATHROW -> 1
        in CHECKCAST..INSTANCEOF -> 1
        in MONITORENTER..MONITOREXIT -> 1
        MULTIANEWARRAY -> (this as MultiANewArrayInsnNode).dims
        in IFNULL..IFNONNULL -> 1
        else -> {
            if(this is LabelNode || this is LineNumberNode || this is FrameNode) 0
            else throw IllegalStateException("Illegal opcode $opcode - $this.")
        }
    }
}