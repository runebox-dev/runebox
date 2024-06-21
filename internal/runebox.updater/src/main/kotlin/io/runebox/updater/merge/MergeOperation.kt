package io.runebox.updater.merge

interface MergeOperation {
    fun operate(set: MergeEngine)
}