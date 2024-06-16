package io.runebox.deobfuscator.asm

import io.runebox.asm.core.cls
import io.runebox.asm.util.field
import io.runebox.asm.util.nullField
import org.objectweb.asm.tree.FieldNode

var FieldNode.origOwner: String by field { it.cls.name }
var FieldNode.origName: String by field { it.name }
var FieldNode.origDesc: String by field { it.desc }
var FieldNode.multiplier: Long? by nullField()