package io.runebox.asm.core

interface Node<T> {
    val group: ClassGroup
    var access: Int
    var name: String
}