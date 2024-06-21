package io.runebox.updater.util.collection

import java.io.IOException
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.io.Serializable
import java.util.*
import java.util.function.Consumer

/**
 * @see ArrayDeque
 *
 * This is a replica class of ArrayDeque, with the exception of {@link IndexedDeque.get
 */
class IndexedDeque<E> : AbstractCollection<E>, Deque<E>, Cloneable, Serializable {
    @Transient
    lateinit var elements: Array<Any?>

    @Transient
    var head: Int = 0

    @Transient
    private var tail = 0

    private fun allocateElements(numElements: Int) {
        var initialCapacity = MIN_INITIAL_CAPACITY
        if (numElements >= initialCapacity) {
            initialCapacity = numElements
            initialCapacity = initialCapacity or (initialCapacity ushr 1)
            initialCapacity = initialCapacity or (initialCapacity ushr 2)
            initialCapacity = initialCapacity or (initialCapacity ushr 4)
            initialCapacity = initialCapacity or (initialCapacity ushr 8)
            initialCapacity = initialCapacity or (initialCapacity ushr 16)
            initialCapacity++
            if (initialCapacity < 0) {
                initialCapacity = initialCapacity ushr 1
            }
        }
        elements = arrayOfNulls(initialCapacity)
    }

    private fun doubleCapacity() {
        assert(head == tail)
        val p = head
        val n = elements.size
        val r = n - p
        val newCapacity = n shl 1
        check(newCapacity >= 0) { "Sorry, deque too big" }
        val a = arrayOfNulls<Any>(newCapacity)
        System.arraycopy(elements, p, a, 0, r)
        System.arraycopy(elements, 0, a, r, p)
        elements = a
        head = 0
        tail = n
    }

    private fun <T> copyElements(a: Array<T?>): Array<T?> {
        if (head < tail) {
            System.arraycopy(elements, head, a, 0, size)
        } else if (head > tail) {
            val headPortionLen = elements.size - head
            System.arraycopy(elements, head, a, 0, headPortionLen)
            System.arraycopy(elements, 0, a, headPortionLen, tail)
        }
        return a
    }

    constructor() {
        elements = arrayOfNulls(16)
    }

    constructor(numElements: Int) {
        allocateElements(numElements)
    }

    constructor(c: Collection<E>) {
        allocateElements(c.size)
        addAll(c)
    }

    override fun addFirst(e: E?) {
        if (e == null) {
            throw NullPointerException()
        }
        elements[((head - 1) and (elements.size - 1)).also { head = it }] = e
        if (head == tail) {
            doubleCapacity()
        }
    }

    override fun addLast(e: E?) {
        if (e == null) {
            throw NullPointerException()
        }
        elements[tail] = e
        if ((((tail + 1) and (elements.size - 1)).also { tail = it }) == head) {
            doubleCapacity()
        }
    }

    override fun offerFirst(e: E?): Boolean {
        addFirst(e)
        return true
    }

    override fun offerLast(e: E?): Boolean {
        addLast(e)
        return true
    }

    override fun removeFirst(): E? {
        val x = pollFirst() ?: throw NoSuchElementException()
        return x
    }

    override fun removeLast(): E? {
        val x = pollLast() ?: throw NoSuchElementException()
        return x
    }

    override fun pollFirst(): E? {
        val h = head
        val result = elements[h] as E? ?: return null
        // Element is null if deque empty
        elements[h] = null // Must null out slot
        head = (h + 1) and (elements.size - 1)
        return result
    }

    override fun pollLast(): E? {
        val t = (tail - 1) and (elements.size - 1)
        val result = elements[t] as E? ?: return null
        elements[t] = null
        tail = t
        return result
    }

    override fun getFirst(): E? {
        val result = elements[head] as E? ?: throw NoSuchElementException()
        return result
    }

    override fun getLast(): E? {
        val result = elements[tail - 1 and (elements.size - 1)] as E?
            ?: throw NoSuchElementException()
        return result
    }

    override fun peekFirst(): E? {
        // elements[head] is null if deque empty
        return elements[head] as E?
    }

    override fun peekLast(): E? {
        return elements[tail - 1 and (elements.size - 1)] as E?
    }

    /**
     * Gets the element at the given index.
     *
     * @param index The index to get at.
     * @return The element at the given index.
     */
    fun get(index: Int): E? {
        if (head + index < head || head + index >= elements.size) {
            throw IndexOutOfBoundsException((head + index).toString() + "/" + elements.size)
        }
        return elements[head + index] as E?
    }

