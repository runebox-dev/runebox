package io.runebox.asm

import io.runebox.asm.core.init
import io.runebox.asm.core.pool
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.ClassNode

val Int.isPrivate get() = (this and ACC_PRIVATE) != 0
val Int.isAbstract get() = (this and ACC_ABSTRACT) != 0
val Int.isInterface get() = (this and ACC_INTERFACE) != 0
val Int.isStatic get() = (this and ACC_STATIC) != 0
val Int.isFinal get() = (this and ACC_FINAL) != 0
val Int.isProtected get() = (this and ACC_PROTECTED) != 0
val Int.isPublic get() = (this and ACC_PUBLIC) != 0

fun ByteArray.toClassNode(flags: Int = ClassReader.SKIP_FRAMES): ClassNode {
    val reader = ClassReader(this)
    val node = ClassNode()
    reader.accept(node, flags)
    return node
}

fun ClassNode.toByteArray(flags: Int = ClassWriter.COMPUTE_MAXS): ByteArray {
    val writer = ClassWriter(flags)
    this.accept(writer)
    return writer.toByteArray()
}

fun ClassNode.computeStackFrames(): ClassNode {
    val writer = AsmClassWriter(pool)
    this.accept(writer)

    val reader = ClassReader(writer.toByteArray())
    val newNode = ClassNode()
    reader.accept(newNode, ClassReader.EXPAND_FRAMES)

    newNode.init(pool)
    methods = newNode.methods

    return this
}
