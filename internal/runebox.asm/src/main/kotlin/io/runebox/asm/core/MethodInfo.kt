package io.runebox.asm.core

data class MethodInfo(var name: String, var desc: String) {
    constructor(method: Method) : this(method.name, method.desc)

    override fun toString(): String {
        return "$name $desc"
    }
}