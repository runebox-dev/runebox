package io.runebox.deobfuscator.transformer

import io.runebox.asm.InsnMatcher
import io.runebox.asm.core.ClassPool
import io.runebox.asm.core.pushedInt
import io.runebox.asm.isStatic
import io.runebox.deobfuscator.Logger
import io.runebox.deobfuscator.Transformer
import io.runebox.deobfuscator.asm.opaque
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type
import org.objectweb.asm.tree.*
import org.objectweb.asm.util.Printer

class IllegalStateExceptionRemover : Transformer {

    private var count = 0

    override fun transform(pool: ClassPool) {
        for(cls in pool.classes) {
            for(method in cls.methods) {
                for(matchedInsns in EXCEPTION_PATTERN.match(method).filter { method.checkExceptionPattern(it) }) {
                    method.removeInsns(matchedInsns)
                }
                for(matchedInsns in RETURN_PATTERN.match(method).filter { method.checkReturnPattern(it) }) {
                    method.removeInsns(matchedInsns)
                }
            }
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Removed $count 'IllegalStateException' exception throw predicates.")
    }


    private val MethodNode.lastArgIndex: Int get() {
        val offset = if(access.isStatic) 1 else 0
        return (Type.getArgumentsAndReturnSizes(desc) shr 2) - offset - 1
    }

    private fun opaqueValue(number: Int, ifOpcode: Int): Int = when(ifOpcode) {
        IF_ICMPEQ -> number
        IF_ICMPGE, IF_ICMPGT -> number + 1
        IF_ICMPLE, IF_ICMPLT, IF_ICMPNE -> number - 1
        else -> throw RuntimeException("Could not calculate opaque value from opcode: ${Printer.OPCODES[ifOpcode]}.")
    }

    private fun MethodNode.checkExceptionPattern(insns: List<AbstractInsnNode>): Boolean {
        val load = insns[0] as VarInsnNode
        val new = insns[3] as TypeInsnNode
        if(load.`var` != lastArgIndex) return false
        return new.desc == "java/lang/IllegalStateException"
    }

    private fun MethodNode.checkReturnPattern(insns: List<AbstractInsnNode>): Boolean {
        val load = insns[0] as VarInsnNode
        return load.`var` == lastArgIndex
    }

    private fun MethodNode.removeInsns(insns: List<AbstractInsnNode>) {
        val const = insns[1].pushedInt!!
        val ifOpcode = insns[2].opcode
        opaque = "${opaqueValue(const, ifOpcode)}"

        val jump = insns[2] as JumpInsnNode
        val goto = JumpInsnNode(GOTO, jump.label)
        instructions.insert(insns.last(), goto)
        insns.forEach(instructions::remove)
        count++
    }

    private val EXCEPTION_PATTERN = InsnMatcher.compile("""
        (ILOAD)
        (Number)
        (IfCmp)
        (NEW)
        (DUP)
        (INVOKESPECIAL)
        (ATHROW)
    """.trimIndent())

    private val RETURN_PATTERN = InsnMatcher.compile("""
        (ILOAD)
        (Number)
        (IfCmp)
        (Return)
    """.trimIndent())
}