package io.runebox.deobfuscator.transformer

import com.google.common.collect.MultimapBuilder
import io.runebox.asm.MemberRef
import io.runebox.asm.core.ClassPool
import io.runebox.asm.core.init
import io.runebox.asm.core.toRef
import io.runebox.deobfuscator.Logger
import io.runebox.deobfuscator.Transformer
import io.runebox.deobfuscator.isObfuscatedName
import org.objectweb.asm.Opcodes.GETSTATIC
import org.objectweb.asm.Opcodes.PUTSTATIC
import org.objectweb.asm.tree.FieldInsnNode
import org.objectweb.asm.tree.FieldNode
import java.util.*

class StaticFieldOrigClassMover : Transformer {

    private var count = 0

    override fun transform(pool: ClassPool) {
        val staticFieldRefs = MultimapBuilder.hashKeys().arrayListValues().build<MemberRef, MemberRef>()
        for(method in pool.classes.flatMap { it.methods }) {
            for(insn in method.instructions) {
                if(insn.opcode != GETSTATIC && insn.opcode != PUTSTATIC) continue
                insn as FieldInsnNode
                staticFieldRefs.put(MemberRef(insn), method.toRef())
            }
        }

        staticFieldRefs.asMap().entries.removeIf { it.value.any { it.name == "<clinit>" } }
        staticFieldRefs.asMap().entries.removeIf { it.value.size == 1 }
        staticFieldRefs.asMap().entries.removeIf { it.value.distinctBy { it.owner }.max().owner == it.key.owner }
        staticFieldRefs.asMap().entries.removeIf { !it.key.name.isObfuscatedName() }

        val fieldOwnerMap = TreeMap<MemberRef, String>()
        for((ref, usages) in staticFieldRefs.asMap().entries) {
            val newOwner = usages.maxBy { it.owner }.owner
            val oldOwner = ref.owner
            if(oldOwner == newOwner) continue
            fieldOwnerMap[ref] = newOwner
        }

        val movedFields = hashSetOf<FieldNode>()
        fieldOwnerMap.forEach { (ref, newOwner) ->
            val field = ref.resolveField(pool) ?: error("Failed to resolve field: $ref.")
            if(!field.name.isObfuscatedName()) return@forEach
            val newCls = pool.findClass(newOwner)

            val newField = FieldNode(field.access, field.name, field.desc, field.signature, field.value)
            newField.init(newCls)
            newCls.fields.add(newField)
            pool.findClass(ref.owner).fields.remove(field)
            count++
            movedFields.add(field)
        }

        for(method in pool.allClasses.flatMap { it.methods }) {
            for(insn in method.instructions) {
                if(insn !is FieldInsnNode) continue
                val ref = MemberRef(insn)
                if(fieldOwnerMap.containsKey(ref)) {
                    insn.owner = fieldOwnerMap[ref] ?: continue
                }
            }
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Moved $count static fields to their original classes.")
    }
}