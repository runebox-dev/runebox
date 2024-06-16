package io.runebox.deobfuscator.transformer

import io.runebox.asm.core.ClassPool
import io.runebox.asm.core.isConstructor
import io.runebox.asm.core.isInitializer
import io.runebox.asm.isStatic
import io.runebox.deobfuscator.Logger
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.Type
import org.objectweb.asm.tree.LineNumberNode
import org.objectweb.asm.tree.MethodNode
import java.lang.reflect.Modifier

class MethodSorter : Transformer {

    private var count = 0

    override fun transform(pool: ClassPool) {
        for(cls in pool.classes) {
            count += cls.methods.size
            cls.methods = cls.methods.sortedWith(
                compareBy<MethodNode> { !it.isInitializer }
                    .thenBy { !it.isConstructor }
                    .thenBy { it.access.isStatic }
                    .thenBy { it.lineNumber }
                    .thenBy { Modifier.toString(it.access and Modifier.methodModifiers()) }
                    .thenBy { Type.getMethodType(it.desc).returnType.className }
                    .thenBy { it.name }
            )
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Sorted $count methods.")
    }

    private val MethodNode.lineNumber: Int? get() {
        for(insn in instructions) {
            if(insn is LineNumberNode) return insn.line
        }
        return null
    }
}