package io.runebox.asm

import org.objectweb.asm.tree.AbstractInsnNode

data class StackMetadata(val pops: Int, val pushes: Int) {
    companion object {
        val OPCODES = Array(202) { StackMetadata(0, 0) }
        init {
            val consume = ("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACCCCCCCCBCBCBAAA"
                    + "AAAAAAAAAAAAAAAAADEDEDDDDBCBCDCDECCECECECECECECECECECEBCBCCDCD"
                    + "CDCECECEABBBCCCBBBCCCBBBECCEEBBBBBBCCCCCCCCAAABBBCBCBAAAAAAAAA"
                    + "AABBBBBBBBAABBAA")
            val produce = ("ABBBBBBBBCCBBBCCBBBAABCBCBAAAAAAAAAAAAAAAAAAAABCBCBBBBAAAAAAAA"
                    + "AAAAAAAAAAAAAAAAAAAAAAAAAAACDEEFGCBCBCBCBCBCBCBCBCBCBCBCBCBCBC"
                    + "BCBCBCBCACBCBBCBCCBCBBBBBBBBBAAAAAAAAAAAAAAABAAAAAAAAAAAAAAAAA"
                    + "ABBBBBBBAAAAAAAA")
            repeat(202) { i ->
                OPCODES[i] = StackMetadata(consume[i] - 'A', produce[i] - 'A')
            }
        }
    }
}

val AbstractInsnNode.stackMetadata: StackMetadata get() = StackMetadata.OPCODES[opcode]
