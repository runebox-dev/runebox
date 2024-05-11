package io.runebox.asm.util

class UniqueQueue<T> {
    private val queue = ArrayDeque<T>()
    private val set = mutableSetOf<T>()

    fun add(v: T): Boolean {
        if (set.add(v)) {
            queue.addLast(v)
            return true
        }

        return false
    }

    operator fun plusAssign(v: T) {
        add(v)
    }

    fun addAll(vs: Iterable<T>) {
        for (v in vs) {
            add(v)
        }
    }

    operator fun plusAssign(vs: Iterable<T>) {
        addAll(vs)
    }

    fun removeFirstOrNull(): T? {
        val v = queue.removeFirstOrNull()
        if (v != null) {
            set.remove(v)
            return v
        }

        return null
    }

    fun clear() {
        queue.clear()
        set.clear()
    }
}