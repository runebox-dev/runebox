package io.runebox.updater.merge

import io.runebox.updater.asm.tree.ClassGroup
import io.runebox.updater.merge.match.AbstractMatch
import io.runebox.updater.merge.match.ClassMatch
import io.runebox.updater.merge.match.FieldMatch
import io.runebox.updater.merge.match.MethodMatch
import io.runebox.updater.util.collection.identityMapOf
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

class MergeEngine(
    val oldGroup: ClassGroup,
    val newGroup: ClassGroup
) {
    object Match {
        lateinit var Class: MatchesSet<ClassNode, ClassMatch> private set
        lateinit var Method: MatchesSet<MethodNode, MethodMatch> private set
        lateinit var Field: MatchesSet<FieldNode, FieldMatch> private set

        private fun init() {
            Class = MatchesSet { ClassMatch(it) }
        }

        init { init() }
    }

    fun merge() {

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
}