package io.runebox.deobfuscator.asm.analysis

import io.runebox.asm.util.collection.UniqueQueue
import org.jgrapht.Graph
import org.jgrapht.graph.DefaultEdge
import org.jgrapht.graph.EdgeReversedGraph
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.MethodNode

abstract class DataFlowAnalyzer<T>(
    val method: MethodNode,
    backwards: Boolean = false
) {
    private val graph: Graph<Int, DefaultEdge>
    private val inSets = mutableMapOf<Int, T>()
    private val outSets = mutableMapOf<Int, T>()

    init {
        val forwardsGraph = ControlFlowAnalyzer.create(method)
        graph = if(backwards) EdgeReversedGraph(forwardsGraph) else forwardsGraph
    }

    protected open fun createEntrySet(): T = createInitialSet()
    protected abstract fun createInitialSet(): T
    protected abstract fun join(set1: T, set2: T): T
    protected abstract fun transfer(set: T, insn: AbstractInsnNode): T

    fun getInSet(index: Int): T? = inSets[index]
    fun getInSet(insn: AbstractInsnNode): T? = getInSet(method.instructions.indexOf(insn))

    fun getOutSet(index: Int): T? = outSets[index]
    fun getOutSet(insn: AbstractInsnNode): T? = getOutSet(method.instructions.indexOf(insn))

    fun analyze() {
        val entrySet = createEntrySet()
        val initialSet = createInitialSet()

        val workList = UniqueQueue<Int>()
        workList += graph.vertexSet().filter { vertex -> graph.inDegreeOf(vertex) == 0 }

        while(true) {
            val node = workList.removeFirstOrNull() ?: break

            val predecessors = graph.incomingEdgesOf(node).map { edge ->
                outSets[graph.getEdgeSource(edge)] ?: initialSet
            }

            val inSet = if(predecessors.isEmpty()) entrySet else predecessors.reduce(this::join)
            inSets[node] = inSet

            val outSet = transfer(inSet, method.instructions[node])
            if(outSets[node] != outSet) {
                outSets[node] = outSet
                for(edge in graph.outgoingEdgesOf(node)) {
                    val successor = graph.getEdgeTarget(edge)
                    workList += successor
                }
            }
        }
    }
}