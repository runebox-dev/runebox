package io.runebox.asm.core

interface Member<T> : Node<T> {
    var cls: ClassFile
    var desc: String

    override val group get() = cls.group
}