    override fun removeFirstOccurrence(o: Any): Boolean {
        if (o == null) {
            return false
        }
        val mask = elements.size - 1
        var i = head
        var x: Any
        while ((elements[i].also { x = it!! }) != null) {
            if (o == x) {
                delete(i)
                return true
            }
            i = (i + 1) and mask
        }
        return false
    }

    override fun removeLastOccurrence(o: Any): Boolean {
        if (o == null) {
            return false
        }
        val mask = elements.size - 1
        var i = (tail - 1) and mask
        var x: Any
        while ((elements[i].also { x = it!! }) != null) {
            if (o == x) {
                delete(i)
                return true
            }
            i = (i - 1) and mask
        }
        return false
    }

    override fun add(e: E?): Boolean {
        addLast(e)
        return true
    }

    override fun offer(e: E?): Boolean {
        return offerLast(e)
    }

    override fun remove(): E? {
        return removeFirst()
    }

    override fun poll(): E? {
        return pollFirst()
    }

    override fun element(): E? {
        return first
    }

    override fun peek(): E? {
        return peekFirst()
    }

    override fun push(e: E?) {
        addFirst(e)
    }

    override fun pop(): E? {
        return removeFirst()
    }

    private fun checkInvariants() {
        assert(elements[tail] == null)
        val h = elements[head]
        assert(if (head == tail) h == null else (h != null && elements[tail - 1 and (elements.size - 1)] != null))
        assert(elements[head - 1 and (elements.size - 1)] == null)
    }

    private fun delete(i: Int): Boolean {
        checkInvariants()
        val elements = this.elements
        val mask = elements.size - 1
        val h = head
        val t = tail
        val front = (i - h) and mask
        val back = (t - i) and mask
        if (front >= ((t - h) and mask)) {
            throw ConcurrentModificationException()
        }
        if (front < back) {
            if (h <= i) {
                System.arraycopy(elements, h, elements, h + 1, front)
            } else {
                System.arraycopy(elements, 0, elements, 1, i)
                elements[0] = elements[mask]
                System.arraycopy(elements, h, elements, h + 1, mask - h)
            }
            elements[h] = null
            head = (h + 1) and mask
            return false
        } else {
            if (i < t) {
                System.arraycopy(elements, i + 1, elements, i, back)
                tail = t - 1
            } else {
                System.arraycopy(elements, i + 1, elements, i, mask - i)
                elements[mask] = elements[0]
                System.arraycopy(elements, 1, elements, 0, t)
                tail = (t - 1) and mask
            }
            return true
        }
    }

    override val size get() = (tail - head) and (elements.size - 1)

    override fun isEmpty(): Boolean {
        return head == tail
    }

    override fun iterator(): MutableIterator<E?> {
        return DeqIterator()
    }

    override fun descendingIterator(): Iterator<E?> {
        return DescendingIterator()
    }

    /**
     * @see ArrayDeque.DeqIterator
     */
    private inner class DeqIterator : MutableIterator<E> {
        private var cursor = head
        private var fence = tail
        private var lastRet = -1

        override fun hasNext(): Boolean {
            return cursor != fence
        }

        override fun next(): E {
            if (cursor == fence) {
                throw NoSuchElementException()
            }
            val result = elements[cursor] as E?
            // This check doesn't catch all possible comodifications,
            // but does catch the ones that corrupt traversal
            if (tail != fence || result == null) {
                throw ConcurrentModificationException()
            }
            lastRet = cursor
            cursor = (cursor + 1) and (elements.size - 1)
            return result
        }

        override fun remove() {
            check(lastRet >= 0)
            if (delete(lastRet)) { // if left-shifted, undo increment in next()
                cursor = (cursor - 1) and (elements.size - 1)
                fence = tail
            }
            lastRet = -1
        }

        override fun forEachRemaining(action: Consumer<in E>) {
            Objects.requireNonNull(action)
            val a = elements
            val m = a.size - 1
            val f = fence
            var i = cursor
            cursor = f
            while (i != f) {
                val e = a[i] as E?
                i = (i + 1) and m
                if (e == null) {
                    throw ConcurrentModificationException()
                }
                action.accept(e)
            }
        }
    }

    /**
     * @see ArrayDeque.DescendingIterator
     */
    private inner class DescendingIterator : MutableIterator<E> {
        private var cursor = tail
        private var fence = head
        private var lastRet = -1

        override fun hasNext(): Boolean {
            return cursor != fence
        }

        override fun next(): E {
            if (cursor == fence) {
                throw NoSuchElementException()
            }
            cursor = (cursor - 1) and (elements.size - 1)
            val result = elements[cursor] as E?
            if (head != fence || result == null) {
                throw ConcurrentModificationException()
            }
            lastRet = cursor
            return result
        }

        override fun remove() {
            check(lastRet >= 0)
            if (!delete(lastRet)) {
                cursor = (cursor + 1) and (elements.size - 1)
                fence = head
            }
            lastRet = -1
        }
    }

