package io.runebox.asm.tree

import io.runebox.asm.util.field
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.MethodNode

fun MethodNode.init(cls: ClassNode) {
    this.cls = cls
}

var MethodNode.cls: ClassNode by field()
val MethodNode.pool: ClassPool get() = cls.pool