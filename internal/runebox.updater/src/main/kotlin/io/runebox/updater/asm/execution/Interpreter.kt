package io.runebox.updater.asm.execution

import io.runebox.asm.core.isTerminal
import io.runebox.asm.stackMetadata
import org.objectweb.asm.tree.AbstractInsnNode

object Interpreter {

    fun AbstractInsnNode.execute(frame: Frame): FrameState {
        val meta = this.stackMetadata

        val state = FrameState(this, frame)
        val stack = frame.stack

        repeat(meta.pops) {
            val v = stack.pop()
            state.pop(v)
        }

        repeat(meta.pushes) {
            val v = Value.UNKNOWN
            val sv = StackValue(state, v, NULL_TYPE)
            stack.push(sv)
            state.push(sv)
        }

        if(this.isTerminal) {
            frame.isExecuting = false
        }

        return state
    }
}