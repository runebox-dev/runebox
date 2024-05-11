package io.runebox.asm

abstract class NodeInfo<T> {
    abstract val node: T
    abstract val group: ClassGroup
    abstract val access: Int
    abstract val name: String
}