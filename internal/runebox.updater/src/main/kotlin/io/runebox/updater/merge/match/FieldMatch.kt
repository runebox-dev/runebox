package io.runebox.updater.merge.match

import io.runebox.updater.asm.tree.cls
import io.runebox.updater.asm.tree.isStatic
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode

class FieldMatch(old: FieldNode) : AbstractMatch<FieldNode>(old) {
    var ownerMatch: ClassNode? = null

    override fun vote(n: FieldNode): Boolean {
        if(new != null) return false
        if(old.isStatic xor n.isStatic) return false
        if(ownerMatch != null && n.cls.name != ownerMatch!!.name) return false
        processVote(n)
        return true
    }
}