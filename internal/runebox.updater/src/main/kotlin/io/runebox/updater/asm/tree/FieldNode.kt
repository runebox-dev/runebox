package io.runebox.updater.asm.tree

import io.runebox.updater.asm.ObfInfo
import io.runebox.updater.util.field
import io.runebox.updater.util.nullField
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode

var FieldNode.cls: ClassNode by field()
var FieldNode.obfInfo: ObfInfo? by nullField()

fun FieldNode.init(cls: ClassNode) {
    this.cls = cls
}