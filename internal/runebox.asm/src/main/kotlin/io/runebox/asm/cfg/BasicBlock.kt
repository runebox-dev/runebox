package io.runebox.asm.cfg

import org.objectweb.asm.tree.MethodNode

class BasicBlock(val method: MethodNode) {

    val children = mutableListOf<BasicBlock>()
    var predecessor: BasicBlock? = null

}