package io.runebox.asm.hierarchy

import io.runebox.asm.tree.ClassPool
import io.runebox.asm.tree.interfaceClasses
import io.runebox.asm.tree.superClass
import org.objectweb.asm.tree.ClassNode

class ClassHierarchy(val pool: ClassPool) {

    private val nodes = hashMapOf<String, Node>()

    init {
        for(cls in pool.allClasses) {
            val node = nodes.getOrPut(cls.name) { Node(cls) }
            if(cls.superClass != null) {
                val superNode = nodes.getOrPut(cls.superClass!!.name) { Node(cls.superClass!!) }
                node.parents.add(superNode)
                superNode.children.add(node)
            }
            if(cls.interfaceClasses.isNotEmpty()) {
                for(itf in cls.interfaceClasses) {
                    val itfNode = nodes.getOrPut(itf.name) { Node(itf) }
                    node.parents.add(itfNode)
                    itfNode.children.add(node)
                }
            }
        }
        for(node in nodes.values) node.compute()
    }

    operator fun get(name: String) = nodes[name]

    fun parents(name: String) = nodes[name]?.parents
    fun allParents(name: String) = nodes[name]?.allParents
    fun children(name: String) = nodes[name]?.children
    fun allChildren(name: String) = nodes[name]?.allChildren

    fun parents(cls: ClassNode) = nodes[cls.name]?.parents
    fun allParents(cls: ClassNode) = nodes[cls.name]?.allParents
    fun children(cls: ClassNode) = nodes[cls.name]?.children
    fun allChildren(cls: ClassNode) = nodes[cls.name]?.allChildren

    class Node(val cls: ClassNode) {
        val parents = hashSetOf<Node>()
        val children = hashSetOf<Node>()
        val allParents = hashSetOf<Node>()
        val allChildren = hashSetOf<Node>()

        val name get() = cls.name

        internal fun compute() {
            val queue = ArrayDeque<Node>()

            queue.addAll(children)
            while(queue.isNotEmpty()) {
                val child = queue.removeFirst()
                allChildren.add(child)
                queue.addAll(child.children)
            }

            queue.addAll(parents)
            while(queue.isNotEmpty()) {
                val parent = queue.removeFirst()
                allParents.add(parent)
                queue.addAll(parent.parents)
            }
        }

        override fun toString(): String = name
        override fun equals(other: Any?): Boolean = other is Node && other.name == name
        override fun hashCode(): Int = name.hashCode()
    }
}