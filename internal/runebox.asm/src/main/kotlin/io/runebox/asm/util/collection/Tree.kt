package io.runebox.asm.util.collection

import java.util.*

open class Tree<T : Tree<T>> : LinkedList<T>() {

    lateinit var parent: T

    @Suppress("UNCHECKED_CAST")
    override fun addFirst(t: T) {
        t.parent = this as T
        super.addFirst(t)
    }
}