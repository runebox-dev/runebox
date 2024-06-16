package io.runebox.deobfuscator.asm

import io.runebox.asm.util.field
import org.objectweb.asm.tree.ClassNode

var ClassNode.origName: String by field { it.name }