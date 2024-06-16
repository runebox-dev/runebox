package io.runebox.deobfuscator.transformer

import io.runebox.asm.core.ClassPool
import io.runebox.asm.isStatic
import io.runebox.deobfuscator.Logger
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.Type
import org.objectweb.asm.tree.FieldNode
import java.lang.reflect.Modifier

class FieldSorter : Transformer {

    private var count = 0

    override fun transform(pool: ClassPool) {
        for(cls in pool.classes) {
            count += cls.fields.size
            cls.fields = cls.fields.sortedWith(
                compareBy<FieldNode> { !it.access.isStatic }
                    .thenBy { Modifier.toString(it.access and Modifier.fieldModifiers()) }
                    .thenBy { Type.getType(it.desc).className }
                    .thenBy { it.name }
            )
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Sorted $count fields.")
    }
}