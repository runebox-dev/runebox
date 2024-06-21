package io.runebox.deobfuscator.asm

import com.google.common.collect.Iterables
import io.runebox.asm.core.cls
import io.runebox.asm.core.init
import io.runebox.asm.util.field
import org.objectweb.asm.tree.MethodNode

var MethodNode.origOwner: String by field { it.cls.name }
var MethodNode.origName: String by field { it.name }
var MethodNode.origDesc: String by field { it.desc }
var MethodNode.opaque: String by field { "" }

fun MethodNode.copy(): MethodNode {
    val exceptions = Iterables.toArray(this.exceptions, String::class.java)
    val copy = MethodNode(access, name, desc, signature, exceptions)
    this.accept(copy)
    copy.init(cls)
    copy.origOwner = origOwner
    copy.origName = origName
    copy.origDesc = origDesc
    copy.opaque = opaque
    return copy
}