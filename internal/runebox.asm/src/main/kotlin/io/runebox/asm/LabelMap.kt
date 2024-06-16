package io.runebox.asm

import org.objectweb.asm.tree.LabelNode

class LabelMap : HashMap<LabelNode, LabelNode>() {
    override fun get(key: LabelNode): LabelNode {
        var ret = super.get(key)
        if(ret == null) {
            ret = LabelNode()
            super.put(key, ret)
        }
        return ret
    }
}