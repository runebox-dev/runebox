package io.runebox.deobfuscator.transformer

import io.runebox.asm.core.ClassPool
import io.runebox.asm.isStatic
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type
import org.objectweb.asm.tree.*

class LocalVarDefUseFixer : Transformer {

    private val blocks = hashMapOf<AbstractInsnNode, InsnBlock>()
    private val varInsnPartitionMap = LinkedHashMap<AbstractInsnNode, HashSet<AbstractInsnNode>>()
    private val paramLoads = hashSetOf<AbstractInsnNode>()
    private lateinit var startBlock: InsnBlock
    private var firstLocalIdx = -1

    override fun transform(pool: ClassPool) {
        for(cls in pool.classes) {
            for(method in cls.methods) {
                firstLocalIdx = method.firstLocalIndex
                startBlock = InsnBlock(null)
                startBlock.addNext(block(method.instructions.first))

                for(insn in method.instructions) {
                    val block = block(insn)
                    if(!insn.isTerminal) {
                        block.addNext(block(insn.next))
                    }

                }
            }
        }
    }

    val MethodNode.firstLocalIndex: Int get() {
        val isStatic = access.isStatic
        val argTypes = Type.getMethodType(desc).argumentTypes
        var argVarIdx = if(isStatic) 0 else 1
        for(argType in argTypes) {
            argVarIdx += argType.size
        }
        return argVarIdx
    }

    private val AbstractInsnNode.isTerminal: Boolean get() = when(opcode) {
        GOTO, RETURN, ARETURN, IRETURN, LRETURN, FRETURN, DRETURN, ATHROW, TABLESWITCH, LOOKUPSWITCH -> true
        else -> false
    }

    private val AbstractInsnNode.jumpTargets: List<LabelNode> get() {
        if(this is JumpInsnNode) {
            return listOf(this.label)
        }

        if(this is TableSwitchInsnNode) {
            val res = mutableListOf<LabelNode>(*labels.toTypedArray())
            res.add(dflt)
            return res
        }

        if(this is LookupSwitchInsnNode) {
            val res = mutableListOf<LabelNode>(*labels.toTypedArray())
            res.add(dflt)
            return res
        }

        return listOf()
    }

    private fun block(insn: AbstractInsnNode): InsnBlock {
        return blocks.computeIfAbsent(insn) { InsnBlock(it) }
    }

    private class InsnBlock(private val insn: AbstractInsnNode?) {
        private val prev = mutableListOf<InsnBlock>()
        private val next = mutableListOf<InsnBlock>()
        private var load = -1
        private var store = -1

        fun addNext(block: InsnBlock) {
            next.add(block)
            block.prev.add(this)
        }
    }
}