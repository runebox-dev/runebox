package io.runebox.updater.asm.execution

import com.google.common.collect.HashMultimap
import io.runebox.asm.core.cls
import io.runebox.asm.core.nextReal
import io.runebox.asm.isStatic
import io.runebox.asm.print
import io.runebox.updater.Logger
import io.runebox.updater.asm.execution.Interpreter.execute
import org.objectweb.asm.Type
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.tree.TryCatchBlockNode

class Frame(val execution: Execution, val method: MethodNode) {
    var stack = Stack(method.maxStack)
    var locals = arrayOfNulls<LocalValue>(method.maxLocals)
    var states = mutableListOf<FrameState>()
    var tryCatchMap = HashMultimap.create<AbstractInsnNode, TryCatchBlockNode>()
    var isExecuting = true
    var cur: AbstractInsnNode? = null
    var order = 0

    init {
       for(tcb in method.tryCatchBlocks) {
           val startInsn = tcb.start.nextReal!!
           tryCatchMap.put(startInsn, tcb)
       }
    }

    fun initialize() {
        var pos = 0
        if(!method.access.isStatic) {
            locals[pos++] = LocalValue(Type.getObjectType(method.cls.name)).also { it.isParam = true }
        }

        val type = Type.getMethodType(method.desc)
        for(i in 0 until type.argumentTypes.size) {
            val arg = type.argumentTypes[i]
            locals[pos] = LocalValue(arg).also { it.isParam = true }
            pos += arg.size
        }

        cur = method.instructions.first
        if(cur!!.opcode == -1) cur = cur!!.nextReal
    }

    fun execute() {
        val insns = method.instructions
        while(isExecuting) {
            val oldCur = cur
            var state: FrameState
            try {
                state = cur!!.execute(this)
                states.add(state)
            } catch (e: Throwable) {
                Logger.error("Error executing insn: ${cur?.print()}")
                while(stack.size > 0) {
                    val pop = stack.pop()
                    println(pop)
                }
                throw e
            }

            if(oldCur === cur) {
                cur = cur?.nextReal
            }
        }
    }
}