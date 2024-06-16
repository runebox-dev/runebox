package io.runebox.deobfuscator.asm

import io.runebox.asm.core.cls
import io.runebox.asm.util.field
import io.runebox.asm.util.nullField
import org.objectweb.asm.tree.MethodNode

var MethodNode.origOwner: String by field { it.cls.name }
var MethodNode.origName: String by field { it.name }
var MethodNode.origDesc: String by field { it.desc }
var MethodNode.opaqueValue: Int? by nullField()
var MethodNode.opaqueType: String? by nullField()