package io.runebox.deobfuscator.transformer

import io.runebox.asm.MemberDef
import io.runebox.asm.MemberRef
import io.runebox.asm.core.ClassPool
import io.runebox.asm.isStatic
import io.runebox.deobfuscator.Logger
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.Opcodes.GETSTATIC
import org.objectweb.asm.Opcodes.PUTSTATIC
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldInsnNode

class StaticFieldOwnerFixer : Transformer {

    private var count = 0

    override fun transform(pool: ClassPool) {
        val resolver = FieldOwnerResolver(pool)
        for(method in pool.classes.flatMap { it.methods }) {
            for(insn in method.instructions.iterator()) {
                if(insn is FieldInsnNode) {
                    val opcode = insn.opcode
                    val prevOwner = insn.owner
                    val isStatic = opcode in listOf(GETSTATIC, PUTSTATIC)
                    insn.owner = resolver.resolveOwner(MemberRef(insn), isStatic)
                    val newOwner = insn.owner
                    if(prevOwner != newOwner) count++
                }
            }
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Fixed $count static field owners.")
    }

    private class FieldOwnerResolver(private val pool: ClassPool) {

        fun resolveOwner(ref: MemberRef, isStatic: Boolean): String {
            var cls = pool.findClass(ref.owner)
            while(true) {
                if(cls.hasField(ref.toDef(), isStatic)) return cls.name
                cls = pool.findClass(cls.superName)
            }
        }

        private fun ClassNode.hasField(def: MemberDef, isStatic: Boolean): Boolean {
            return fields.any { it.name == def.name && it.desc == def.desc && it.access.isStatic == isStatic }
        }
    }
}