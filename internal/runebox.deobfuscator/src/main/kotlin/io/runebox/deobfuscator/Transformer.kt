package io.runebox.deobfuscator

import io.runebox.asm.tree.ClassPool

interface Transformer {

    fun transform(pool: ClassPool)

    fun postTransform(pool: ClassPool) { /* Do nothing by default */ }
}