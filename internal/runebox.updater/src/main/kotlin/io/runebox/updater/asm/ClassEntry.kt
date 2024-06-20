package io.runebox.updater.asm

import io.runebox.updater.util.identityHashSetOf
import org.objectweb.asm.tree.ClassNode

class ClassEntry(val group: ClassGroup, val id: String, val node: ClassNode) {
    val env get() = group.env
    var isReal = true

    val access = node.access
    val name = node.name

    var parent: ClassEntry? = null
    val children = identityHashSetOf<ClassEntry>()
    val interfaces = identityHashSetOf<ClassEntry>()
    val implementers = identityHashSetOf<ClassEntry>()

    var elementClass: ClassEntry? = null
    val arrayClasses = identityHashSetOf<ClassEntry>()

    val isArray get() = elementClass != null
    val dims get() = if(!isArray) 0 else id.lastIndexOf('[') + 1

    override fun toString(): String {
        return name
    }

    companion object {
        fun id(name: String) = if(name[0] == '[') name else "L$name;"
    }
}