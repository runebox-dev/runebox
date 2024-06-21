package io.runebox.updater.merge.match

abstract class AbstractMatch<T : Any>(val old: T) {

    var isMerged: Boolean = false
    var highest: Int = 0
    var second: Int = 0
    var best: T? = null
    var votes = hashMapOf<T, Int>()

    var new: T? = null
        set(value) {
            field = value
            votes = hashMapOf()
        }

    open fun vote(n: T): Boolean {
        if(new != null) return new == n
        if(old::class != n::class) return false
        processVote(n)
        return true
    }

    internal fun processVote(n: T) {
        val v = votes[n]
        if(v != null) {
            val vote = v + 1
            votes[n] = vote
            if(vote > highest) {
                if(n == best) {
                    highest = vote
                } else {
                    second = highest
                    highest = vote
                    best = n
                }
            } else if(vote > second) {
                second = vote
            }
        } else {
            votes[n] = 1
            if(highest == 0) {
                highest = 1
                best = n
            }
        }
    }

    fun removeVote(n: T) {
        votes.remove(n)
        second = 0
        highest = 0
        best = null
        for((type, vote) in votes.entries) {
            if(vote > highest) {
                second = highest
                highest = vote
                best = type
            } else if(vote > second) {
                second = vote
            }
        }
    }
}