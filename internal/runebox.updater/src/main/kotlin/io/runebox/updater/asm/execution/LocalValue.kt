package io.runebox.updater.asm.execution

import org.objectweb.asm.Type

class LocalValue(val value: Value, val type: Type) {
    var stored: StackValue? = null
    var storer: FrameState? = null
    var isParam = false
    val readers = mutableSetOf<FrameState>()

    constructor(type: Type) : this(Value.UNKNOWN, type)

    constructor(insn: FrameState, local: StackValue) : this(local.value, local.type) {
        this.stored = local
        this.storer = insn
    }

    constructor(insn: FrameState, value: Value, type: Type) : this(value, type) {
        this.storer = insn
    }

    constructor(insn: FrameState, other: LocalValue) : this(other.value, other.type) {
        this.storer = insn
        this.stored = other.stored
    }

    override fun toString(): String {
        return "Local($value, $type)"
    }
}