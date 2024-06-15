package io.runebox.asm.util.collection

interface DisjointSet<T> : Iterable<DisjointSet.Subset<T>> {
    interface Subset<T> : Iterable<T>

    val size: Int
    val subSets: Int

    fun add(element: T): Subset<T>
    operator fun get(element: T): Subset<T>?
    fun union(a: Subset<T>, b: Subset<T>)
}

class ForestDisjointSet<T> : DisjointSet<T> {
    private class Node<T>(val value: T) : DisjointSet.Subset<T> {
        val children = mutableListOf<Node<T>>()

        private var _parent = this
        var parent
            get() = _parent
            set(value) {
                _parent = value
                _parent.children.add(this)
            }

        var rank = 0

        fun find(): Node<T> {
            if(parent !== this) {
                _parent = parent.find()
            }
            return parent
        }

        override fun iterator(): Iterator<T> {
            return NodeIterator(find())
        }

        override fun equals(other: Any?): Boolean {
            if(this === other) return true
            if(other !is Node<*>) return false
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

    override val size get() = nodes.size
    override var subSets: Int = 0
        private set

    override fun add(element: T): DisjointSet.Subset<T> {
        val node = findNode(element)
        if(node != null) return node

        subSets++

        val newNode = Node(element)
        nodes[element] = newNode
        return newNode
    }

    override fun get(element: T): DisjointSet.Subset<T>? {
        return findNode(element)
    }

    override fun union(a: DisjointSet.Subset<T>, b: DisjointSet.Subset<T>) {
        require(a is Node<T>)
        require(b is Node<T>)

        val rootA = a.find()
        val rootB = b.find()

        if(rootA == rootB) {
            return
        }

        when {
            rootA.rank < rootB.rank -> rootA.parent = rootB
            rootA.rank > rootB.rank -> rootB.parent = rootA
            else -> {
                rootB.parent = rootA
                rootA.rank++
            }
        }

        subSets--
    }

    private fun findNode(element: T): Node<T>? {
        val node = nodes[element] ?: return null
        return node.find()
    }

    override fun iterator(): Iterator<DisjointSet.Subset<T>> {
        return nodes.values.iterator()
    }
}