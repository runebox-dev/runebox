package io.runebox.updater.merge.operation

import io.runebox.updater.merge.MergeEngine
import io.runebox.updater.merge.MergeOperation

class JumpOperation(val target: Int, val predicate: (MergeEngine) -> Boolean) : MergeOperation {
    override fun operate(set: MergeEngine) {}
}