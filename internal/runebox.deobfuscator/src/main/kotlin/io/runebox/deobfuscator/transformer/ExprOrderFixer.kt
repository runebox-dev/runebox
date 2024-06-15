package io.runebox.deobfuscator.transformer

import io.runebox.asm.core.ClassPool
import io.runebox.asm.expr.ExprTree
import io.runebox.deobfuscator.Transformer

class ExprOrderFixer : Transformer {

    private var count = 0

    override fun transform(pool: ClassPool) {
        for(cls in pool.classes) {
            for(method in cls.methods) {
                val exprs = ExprTree.build(method)
                println()
            }
        }
    }
}