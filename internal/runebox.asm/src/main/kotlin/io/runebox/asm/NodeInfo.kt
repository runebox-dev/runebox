package io.runebox.asm

import org.objectweb.asm.Opcodes.*

abstract class NodeInfo<T> {
    abstract val node: T
    abstract val group: ClassGroup
    abstract val access: Int
    abstract val name: String

    val isInterface get() = (access and ACC_INTERFACE) != 0
    val isAbstract get() = (access and ACC_ABSTRACT) != 0
    val isStatic get() = (access and ACC_STATIC) != 0
    val isPrivate get() = (access and ACC_PRIVATE) != 0
}