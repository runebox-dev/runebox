package io.runebox.deobfuscator.transformer

import io.runebox.asm.core.*
import io.runebox.asm.toClassNode
import io.runebox.deobfuscator.Logger
import io.runebox.deobfuscator.Transformer
import io.runebox.deobfuscator.asm.*
import org.objectweb.asm.tree.AnnotationNode
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

class ObfInfoAnnotationAdder : Transformer {

    override fun transform(pool: ClassPool) {
        pool.addObfInfoAnnotationClass()
        for(cls in pool.classes) {
           if(cls.name != cls.origName) cls.addObfInfo()
            for(method in cls.methods) {
                if(method.isConstructor || method.isInitializer) continue
                if(method.cls.name != method.origOwner
                    || method.name != method.origName
                    || method.desc != method.origDesc
                    || (method.opaqueType != null && method.opaqueValue != null))
                {
                    method.addObfInfo()
                }
            }
            for(field in cls.fields) {
                if(field.cls.name != field.origOwner
                    || field.name != field.origName
                    || field.desc != field.origDesc
                    || field.multiplier != null)
                {
                    field.addObfInfo()
                }
            }
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Added 'ObfInfo' annotations to all modified nodes.")
    }

    private fun ClassPool.addObfInfoAnnotationClass() {
        val cls = ObfInfoAnnotationAdder::class.java.getResourceAsStream("/io/runebox/ObfInfo.class")!!.readBytes().let { it.toClassNode() }
        cls.name = "io/runebox/ObfInfo"
        cls.isIgnored = true
        cls.visibleAnnotations.clear()
        addClass(cls)
        Logger.info("Added 'io/runebox/ObfInfo' class to pool.")
    }

    private fun ClassNode.addObfInfo() {
        val anno = AnnotationNode("io/runebox/ObfInfo").also {
            it.values = listOf(
                "origName", origName
            )
        }
        visibleAnnotations = visibleAnnotations.toTypedArray().copyOf().toMutableList().also { it.add(anno) }
    }

    private fun MethodNode.addObfInfo() {
        val anno = AnnotationNode("io/runebox/ObfInfo").also {
            val vals = mutableListOf<Any>(
                "origOwner", origOwner,
                "origName", origName,
                "origDesc", origDesc,
            )
            if(opaqueType != null && opaqueValue != null) vals.addAll(listOf(
                "opaqueType", opaqueType!!,
                "opaqueValue", opaqueValue!!
            ))
            it.values = vals.toList()
        }
        visibleAnnotations = visibleAnnotations.toTypedArray().copyOf().toMutableList().also { it.add(anno) }
    }

    private fun FieldNode.addObfInfo() {
        val anno = AnnotationNode("io/runebox/ObfInfo").also {
            val vals = mutableListOf<Any>(
                "origOwner", origOwner,
                "origName", origName,
                "origDesc", origDesc
            )
            if(multiplier != null) {
                vals.addAll(listOf(
                    "multiplier", multiplier!!
                ))
            }
            it.values = vals.toList()
        }
        visibleAnnotations = (visibleAnnotations ?: emptyList()).toTypedArray().copyOf().toMutableList().also { it.add(anno) }
    }
}