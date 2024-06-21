package io.runebox.updater.asm.tree

import io.runebox.updater.util.field
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.MethodNode

var MethodNode.cls: ClassNode by field()

fun MethodNode.init(cls: ClassNode) {
    this.cls = cls
}