package io.runebox.deobfuscator.transformer

import com.google.common.collect.TreeMultimap
import io.runebox.asm.MemberRef
import io.runebox.asm.core.ClassPool
import io.runebox.deobfuscator.Transformer

class StaticMethodOwnerFixer : Transformer {

    private var count = 0

    // ah.kt(ZB)V - used
    //

    private val dupMethodMap = TreeMultimap.create<MemberRef, MemberRef>()

    override fun transform(pool: ClassPool) {

    }
}