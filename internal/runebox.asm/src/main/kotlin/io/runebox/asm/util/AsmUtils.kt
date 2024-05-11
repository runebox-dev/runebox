package io.runebox.asm.util

import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.util.CheckClassAdapter

fun ByteArray.toClassNode(flags: Int = ClassReader.SKIP_FRAMES): ClassNode {
    val reader = ClassReader(this)
    val node = ClassNode()
    reader.accept(node, flags)
    return node
}

fun Class<*>.toClassNode(flags: Int = ClassReader.SKIP_FRAMES): ClassNode {
    val reader = ClassReader(this.name)
    val node = ClassNode()
    reader.accept(node, flags)
    return node
}

fun ClassNode.toByteArray(flags: Int = ClassWriter.COMPUTE_MAXS): ByteArray {
    val writer = ClassWriter(flags)
    val checker = CheckClassAdapter(writer, false)
    this.accept(checker)
    return writer.toByteArray()
}