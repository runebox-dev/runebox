package io.runebox.updater.asm

import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.tree.ClassNode
import java.io.InputStream

fun ByteArray.toClassNode(flags: Int = ClassReader.SKIP_FRAMES): ClassNode {
    val cls = ClassNode()
    val reader = ClassReader(this)
    reader.accept(cls, flags)
    return cls
}

fun ClassNode.toByteArray(flags: Int = ClassWriter.COMPUTE_MAXS): ByteArray {
    val writer = ClassWriter(flags)
    this.accept(writer)
    return writer.toByteArray()
}

fun InputStream.toClassNode(flags: Int = ClassReader.SKIP_FRAMES): ClassNode = readBytes().toClassNode(flags)

val String.asmName: String get() = this.replace(".", "/")
val String.jvmName: String get() = this.replace("/", ".")