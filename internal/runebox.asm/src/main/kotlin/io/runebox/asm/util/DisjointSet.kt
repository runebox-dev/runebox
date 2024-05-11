package io.runebox.asm.util

interface DisjointSet<T> : Iterable<DisjointSet.Subset<T>> {
    interface Subset<T> : Iterable<T>

    val elements: Int
    val subsets: Int

    fun add(x: T): Subset<T>
    operator fun get(x: T): Subset<T>?
    fun union(x: Subset<T>, y: Subset<T>)
}

class ForestDisjointSet<T> : DisjointSet<T> {
    private class Node<T>(val value: T) : DisjointSet.Subset<T> {
        val children = mutableListOf<Node<T>>()
        private var _parent = this
        var parent
            get() = _parent
            set(parent) {
                _parent = parent
                _parent.children.add(this)
            }
        var rank = 0

        fun find(): Node<T> {
            if (parent !== this) {
                _parent = parent.find()
            }
            return parent
        }

        override fun iterator(): Iterator<T> {
            return NodeIterator(find())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other !is Node<*>) return false

            return find() === other.find()
        }

        override fun hashCode(): Int {
            return find().value.hashCode()
        }

        override fun toString(): String {
            return find().value.toString()
        }
    }

    private class NodeIterator<T>(root: Node<T>) : Iterator<T> {
        private val queue = ArrayDeque<Node<T>>()

        init {
            queue.add(root)
        }

        override fun hasNext(): Boolean {
            return queue.isNotEmpty()
        }

        override fun next(): T {
            val node = queue.removeFirstOrNull() ?: throw NoSuchElementException()
            queue.addAll(node.children)
            return node.value
        }
    }

    private val nodes = mutableMapOf<T, Node<T>>()
    override val elements: Int
        get() = nodes.size
    override var subsets: Int = 0
        private set

    override fun add(x: T): DisjointSet.Subset<T> {
        val node = findNode(x)
        if (node != null) {
            return node
        }

        subsets++

        val newNode = Node(x)
        nodes[x] = newNode
        return newNode
    }

    override fun get(x: T): DisjointSet.Subset<T>? {
        return findNode(x)
    }

    private fun findNode(x: T): Node<T>? {
        val node = nodes[x] ?: return null
        return node.find()
    }

    override fun union(set1: DisjointSet.Subset<T>, set2: DisjointSet.Subset<T>) {
        require(set1 is Node<T>)
        require(set2 is Node<T>)

        val root1 = set1.find()
        val root2 = set2.find()

        if (root1 == root2) {
            return
        }

        when {
            root1.rank < root2.rank -> {
                root1.parent = root2
            }

            root1.rank > root2.rank -> {
                root2.parent = root1
            }

            else -> {
                root2.parent = root1
                root1.rank++
            }
        }

        subsets--
    }

    override fun iterator(): Iterator<DisjointSet.Subset<T>> {
        return nodes.values.iterator()
    }
}