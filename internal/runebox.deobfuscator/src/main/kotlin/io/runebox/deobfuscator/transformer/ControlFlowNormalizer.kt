package io.runebox.deobfuscator.transformer

import io.runebox.asm.core.ClassPool
import io.runebox.asm.core.cls
import io.runebox.asm.core.isTerminal
import io.runebox.asm.print
import io.runebox.deobfuscator.Logger
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.tree.*
import org.objectweb.asm.tree.analysis.Analyzer
import org.objectweb.asm.tree.analysis.AnalyzerException
import org.objectweb.asm.tree.analysis.BasicInterpreter
import org.objectweb.asm.tree.analysis.BasicValue
import java.util.*

class ControlFlowNormalizer : Transformer {

    private var count = 0

    override fun transform(pool: ClassPool) {
        for(cls in pool.classes) {
            for(method in cls.methods) {
                if(method.tryCatchBlocks.isNotEmpty() || method.instructions.size() == 0) continue
                val blocks = ControlFlowGraph(method).toMutableList()
                dfs(method, blocks)
                count += blocks.size
            }
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Normalized $count control-flow blocks.")
    }

    private fun dfs(method: MethodNode, blocks: MutableList<BasicBlock>) {
        if(blocks.isEmpty()) return

        val labelMap = object : HashMap<LabelNode, LabelNode>() {
            override fun get(key: LabelNode): LabelNode {
                var ret = super.get(key)
                if(ret == null) {
                    ret = LabelNode()
                    super.put(key, ret)
                }
                return ret
            }
        }

        val newInsns = InsnList()
        val stack = Stack<BasicBlock>()
        val visited = hashSetOf<BasicBlock>()

        stack.push(blocks.first())
        while(stack.isNotEmpty()) {
            val block = stack.pop()
            if(visited.contains(block)) continue
            visited.add(block)

            for(child in block.successors.sortedBy { it.line }) {
                stack.push(child.root)
            }

            if(block.next != null) {
                stack.push(block.next)
            }

            for(insn in block.instructions) {
                newInsns.add(insn.clone(labelMap))
            }
        }

        method.instructions = newInsns
    }

    private class ControlFlowGraph(private val method: MethodNode) : Analyzer<BasicValue>(BasicInterpreter()), Iterable<BasicBlock> {

        private val blocks = mutableListOf<BasicBlock>()

        init {
            try {
                analyze(method.cls.name, method)
            } catch (e: AnalyzerException) {
                //e.printStackTrace()
            }

            for(block in blocks) {
                block.line = block.instructions.filterIsInstance<LineNumberNode>().firstOrNull()?.line ?: -1
            }
        }

        override fun init(owner: String, method: MethodNode) {
            var block = BasicBlock(1)
            blocks.add(block)

            for(i in 0 until method.instructions.size()) {
                val insn = method.instructions[i]
                block.instructions.add(insn)
                if(insn.next != null && insn.next.opcode != GOTO && insn.isTerminal) {
                    blocks.add(BasicBlock(blocks.size + 1).also { block = it })
                }
            }
        }

        override fun newControlFlowEdge(fromIndex: Int, toIndex: Int) {
            val fromInsn = method.instructions[fromIndex]
            val toInsn = method.instructions[toIndex]

            val fromBlock = blocks.firstOrNull { it.contains(fromInsn) }
            val toBlock = blocks.firstOrNull { it.contains(toInsn) }

            if(fromBlock == toBlock || fromBlock == null || toBlock == null) return
            if(toIndex == fromIndex + 1) {
                fromBlock.next = toBlock
                toBlock.previous = fromBlock
            } else {
                fromBlock.successors.add(toBlock)
                toBlock.predecessors.add(fromBlock)
            }
        }

        override fun iterator(): Iterator<BasicBlock> {
            return blocks.iterator()
        }
    }

    private class BasicBlock(val id: Int) {
        var line = -1

        var predecessors = hashSetOf<BasicBlock>()
        var successors = hashSetOf<BasicBlock>()
        var next: BasicBlock? = null
        var previous: BasicBlock? = null

        val instructions = mutableListOf<AbstractInsnNode>()

        fun contains(insn: AbstractInsnNode) = instructions.contains(insn)

        val root: BasicBlock get() {
            var block = this
            var pred = block.previous
            while(pred != null) {
                block = pred
                pred = block.previous
            }
            return block
        }

        override fun toString(): String {
            val str = StringBuilder()
            str.appendLine("=== BLOCK: $id ===")
            for(insn in instructions) {
                str.appendLine(insn.print().trim())
            }
            str.appendLine("")
            return str.toString()
        }
    }
}