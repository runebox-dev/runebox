package io.runebox.updater.merge.match

import org.objectweb.asm.tree.ClassNode

class ClassMatch(old: ClassNode) : AbstractMatch<ClassNode>(old) {
    override fun toString(): String {
        return "${old.name} -> ${new?.name}"
    }
}