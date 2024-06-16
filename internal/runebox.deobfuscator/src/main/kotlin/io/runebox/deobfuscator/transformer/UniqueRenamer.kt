package io.runebox.deobfuscator.transformer

import io.runebox.asm.core.ClassPool
import io.runebox.asm.remap.AsmRemapper
import io.runebox.asm.remap.NameMap
import io.runebox.asm.remap.remap
import io.runebox.deobfuscator.Logger
import io.runebox.deobfuscator.Transformer
import io.runebox.deobfuscator.isObfuscatedName

class UniqueRenamer : Transformer {

    private var classCount = 0
    private var methodCount = 0
    private var fieldCount = 0

    private lateinit var mappings: NameMap

    override fun transform(pool: ClassPool) {
        mappings = NameMap(pool)

        Logger.info("Generating name mappings...")

        mappings.mapClass(pool.findClass("client"), "Client")
        for(cls in pool.classes) {
            if(!cls.name.isObfuscatedName()) continue
            mappings.mapClass(cls, "class${++classCount}")
        }
        for(cls in pool.classes) {
            for(method in cls.methods) {
                if(!method.name.isObfuscatedName()) continue
                mappings.mapMethod(method, "method${++methodCount}")
            }
        }
        for(cls in pool.classes) {
            for(field in cls.fields) {
                if(!field.name.isObfuscatedName()) continue
                mappings.mapField(field, "field${++fieldCount}")
            }
        }

        Logger.info("Applying name mappings...")

        val remapper = AsmRemapper(mappings)
        for(cls in pool.classes) {
            cls.remap(remapper)
        }

        Logger.info("Renamed Classes: $classCount, Methods: $methodCount, Fields: $fieldCount.")
    }
}