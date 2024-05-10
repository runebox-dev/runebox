package io.runebox.asm.core

data class FieldInfo(var name: String, var desc: String) {
    constructor(field: Field) : this(field.name, field.desc)
}