    override fun contains(o: E?): Boolean {
        if (o == null) {
            return false
        }
        val mask = elements.size - 1
        var i = head
        var x: Any
        while ((elements[i].also { x = it!! }) != null) {
            if (o == x) {
                return true
            }
            i = (i + 1) and mask
        }
        return false
    }

    override fun remove(o: E): Boolean {
        return removeFirstOccurrence(o!!)
    }

    override fun clear() {
        val h = head
        val t = tail
        if (h != t) {
            tail = 0
            head = tail
            var i = h
            val mask = elements.size - 1
            do {
                elements[i] = null
                i = (i + 1) and mask
            } while (i != t)
        }
    }

    override fun toArray(): Array<Any?> {
        return copyElements(arrayOfNulls(size))
    }

    override fun <T> toArray(a: Array<T?>): Array<T?> {
        var a = a
        val size = size
        if (a.size < size) {
            a = java.lang.reflect.Array.newInstance(a.javaClass.componentType, size) as Array<T?>
        }
        copyElements(a)
        if (a.size > size) {
            a[size] = null
        }
        return a
    }

    public override fun clone(): IndexedDeque<E> {
        try {
            val result = super.clone() as IndexedDeque<E>
            result.elements = elements.copyOf(elements.size)
            return result
        } catch (e: CloneNotSupportedException) {
            throw AssertionError()
        }
    }

    @Throws(IOException::class)
    private fun writeObject(s: ObjectOutputStream) {
        s.defaultWriteObject()
        s.writeInt(size)
        val mask = elements.size - 1
        var i = head
        while (i != tail) {
            s.writeObject(elements[i])
            i = (i + 1) and mask
        }
    }

    @Throws(IOException::class, ClassNotFoundException::class)
    private fun readObject(s: ObjectInputStream) {
        s.defaultReadObject()
        val size = s.readInt()
        allocateElements(size)
        head = 0
        tail = size
        for (i in 0 until size) {
            elements[i] = s.readObject()
        }
    }

    override fun spliterator(): Spliterator<E> {
        return DeqSpliterator(this, -1, -1)
    }

    private class DeqSpliterator<E>(private val deq: IndexedDeque<E>, private var index: Int, private var fence: Int) :
        Spliterator<E> {
        private fun getFence(): Int {
            var t: Int
            if ((fence.also { t = it }) < 0) {
                fence = deq.tail
                t = fence
                index = deq.head
            }
            return t
        }

        override fun trySplit(): DeqSpliterator<E>? {
            var t = getFence()
            val h = index
            val n = deq.elements.size
            if (h != t && ((h + 1) and (n - 1)) != t) {
                if (h > t) {
                    t += n
                }
                val m = ((h + t) ushr 1) and (n - 1)
                return DeqSpliterator(deq, h, m.also { index = it })
            }
            return null
        }

        override fun forEachRemaining(consumer: Consumer<in E>) {
            if (consumer == null) {
                throw NullPointerException()
            }
            val a = deq.elements
            val m = a.size - 1
            val f = getFence()
            var i = index
            index = f
            while (i != f) {
                val e = a[i] as E?
                i = (i + 1) and m
                if (e == null) {
                    throw ConcurrentModificationException()
                }
                consumer.accept(e)
            }
        }

        override fun tryAdvance(consumer: Consumer<in E>): Boolean {
            if (consumer == null) {
                throw NullPointerException()
            }
            val a = deq.elements
            val m = a.size - 1
            val f = getFence()
            val i = index
            if (i != fence) {
                val e = a[i] as E?
                index = (i + 1) and m
                if (e == null) {
                    throw ConcurrentModificationException()
                }
                consumer.accept(e)
                return true
            }
            return false
        }

        override fun estimateSize(): Long {
            var n = getFence() - index
            if (n < 0) {
                n += deq.elements.size
            }
            return n.toLong()
        }

        override fun characteristics(): Int {
            return Spliterator.ORDERED or Spliterator.SIZED or Spliterator.NONNULL or Spliterator.SUBSIZED
        }
    }

    companion object {
        private const val MIN_INITIAL_CAPACITY = 8

        private const val serialVersionUID = 2340985798034038923L
    }
}