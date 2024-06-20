package io.runebox.updater.merge.operation

import io.runebox.asm.core.isConstructor
import io.runebox.asm.core.isInitializer
import io.runebox.updater.merge.MergeEngine
import io.runebox.updater.merge.MergeOperation
import io.runebox.updater.merge.MergeUtil.isObfuscatedName

class MatchDiscreteMethods : MergeOperation {
    override fun operate(set: MergeEngine) {
        for(match in set.allClassMatches()) {
            for(om in match.old.methods.filter { !it.name.isObfuscatedName() }) {
                if(om.isConstructor || om.isInitializer) continue
                val nm = match.new!!.methods.firstOrNull { it.name == om.name } ?: continue
                set.vote(om, nm)
            }
        }
    }
}