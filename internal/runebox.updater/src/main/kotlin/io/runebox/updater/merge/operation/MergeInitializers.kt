package io.runebox.updater.merge.operation

import io.runebox.asm.core.isInitializer
import io.runebox.updater.merge.MergeEngine
import io.runebox.updater.merge.MergeOperation

class MergeInitializers : MergeOperation {

    private val handled = hashSetOf<String>()

    override fun operate(set: MergeEngine) {
        for(classMatch in set.allClassMatches()) {
            if(classMatch.new == null || handled.contains(classMatch.new!!.name)) {
                continue
            }
            handled.add(classMatch.new!!.name)

            val oldClinit = classMatch.old.methods.firstOrNull { it.isInitializer }
            val newClinit = classMatch.new!!.methods.firstOrNull { it.isInitializer }
            if(oldClinit != null && newClinit != null) {
                val methodMatch = set.getPendingMatch(oldClinit)
                methodMatch.new = newClinit
                set.markMatched(methodMatch)
            }
        }
    }
}