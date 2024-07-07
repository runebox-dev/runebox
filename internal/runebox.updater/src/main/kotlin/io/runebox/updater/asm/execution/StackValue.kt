package io.runebox.updater.asm.execution

import org.objectweb.asm.Type

class StackValue(val value: Value, val type: Type) {
    var pusher: FrameState? = null
    val poppers = mutableListOf<FrameState>()

    constructor(insn: FrameState, value: Value, type: Type) : this(value, type) {
        this.pusher = insn
    }

    constructor(insn: FrameState, local: LocalValue) : this(local.value, local.type) {
        this.pusher = insn
    }

    fun addPopper(state: FrameState) { if(!poppers.contains(state)) poppers.add(state) }

    override fun toString(): String {
        return "StackValue(value=$value, type=$type)"
    }
}