package io.runebox.deobfuscator.transformer

import io.runebox.asm.core.ClassPool
import io.runebox.deobfuscator.Logger
import io.runebox.deobfuscator.Transformer
import io.runebox.deobfuscator.asm.analysis.DataFlowAnalyzer
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.IincInsnNode
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.tree.VarInsnNode

class CopyPropagationFixer : Transformer {

    private var count = 0

    override fun transform(pool: ClassPool) {
        for(cls in pool.classes) {
            for(method in cls.methods) {
                val analyzer = CopyPropagationAnalyzer(method).also { it.analyze() }
                for(insn in method.instructions) {
                    if(insn !is VarInsnNode || !LOAD_OPCODES.contains(insn.opcode)) continue
                    val set = analyzer.getInSet(insn) ?: continue
                    val assignment = set.singleOrNull { it.destination == insn.`var` } ?: continue
                    insn.`var` = assignment.source
                    count++
                }
            }
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Propagated $count local variable stack copies to unique indexes.")
    }

    private data class CopyAssignment(val destination: Int, val source: Int)

    private class CopyPropagationAnalyzer(method: MethodNode) : DataFlowAnalyzer<Set<CopyAssignment>>(method) {

        private val allAssignments = mutableSetOf<CopyAssignment>()

        init {
            for(insn in method.instructions) {
                if(insn !is VarInsnNode || !STORE_OPCODES.contains(insn.opcode)) continue

                val previous = insn.previous
                if(previous !is VarInsnNode || !LOAD_OPCODES.contains(previous.opcode)) continue

                allAssignments += CopyAssignment(insn.`var`, previous.`var`)
            }
        }

        override fun createEntrySet(): Set<CopyAssignment> {
            return emptySet()
        }

        override fun createInitialSet(): Set<CopyAssignment> {
            return allAssignments
        }

        override fun join(set1: Set<CopyAssignment>, set2: Set<CopyAssignment>): Set<CopyAssignment> {
            return set1 intersect set2
        }

        override fun transfer(set: Set<CopyAssignment>, insn: AbstractInsnNode): Set<CopyAssignment> {
            return when {
                insn is VarInsnNode && STORE_OPCODES.contains(insn.opcode) -> {
                    val newSet = set.minusKilledByAssignmentTo(insn.`var`)

                    val previous = insn.previous
                    if(previous is VarInsnNode && LOAD_OPCODES.contains(previous.opcode)) {
                        newSet.plus(CopyAssignment(insn.`var`, previous.`var`))
                    } else {
                        newSet
                    }
                }
                insn is IincInsnNode -> set.minusKilledByAssignmentTo(insn.`var`)
                else -> set
            }
        }

        private fun Set<CopyAssignment>.minusKilledByAssignmentTo(index: Int): Set<CopyAssignment> {
            return filterTo(mutableSetOf()) { it.source != index && it.destination != index }
        }
    }

    companion object {
        val LOAD_OPCODES = setOf(
            ILOAD,
            LLOAD,
            FLOAD,
            DLOAD,
            ALOAD
        )
        val STORE_OPCODES = setOf(
            ISTORE,
            LSTORE,
            FSTORE,
            DSTORE,
            ASTORE
        )
    }
}