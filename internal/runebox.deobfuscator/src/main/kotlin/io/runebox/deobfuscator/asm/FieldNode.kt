package io.runebox.deobfuscator.asm

import io.runebox.asm.core.cls
import io.runebox.asm.core.init
import io.runebox.asm.util.field
import org.objectweb.asm.tree.FieldNode

var FieldNode.origOwner: String by field { it.cls.name }
var FieldNode.origName: String by field { it.name }
var FieldNode.origDesc: String by field { it.desc }
var FieldNode.intMultiplier: Int by field { 0 }
var FieldNode.longMultiplier: Long by field { 0L }

fun FieldNode.copy(): FieldNode {
    val copy = FieldNode(access, name, desc, signature, value)
    copy.init(cls)
    copy.origOwner = origOwner
    copy.origName = origName
    copy.origDesc = origDesc
    copy.intMultiplier = intMultiplier
    copy.longMultiplier = longMultiplier
    return copy
}