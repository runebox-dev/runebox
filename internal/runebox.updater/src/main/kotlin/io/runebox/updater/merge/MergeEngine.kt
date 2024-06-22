package io.runebox.updater.merge

import io.runebox.updater.Logger
import io.runebox.updater.asm.tree.ClassGroup
import io.runebox.updater.merge.mapping.MappingsSet
import io.runebox.updater.merge.match.AbstractMatch
import io.runebox.updater.merge.match.ClassMatch
import io.runebox.updater.merge.match.FieldMatch
import io.runebox.updater.merge.match.MethodMatch
import io.runebox.updater.merge.operation.JumpOperation
import io.runebox.updater.util.collection.identityMapOf
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

class MergeEngine(
    val oldGroup: ClassGroup,
    val newGroup: ClassGroup
) {
    val Class = MatchesSet<ClassNode, ClassMatch> { ClassMatch(it) }
    val Method = MatchesSet<MethodNode, MethodMatch> { MethodMatch(it) }
    val Field = MatchesSet<FieldNode, FieldMatch> { FieldMatch(it) }

    var changesLastCycle: Int = 0
        private set

    fun incChanges() { changesLastCycle++ }
    fun resetChanges() { changesLastCycle = 0 }

    private val operations = mutableListOf<MergeOperation>()
    fun addOperation(op: MergeOperation) { operations.add(op) }

    val oldMappings = MappingsSet()
    val newMappings = MappingsSet()

    fun merge() {
        Logger.info("Starting merge matching...")

        var i = 0
        while(i < operations.size) {
            val op = operations[i]
            if(op is JumpOperation) {
                if(op.predicate(this)) {
                    i = op.target - 1
                }
                i++
                continue
            }
            op.operate(this)
            i++
        }

        Logger.info("Completed merge matching.")
    }

    class MatchesSet<Node : Any, Match : AbstractMatch<Node>>(
        val createMatch: (Node) -> Match
    ) {
        val matches = identityMapOf<Node, Match>()
        val matchesInverse = identityMapOf<Node, Match>()
        private val _pendingMatches = identityMapOf<Node, Match>()

        val allMatches get() = matches.values
        val pendingMatches get() = _pendingMatches.values

        fun pendingMatch(node: Node): Match {
            var match = matches[node]
            if(match != null) return match
            match = _pendingMatches[node]
            if(match == null) {
                match = createMatch(node)
                _pendingMatches[node] = match
            }
            return match
        }

        fun vote(old: Node, n: Node): Boolean {
            val match = pendingMatch(old)
            if(matchesInverse.containsKey(n)) {
                return match.new == n
            }
            return match.vote(n)
        }

        fun isMatched(node: Node) = matchesInverse.containsKey(node) || matches.containsKey(node)

        fun markAsMatched(m: Match) {
            if(m.new == null) throw IllegalStateException("New type in match was null when trying to mark matched.")
            _pendingMatches.remove(m.old)
            matches[m.old] = m
            matchesInverse[m.new!!] = m
            for(match in _pendingMatches.values) {
                match.removeVote(m.new!!)
            }
        }
    }

    companion object {
        @JvmStatic
        fun jumpTo(target: Int, predicate: (MergeEngine) -> Boolean) = JumpOperation(target, predicate)
    }
}