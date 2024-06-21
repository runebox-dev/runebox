package io.runebox.updater.asm.tree

import io.runebox.updater.util.field
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode

var FieldNode.cls: ClassNode by field()

fun FieldNode.init(cls: ClassNode) {
    this.cls = cls
}