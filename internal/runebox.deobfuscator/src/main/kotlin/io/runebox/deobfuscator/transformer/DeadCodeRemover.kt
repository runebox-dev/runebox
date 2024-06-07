package io.runebox.deobfuscator.transformer

import io.runebox.asm.tree.ClassPool
import io.runebox.deobfuscator.Logger
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.tree.analysis.Analyzer
import org.objectweb.asm.tree.analysis.BasicInterpreter

class DeadCodeRemover : Transformer {

    private var count = 0

    override fun transform(pool: ClassPool) {
        for(cls in pool.classes) {
            for(method in cls.methods) {
                var removed = false
                val insns = method.instructions.toArray()
                val frames = Analyzer(BasicInterpreter()).analyze(cls.name, method)
                for(i in insns.indices) {
                    val frame = frames[i]
                    if(frame == null) {
                        method.instructions.remove(insns[i])
                        removed = true
                    }
                }
                if(removed) count++
            }
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Removed dead-code instructions from $count methods.")
    }
}