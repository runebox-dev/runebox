package io.runebox.asm

abstract class MemberInfo<T> : NodeInfo<T>() {
    abstract override val node: T
    abstract val cls: ClassInfo

    abstract override val access: Int
    abstract override val name: String
    abstract val desc: String

    override val group get() = cls.group
}