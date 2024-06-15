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

fun resolveSize(insn: AbstractInsnNode): Int {
    when (insn.opcode) {
        NOP -> {
            return 0
        }

        ACONST_NULL, ICONST_M1, ICONST_0, ICONST_1, ICONST_2, ICONST_3, ICONST_4, ICONST_5, LCONST_0, LCONST_1, FCONST_0, FCONST_1, FCONST_2, DCONST_0, DCONST_1, BIPUSH, SIPUSH, LDC -> {
            return 0
        }

        ILOAD, LLOAD, FLOAD, DLOAD, ALOAD -> {
            return 0
        }

        IALOAD, LALOAD, FALOAD, DALOAD, AALOAD, BALOAD, CALOAD, SALOAD -> {
            return 2
        }

        ISTORE, LSTORE, FSTORE, DSTORE, ASTORE -> {
            return 1
        }

        IASTORE, LASTORE, FASTORE, DASTORE, AASTORE, BASTORE, CASTORE, SASTORE -> {
            return 3
        }

        POP -> {
            return 1
        }

        POP2 -> {
            if (insn.previous.isDoubleOrLong) {
                return 1
            }
            return 2
        }

        DUP -> {
            return 1
        }

        DUP_X1 -> {
            return 2
        }

        DUP_X2 -> {
            var size2: Boolean = insn.previous.isDoubleOrLong
            if (!size2) {
                size2 = insn.previous.previous.isDoubleOrLong
                if (!size2) {
                    size2 = insn.previous.previous.previous.isDoubleOrLong
                    if (!size2) {
                        return 3
                    }
                } else {
                    return 2
                }
            }
            throw IllegalStateException("Illegal use of DUP_X2 @ $insn")
        }

        DUP2 -> {
            var size2: Boolean = insn.previous.isDoubleOrLong
            if (!size2) {
                size2 = insn.previous.previous.isDoubleOrLong
                if (!size2) {
                    return 2
                }
            } else {
                return 1
            }
            throw java.lang.IllegalStateException("Illegal use of DUP2 @ $insn")
        }

        DUP2_X1 -> {
            var size2: Boolean = insn.previous.isDoubleOrLong
            if (!size2) {
                size2 = insn.previous.previous.isDoubleOrLong
                if (!size2) {
                    size2 = insn.previous.previous.previous.isDoubleOrLong
                    if (!size2) {
                        return 3
                    }
                }
            } else {
                size2 = insn.previous.previous.isDoubleOrLong
                return if (!size2) {
                    2
                } else {
                    3
                }
            }
            throw java.lang.IllegalStateException("Illegal use of DUP2_X1 @ $insn")
        }

        DUP2_X2 -> {
            var size2: Boolean = insn.previous.isDoubleOrLong
            if (!size2) {
                size2 = insn.previous.previous.isDoubleOrLong
                if (!size2) {
                    size2 = insn.previous.previous.previous.isDoubleOrLong
                    if (!size2) {
                        size2 = insn.previous.previous.previous.previous.isDoubleOrLong
                        if (!size2) {
                            return 4
                        }
                    } else {
                        return 3
                    }
                }
            } else {
                size2 = insn.previous.previous.isDoubleOrLong
                if (!size2) {
                    size2 = insn.previous.previous.previous.isDoubleOrLong
                    if (!size2) {
                        return 3
                    }
                } else {
                    return 2
                }
            }
            throw java.lang.IllegalStateException("Illegal use of DUP2_X2 @ $insn")
        }

        SWAP -> {
            return 2
        }

        IADD, LADD, FADD, DADD, ISUB, LSUB, FSUB, DSUB, IMUL, LMUL, FMUL, DMUL, IDIV, LDIV, FDIV, DDIV, IREM, LREM, FREM, DREM -> {
            return 2
        }

        INEG, LNEG, FNEG, DNEG -> {
            return 1
        }

        ISHL, LSHL, ISHR, LSHR, IUSHR, LUSHR, IAND, LAND, IOR, LOR, IXOR, LXOR -> {
            return 2
        }

        IINC -> {
            return 1
        }

        I2L, I2F, I2D, L2I, L2F, L2D, F2I, F2L, F2D, D2I, D2L, D2F, I2B, I2C, I2S -> {
            return 1
        }

        LCMP, FCMPL, FCMPG, DCMPL, DCMPG -> {
            return 2
        }

        IFEQ, IFNE, IFLT, IFGE, IFGT, IFLE -> {
            return 1
        }

        IF_ICMPEQ, IF_ICMPNE, IF_ICMPLT, IF_ICMPGE, IF_ICMPGT, IF_ICMPLE, IF_ACMPEQ, IF_ACMPNE -> {
            return 2
        }

        GOTO -> {
            return 0
        }

        JSR -> {
            return 0
        }

        RET -> {
            return 0
        }

        TABLESWITCH, LOOKUPSWITCH -> {
            return 1
        }

        IRETURN, LRETURN, FRETURN, DRETURN, ARETURN -> {
            return 1
        }

        RETURN -> {
            return 0
        }

        GETSTATIC -> {
            return 0
        }

        PUTSTATIC -> {
            return 1
        }

        GETFIELD -> {
            return 1
        }

        PUTFIELD -> {
            return 2
        }

        INVOKEVIRTUAL, INVOKESPECIAL, INVOKESTATIC, INVOKEINTERFACE, INVOKEDYNAMIC -> {
            val desc = (insn as MethodInsnNode).desc
            var count = 0
            var i = Type.getArgumentTypes(desc).size
            while (i > 0) {
                count++
                --i
            }
            if (insn.getOpcode() != INVOKESTATIC) {
                count++
            }
            return count
        }

        NEW -> {
            return 0
        }

        NEWARRAY, ANEWARRAY, ARRAYLENGTH -> {
            return 1
        }

        ATHROW -> {
            return 1
        }

        CHECKCAST, INSTANCEOF -> {
            return 1
        }

        MONITORENTER, MONITOREXIT -> {
            return 1
        }

        MULTIANEWARRAY -> {
            return (insn as MultiANewArrayInsnNode).dims
        }

        IFNULL, IFNONNULL -> {
            return 1
        }

        else -> {
            if (insn is LabelNode) {
                return 0
            } else if (insn is LineNumberNode) {
                return 0
            }
            throw RuntimeException(("Illegal opcode " + insn.opcode).toString() + " - " + insn)
        }
    }
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
                if(!previous.previous.isDoubleOrLong) {
                    return 2
                } else {
                    return 3
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
            return 0
        }
    }
}