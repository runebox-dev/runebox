package io.runebox.updater.merge.match

import io.runebox.updater.asm.tree.cls
import io.runebox.updater.asm.tree.isStatic
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.MethodNode

class MethodMatch(old: MethodNode) : AbstractMatch<MethodNode>(old) {
    var ownerMatch: ClassNode? = null

    override fun vote(n: MethodNode): Boolean {
        if(new != null) return false
        if(old.isStatic xor n.isStatic) return false
        if(ownerMatch != null && n.cls.name != ownerMatch!!.name) return false
        if(old.name.startsWith("<") xor n.name.startsWith("<")) return false
        processVote(n)
        return true
    }
}