package io.runebox.asm

data class MemberDef(val name: String, val desc: String) {

    override fun toString(): String {
        return "$name $desc"
    }
}