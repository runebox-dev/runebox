package io.runebox.asm.util

import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.tree.ClassNode

fun ByteArray.toClassNode(flags: Int): ClassNode {
    val node = ClassNode()
    val reader = ClassReader(this)
    reader.accept(node, flags)
    return node
}

fun ClassNode.toByteArray(flags: Int): ByteArray {
    val writer = ClassWriter(flags)
    this.accept(writer)
    return writer.toByteArray()
}

