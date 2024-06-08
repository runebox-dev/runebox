package io.runebox.deobfuscator

import io.runebox.asm.core.ClassPool

interface Transformer {

    fun transform(pool: ClassPool)

    fun postTransform(pool: ClassPool) { /* Do nothing by default */ }
}