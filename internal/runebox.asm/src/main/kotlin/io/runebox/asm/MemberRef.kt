package io.runebox.asm

data class MemberRef(val owner: String, val name: String, val desc: String) {

    override fun toString(): String {
        return "$owner.$name $desc"
    }
}