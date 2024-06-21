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
        Logger.info("Running updater marger.")


    }

    class MatchesSet<Node : Any, Match : AbstractMatch<Node>>(
        val createMatch: (Node) -> Match
    ) {
        val matches = identityMapOf<Node, Match>()
        val matchesInverse = identityMapOf<Node, Match>()
        val pendingMatches = identityMapOf<Node, Match>()

        fun pendingMatch(node: Node): Match {
            var match = matches[node]
            if(match != null) return match
            match = pendingMatches[node]
            if(match == null) {
                match = createMatch(node)
                pendingMatches[node] = match
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
            pendingMatches.remove(m.old)
            matches[m.old] = m
            matchesInverse[m.new!!] = m
            for(match in pendingMatches.values) {
                match.removeVote(m.new!!)
            }
        }
    }

    companion object {
        @JvmStatic
        fun jumpTo(target: Int, predicate: (MergeEngine) -> Boolean) = JumpOperation(target, predicate)
    }
}