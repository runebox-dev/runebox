package io.runebox.updater.asm.tree

import io.runebox.updater.util.field
import org.objectweb.asm.tree.ClassNode

var ClassNode.group: ClassGroup by field()

fun ClassNode.init(group: ClassGroup) {
    this.group = group
    methods.forEach { it.init(this) }
    fields.forEach { it.init(this) }
}