package io.runebox.deobfuscator.transformer

import io.runebox.asm.core.ClassPool
import io.runebox.deobfuscator.Logger
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.Opcodes.GOTO
import org.objectweb.asm.tree.AbstractInsnNode.LABEL
import org.objectweb.asm.tree.JumpInsnNode

class RedundantGotoRemover : Transformer {

    private var count = 0

    override fun transform(pool: ClassPool) {
        for(method in pool.classes.flatMap { it.methods }) {
            for(insn in method.instructions.toArray()) {
                if(insn.opcode != GOTO) continue

                val jump = insn as JumpInsnNode
                val next = jump.next
                if(next == null || next.type != LABEL) continue

                if(jump.label == next) {
                    method.instructions.remove(insn)
                    count++
                }
            }
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Removed $count redundant GOTO instructions.")
    }
}