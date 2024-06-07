package io.runebox.deobfuscator.transformer

import io.runebox.asm.tree.ClassPool
import io.runebox.deobfuscator.Logger
import io.runebox.deobfuscator.Transformer
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
            }
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Removed $count 'RuntimeException' try-catch blocks.")
    }
}