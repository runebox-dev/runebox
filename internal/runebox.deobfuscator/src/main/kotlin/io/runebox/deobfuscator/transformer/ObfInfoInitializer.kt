package io.runebox.deobfuscator.transformer

import io.runebox.asm.core.ClassPool
import io.runebox.asm.core.cls
import io.runebox.deobfuscator.Transformer
import io.runebox.deobfuscator.asm.origDesc
import io.runebox.deobfuscator.asm.origName
import io.runebox.deobfuscator.asm.origOwner

class ObfInfoInitializer : Transformer {
    override fun transform(pool: ClassPool) {
        for(cls in pool.classes) {
            cls.visibleAnnotations = emptyList()
            cls.invisibleAnnotations = emptyList()
        }
        for(cls in pool.allClasses) {
            cls.visibleAnnotations = cls.visibleAnnotations ?: emptyList()
            cls.invisibleAnnotations = cls.invisibleAnnotations ?: emptyList()
            cls.origName = cls.name
            for(method in cls.methods) {
                method.visibleAnnotations = method.visibleAnnotations ?: emptyList()
                method.invisibleAnnotations = method.invisibleAnnotations ?: emptyList()
                method.origOwner = method.cls.name
                method.origName = method.name
                method.origDesc = method.desc
            }
            for(field in cls.fields) {
                field.visibleAnnotations = field.visibleAnnotations ?: emptyList()
                field.invisibleAnnotations = field.invisibleAnnotations ?: emptyList()
                field.origOwner = field.cls.name
                field.origName = field.name
                field.origDesc = field.desc
            }
        }
    }
}