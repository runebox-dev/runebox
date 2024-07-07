package io.runebox.deobfuscator.transformer

import io.runebox.asm.computeStackFrames
import io.runebox.asm.core.ClassPool
import io.runebox.deobfuscator.Logger
import io.runebox.deobfuscator.Transformer
import io.runebox.deobfuscator.asm.origName

class StackFrameBuilder : Transformer {

    private var count = 0

    override fun transform(pool: ClassPool) {
        for(cls in pool.classes) {
            val oldOrigName = cls.origName
            cls.computeStackFrames()
            cls.origName = oldOrigName
            count++
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Computed stack frames for $count classes.")
    }
}