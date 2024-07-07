package io.runebox.deobfuscator.transformer

import io.runebox.asm.core.ClassPool
import io.runebox.asm.core.nextReal
import io.runebox.deobfuscator.Logger
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.Opcodes.ATHROW
import org.objectweb.asm.Type
import org.objectweb.asm.tree.TryCatchBlockNode

class RuntimeExceptionRemover : Transformer {

    private var count = 0

    override fun transform(pool: ClassPool) {
        for(cls in pool.classes) {
            for(method in cls.methods) {
                val toRemove = mutableListOf<TryCatchBlockNode>()
                for(tcb in method.tryCatchBlocks) {
                    if(tcb.type == Type.getInternalName(RuntimeException::class.java)) {
                        toRemove.add(tcb)
                        count++
                    }
                }
                method.tryCatchBlocks.removeAll(toRemove)
                for(insn in method.instructions.toArray()) {
                    if(insn.opcode != ATHROW) continue
                    val found = method.tryCatchBlocks.removeIf { tcb ->
                        tcb.handler.nextReal == insn
                    }
                    if(found) {
                        method.instructions.remove(insn)
                        count++
                    }
                }
            }
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Removed $count 'RuntimeException' try-catch blocks.")
    }
}