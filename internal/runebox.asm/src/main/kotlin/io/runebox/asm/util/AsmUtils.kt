package io.runebox.asm.util

import io.runebox.asm.ClassGroup
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.util.CheckClassAdapter

fun ByteArray.toClassNode(flags: Int = ClassReader.SKIP_FRAMES): ClassNode {
    return ClassReader(this).toClassNode(flags)
}

fun Class<*>.toClassNode(flags: Int = ClassReader.SKIP_FRAMES): ClassNode {
    return ClassReader(this.name.replace("/", ".")).toClassNode(flags)
}

fun ClassReader.toClassNode(flags: Int = ClassReader.SKIP_FRAMES): ClassNode {
    val node = ClassNode()
    this.accept(node, flags)
    return node
}

fun ClassNode.toByteArray(flags: Int = ClassWriter.COMPUTE_MAXS): ByteArray {
    val writer = ClassWriter(flags)
    val checker = CheckClassAdapter(writer, false)
    this.accept(checker)
    return writer.toByteArray()
}

fun ClassNode.recomputeFrames(group: ClassGroup): ClassNode {
    val writer = AsmClassWriter(group, ClassWriter.COMPUTE_FRAMES or ClassWriter.COMPUTE_MAXS)
    val checker = CheckClassAdapter(writer, true)
    this.accept(checker)
    val bytes = writer.toByteArray()
    return bytes.toClassNode()
}