package io.runebox.updater.merge.operation

import io.runebox.asm.core.superClass
import io.runebox.updater.merge.MergeEngine
import io.runebox.updater.merge.MergeOperation
import kotlin.math.min

class MergeMatchedClasses : MergeOperation {
    override fun operate(set: MergeEngine) {
        for(match in set.allClassMatches()) {
            if(match.isMerged) continue

            match.isMerged = true
            val old = match.old
            val new = match.new!!
            if(set.oldPool.containsClass(old.superName) && set.newPool.containsClass(new.superName)) {
                set.vote(old.superClass!!, new.superClass!!)
            }
            val oldItfs = old.interfaces.filter { set.oldPool.containsClass(it) }.map { set.oldPool.findClass(it) }
            val newItfs = new.interfaces.filter { set.newPool.containsClass(it) }.map { set.newPool.findClass(it) }
            for(i in 0 until min(oldItfs.size, newItfs.size)) {
                val oldItf = oldItfs[i]
                val newItf = newItfs[i]
                set.vote(oldItf, newItf)
            }
        }
    }
}