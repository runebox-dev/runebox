package io.runebox.asm

import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.InsnList
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.util.Printer

class InsnMatcher private constructor(private val regex: Regex) {

    fun match(method: MethodNode): Sequence<List<AbstractInsnNode>> {
        return match(method.instructions)
    }

    fun match(list: InsnList): Sequence<List<AbstractInsnNode>> {
        val insns = ArrayList<AbstractInsnNode>(list.size())
        val builder = StringBuilder(list.size())
        for (instruction in list) {
            if (instruction.opcode != -1) {
                insns += instruction
                builder.append(opcodeToCodepoint(instruction.opcode))
            }
        }
        return regex.findAll(builder).map {
            insns.subList(it.range.first, it.range.last + 1)
        }
    }

    companion object {
        private const val PRIVATE_USE_AREA = 0xE000
        private val OPCODE_GROUPS = mapOf(
            "InsnNode" to intArrayOf(
                NOP,
                ACONST_NULL,
                ICONST_M1,
                ICONST_0,
                ICONST_1,
                ICONST_2,
                ICONST_3,
                ICONST_4,
                ICONST_5,
                LCONST_0,
                LCONST_1,
                FCONST_0,
                FCONST_1,
                FCONST_2,
                DCONST_0,
                DCONST_1,
                IALOAD,
                LALOAD,
                FALOAD,
                DALOAD,
                AALOAD,
                BALOAD,
                CALOAD,
                SALOAD,
                IASTORE,
                LASTORE,
                FASTORE,
                DASTORE,
                AASTORE,
                BASTORE,
                CASTORE,
                SASTORE,
                POP,
                POP2,
                DUP,
                DUP_X1,
                DUP_X2,
                DUP2,
                DUP2_X1,
                DUP2_X2,
                SWAP,
                IADD,
                LADD,
                FADD,
                DADD,
                ISUB,
                LSUB,
                FSUB,
                DSUB,
                IMUL,
                LMUL,
                FMUL,
                DMUL,
                IDIV,
                LDIV,
                FDIV,
                DDIV,
                IREM,
                LREM,
                FREM,
                DREM,
                INEG,
                LNEG,
                FNEG,
                DNEG,
                ISHL,
                LSHL,
                ISHR,
                LSHR,
                IUSHR,
                LUSHR,
                IAND,
                LAND,
                IOR,
                LOR,
                IXOR,
                LXOR,
                I2L,
                I2F,
                I2D,
                L2I,
                L2F,
                L2D,
                F2I,
                F2L,
                F2D,
                D2I,
                D2L,
                D2F,
                I2B,
                I2C,
                I2S,
                LCMP,
                FCMPL,
                FCMPG,
                DCMPL,
                DCMPG,
                IRETURN,
                LRETURN,
                FRETURN,
                DRETURN,
                ARETURN,
                RETURN,
                ARRAYLENGTH,
                ATHROW,
                MONITORENTER,
                MONITOREXIT
            ),
            "IntInsnNode" to intArrayOf(
                BIPUSH,
                SIPUSH,
                NEWARRAY
            ),
            "VarInsnNode" to intArrayOf(
                ILOAD,
                LLOAD,
                FLOAD,
                DLOAD,
                ALOAD,
                ISTORE,
                LSTORE,
                FSTORE,
                DSTORE,
                ASTORE,
                RET
            ),
            "TypeInsnNode" to intArrayOf(
                NEW,
                ANEWARRAY,
                CHECKCAST,
                INSTANCEOF
            ),
            "FieldInsnNode" to intArrayOf(
                GETSTATIC,
                PUTSTATIC,
                GETFIELD,
                PUTFIELD
            ),
            "MethodInsnNode" to intArrayOf(
                INVOKEVIRTUAL,
                INVOKESPECIAL,
                INVOKESTATIC,
                INVOKEINTERFACE
            ),
            "InvokeDynamicInsnNode" to intArrayOf(
                INVOKEDYNAMIC
            ),
            "JumpInsnNode" to intArrayOf(
                IFEQ,
                IFNE,
                IFLT,
                IFGE,
                IFGT,
                IFLE,
                IF_ICMPEQ,
                IF_ICMPNE,
                IF_ICMPLT,
                IF_ICMPGE,
                IF_ICMPGT,
                IF_ICMPLE,
                IF_ACMPEQ,
                IF_ACMPNE,
                GOTO,
                JSR,
                IFNULL,
                IFNONNULL
            ),
            "LdcInsnNode" to intArrayOf(
                LDC
            ),
            "IincInsnNode" to intArrayOf(
                IINC
            ),
            "TableSwitchInsnNode" to intArrayOf(
                TABLESWITCH
            ),
            "LookupSwitchInsnNode" to intArrayOf(
                LOOKUPSWITCH
            ),
            "MultiANewArrayInsnNode" to intArrayOf(
                MULTIANEWARRAY
            ),
            "ICONST" to intArrayOf(
                ICONST_M1,
                ICONST_0,
                ICONST_1,
                ICONST_2,
                ICONST_3,
                ICONST_4,
                ICONST_5
            ),
            "FCONST" to intArrayOf(
                FCONST_0,
                FCONST_1,
                FCONST_2
            ),
            "DCONST" to intArrayOf(
                DCONST_0,
                DCONST_1
            ),
            "LCONST" to intArrayOf(
                LCONST_0,
                LCONST_1
            ),
            "Number" to intArrayOf(
                ICONST_M1,
                ICONST_0,
                ICONST_1,
                ICONST_2,
                ICONST_3,
                ICONST_4,
                ICONST_5,
                FCONST_0,
                FCONST_1,
                FCONST_2,
                DCONST_0,
                DCONST_1,
                LCONST_0,
                LCONST_1,
                BIPUSH,
                SIPUSH,
                LDC
            ),
            "Return" to intArrayOf(
                IRETURN,
                FRETURN,
                DRETURN,
                LRETURN,
                ARETURN,
                RETURN
            ),
            "IfCmp" to intArrayOf(
                IF_ICMPEQ,
                IF_ICMPNE,
                IF_ICMPLT,
                IF_ICMPGT,
                IF_ICMPLE,
                IF_ICMPGE,
                IF_ACMPEQ,
                IF_ACMPNE
            )
        )

        private fun opcodeToCodepoint(opcode: Int): Char {
            return (PRIVATE_USE_AREA + opcode).toChar()
        }

        private fun appendOpcodeRegex(pattern: StringBuilder, opcode: String) {
            val i = Printer.OPCODES.indexOf(opcode)
            if (i != -1) {
                pattern.append(opcodeToCodepoint(i))
                return
            }
            val group = OPCODE_GROUPS[opcode]
            if (group != null) {
                pattern.append('(')
                group.map { opcodeToCodepoint(it) }.joinTo(pattern, "|")
                pattern.append(')')
                return
            }
            if (opcode == "AbstractInsnNode") {
                pattern.append('.')
                return
            }
            throw IllegalArgumentException("$opcode is not a valid opcode or opcode group")
        }

        fun compile(regex: String): InsnMatcher {
            val pattern = StringBuilder()
            val opcode = StringBuilder()
            for (c in regex) {
                if (c.isLetterOrDigit() || c == '_') {
                    opcode.append(c)
                } else {
                    if (opcode.isNotEmpty()) {
                        appendOpcodeRegex(pattern, opcode.toString())
                        opcode.delete(0, opcode.length)
                    }
                    if (!c.isWhitespace()) {
                        pattern.append(c)
                    }
                }
            }
            if (opcode.isNotEmpty()) {
                appendOpcodeRegex(pattern, opcode.toString())
                opcode.delete(0, opcode.length)
            }
            return InsnMatcher(Regex(pattern.toString()))
        }
    }
}