package io.runebox.deobfuscator.transformer

import io.runebox.asm.computeStackFrames
import io.runebox.asm.core.ClassPool
import io.runebox.deobfuscator.Logger
import io.runebox.deobfuscator.Transformer

class StackFrameBuilder : Transformer {

    private var count = 0

    override fun transform(pool: ClassPool) {
        for(cls in pool.classes) {
            cls.computeStackFrames()
            count++
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Computed stack frames for $count classes.")
    }
}