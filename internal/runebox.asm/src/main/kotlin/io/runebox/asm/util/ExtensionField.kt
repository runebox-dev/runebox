@file:Suppress("UNCHECKED_CAST")

package io.runebox.asm.util

import java.lang.ref.ReferenceQueue
import java.lang.ref.WeakReference
import kotlin.reflect.KProperty

fun <R, T> field(init: (R) -> T) = ExtensionField(init)
fun <R, T> field() = ExtensionField<R, T>()
fun <R, T> nullField(init: (R) -> T? = { null }) = ExtensionField(init)
fun <R, T> mutableListField() = ExtensionField { _: R -> mutableListOf<T>() }
fun <R, T> mutableSetField() = ExtensionField { _: R -> mutableSetOf<T>() }

class ExtensionField<R, T>(private val init: (R) -> T = { throw IllegalArgumentException("Extension field has not initial value.") }) {
    private val store = mutableWeakIdentityHashMap<R, T>()

    operator fun getValue(ref: R, property: KProperty<*>): T {
        return store[ref] ?: setValue(ref, property, init(ref))
    }

    operator fun setValue(ref: R, property: KProperty<*>, value: T): T {
        return value.apply {
            store[ref] = this
        }
    }
}

class WeakIdentityHashMap<K, V> : Map<K, V> {
    private val refQueue = ReferenceQueue<K>()
    private val backingStore = hashMapOf<WeakIdentityReference, V>()

    override val entries: Set<Map.Entry<K, V>> = referenceAwareFunction {
        hashSetOf<WeakIdentityHashEntry>().apply {
            backingStore.entries.forEach { reference ->
                reference.key.get()?.let { key ->
                    WeakIdentityHashEntry(key, reference.value).apply {
                        add(this)
                    }
                }
            }
        }
    }

    override val keys: Set<K> = referenceAwareFunction {
        mutableSetOf<K>().apply {
            backingStore.keys.forEach { key ->
                key.get()?.let {
                    add(it)
                }
            }
        }
    }

    override val size: Int = referenceAwareFunction(backingStore::size)

    override val values: Collection<V> = referenceAwareFunction(backingStore::values)

    override fun containsKey(key: K): Boolean = referenceAwareFunction {
        backingStore.containsKey(WeakIdentityReference(key))
    }

    override fun containsValue(value: V): Boolean = referenceAwareFunction {
        backingStore.containsValue(value)
    }

    override operator fun get(key: K): V? = referenceAwareFunction {
        backingStore[WeakIdentityReference(key)]
    }

    operator fun set(key: K, value: V): V? = referenceAwareFunction {
        WeakIdentityReference(key).run {
            backingStore.put(this, value)
        }
    }

    fun remove(key: K): V? = referenceAwareFunction {
        WeakIdentityReference(key).run {
            backingStore.remove(this)
        }
    }

    override fun isEmpty(): Boolean = referenceAwareFunction(backingStore::isEmpty)

    fun clear() = backingStore.clear().also {
        reap()
    }

    override fun hashCode(): Int = referenceAwareFunction(backingStore::hashCode)

    override fun equals(other: Any?): Boolean {
        if (other !is WeakIdentityHashMap<*, *>) {
            return false
        }

        return backingStore == other
    }

    private fun <T> referenceAwareFunction(block: () -> T) = reap().run {
        block()
    }

    @Synchronized
    private fun reap() {
        var zombie = refQueue.poll()

        while (zombie != null) {
            backingStore.remove(zombie)
            zombie = refQueue.poll()
        }
    }

    inner class WeakIdentityHashEntry(override val key: K, override val value: V) : Map.Entry<K, V>

    private inner class WeakIdentityReference(obj: K) : WeakReference<K>(obj, refQueue) {
        private val hash: Int = System.identityHashCode(obj)

        override fun hashCode(): Int = hash

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            if (other is WeakReference<*>) {
                if (this.get() === other.get())
                    return true
            }
            return false
        }
    }
}

/**
 * Kotlin stdlib style initializer function for the [WeakIdentityHashMap]
 */
fun<K, V> mutableWeakIdentityHashMap() = WeakIdentityHashMap<K, V>()