package io.runebox.updater.asm.execution

import org.objectweb.asm.tree.AbstractInsnNode

class FrameState(val instruction: AbstractInsnNode, val frame: Frame) {
    var stack = Stack(frame.stack)
    var locals = frame.locals.clone()
    val pops = mutableListOf<StackValue>()
    val pushes = mutableListOf<StackValue>()
    val reads = mutableListOf<LocalValue>()

    fun pop(vararg values: StackValue) {
        for(v in values) {
            v.addPopper(this)
            pops.add(v)
        }
    }

    fun push(vararg values: StackValue) {
        pushes.addAll(values)
    }

    fun read(vararg values: LocalValue) {
        for(v in values) {
            if(!v.readers.contains(this)) v.readers.add(this)
            reads.add(v)
        }
    }
}