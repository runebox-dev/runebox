package io.runebox.deobfuscator.transformer

import io.runebox.asm.isStatic
import io.runebox.asm.core.ClassPool
import io.runebox.deobfuscator.Logger
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type
import org.objectweb.asm.tree.*

class IllegalStateExceptionRemover : Transformer {

    private var count = 0

    override fun transform(pool: ClassPool) {
        for(cls in pool.classes) {
            for(method in cls.methods) {
                val insns = method.instructions.iterator()
                while(insns.hasNext()) {
                    val insn = insns.next()
                    if(insn.matchThrowPattern()) {
                        val load = insn as VarInsnNode
                        val jump = insn.next.next as JumpInsnNode
                        if(load.`var` != method.lastArgIndex) continue
                        val goto = JumpInsnNode(GOTO, LabelNode(jump.label.label))
                        insns.remove()
                        repeat(6) {
                            insns.next()
                            insns.remove()
                        }
                        insns.add(goto)
                        count++
                    } else if(insn.matchReturnPattern()) {
                        val load = insn as VarInsnNode
                        val jump = insn.next.next as JumpInsnNode
                        if(load.`var` != method.lastArgIndex) continue
                        val goto = JumpInsnNode(GOTO, LabelNode(jump.label.label))
                        insns.remove()
                        repeat(3) {
                            insns.next()
                            insns.remove()
                        }
                        insns.add(goto)
                        count++
                    }
                }
            }
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Removed $count 'IllegalStateException' exception throw predicates.")
    }

    private fun AbstractInsnNode.matchThrowPattern(): Boolean {
        var insn = this
        if(insn.opcode != ILOAD) return false
        insn = insn.next
        if(!insn.isNumber) return false
        insn = insn.next
        if(!insn.isIf) return false
        insn = insn.next
        if(insn.opcode != NEW) return false
        insn as TypeInsnNode
        if(insn.desc != Type.getInternalName(IllegalStateException::class.java)) return false
        insn = insn.next
        if(insn.opcode != DUP) return false
        insn = insn.next
        if(insn.opcode != INVOKESPECIAL) return false
        insn as MethodInsnNode
        if(insn.owner != Type.getInternalName(IllegalStateException::class.java) || insn.name != "<init>" || insn.desc != "()V") return false
        insn = insn.next
        return insn.opcode == ATHROW
    }

    private fun AbstractInsnNode.matchReturnPattern(): Boolean {
        var insn = this
        if(insn.opcode != ILOAD) return false
        insn = insn.next
        if(!insn.isNumber) return false
        insn = insn.next
        if(!insn.isIf) return false
        insn = insn.next
        return insn.opcode == RETURN
    }

    private val AbstractInsnNode.isNumber: Boolean get() = when(opcode) {
        in ICONST_M1..ICONST_5 -> true
        in BIPUSH..SIPUSH -> true
        LDC -> {
            this as LdcInsnNode
            cst is Number
        }
        else -> false
    }

    private val AbstractInsnNode.isIf: Boolean get() = when(opcode) {
        in IF_ICMPEQ..IF_ACMPNE -> true
        in IFNULL..IFNONNULL -> true
        else -> false
    }

    private val MethodNode.lastArgIndex: Int get() {
        val offset = if(access.isStatic) 1 else 0
        return (Type.getArgumentsAndReturnSizes(desc) shr 2) - offset - 1
    }
}