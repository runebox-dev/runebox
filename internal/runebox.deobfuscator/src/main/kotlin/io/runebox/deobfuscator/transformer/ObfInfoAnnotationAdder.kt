package io.runebox.deobfuscator.transformer

import io.runebox.asm.core.*
import io.runebox.asm.toClassNode
import io.runebox.deobfuscator.Logger
import io.runebox.deobfuscator.Transformer
import io.runebox.deobfuscator.asm.*
import io.runebox.deobfuscator.isObfuscatedName
import org.objectweb.asm.tree.AnnotationNode
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

class ObfInfoAnnotationAdder : Transformer {

    override fun transform(pool: ClassPool) {
        pool.addObfInfoAnnotationClass()
        for(cls in pool.classes) {
            cls.addObfInfo()
            cls.methods.forEach { it.addObfInfo() }
            cls.fields.forEach { it.addObfInfo() }
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Added 'ObfInfo' annotations to all modified nodes.")
    }

    private fun ClassPool.addObfInfoAnnotationClass() {
        val cls = ObfInfoAnnotationAdder::class.java.getResourceAsStream("/io/runebox/ObfInfo.class")!!.readBytes().toClassNode()
        cls.name = "io/runebox/ObfInfo"
        cls.isIgnored = true
        addClass(cls)
        Logger.info("Added 'io/runebox/ObfInfo' class to pool.")
    }

    private fun ClassNode.addObfInfo() {
        if(!name.isObfuscatedName() && name != "Client") return
        val anno = AnnotationNode("io/runebox/ObfInfo").apply {
            values = mutableListOf<Any>()
            if(this@addObfInfo.name != origName) values.add("name", origName)
        }
        if(anno.values.isEmpty()) return
        visibleAnnotations = visibleAnnotations ?: mutableListOf()
        visibleAnnotations = visibleAnnotations.toTypedArray().copyOf().toMutableList().also { it.add(anno) }
    }

    private fun MethodNode.addObfInfo() {
        if(!name.isObfuscatedName()) return
        if(isConstructor || isInitializer) return
        val anno = AnnotationNode("io/runebox/ObfInfo").apply {
            values = mutableListOf<Any>()
            if(cls.origName.lowercase() != origOwner.lowercase()) values.add("owner", origOwner)
            if(name != origName || desc != origDesc) {
                values.add("name", origName)
                values.add("desc", origDesc)
            }
            if(opaque.isNotBlank()) values.add("opaque", opaque)
        }
        if(anno.values.isEmpty()) return
        visibleAnnotations = visibleAnnotations ?: mutableListOf()
        visibleAnnotations = visibleAnnotations.toTypedArray().copyOf().toMutableList().also { it.add(anno) }
    }

    private fun FieldNode.addObfInfo() {
        if(!name.isObfuscatedName()) return
        val anno = AnnotationNode("io/runebox/ObfInfo").apply {
            values = mutableListOf<Any>()
            if(cls.origName.lowercase() != origOwner.lowercase()) values.add("owner", origOwner)
            if(name != origName || desc != origDesc) {
                values.add("name", origName)
                values.add("desc", origDesc)
            }
            if(intMultiplier != 0) values.add("intMultiplier", intMultiplier)
            if(longMultiplier != 0L) values.add("longMultiplier", longMultiplier)
        }
        if(anno.values.isEmpty()) return
        visibleAnnotations = visibleAnnotations ?: mutableListOf()
        visibleAnnotations = visibleAnnotations.toTypedArray().copyOf().toMutableList().also { it.add(anno) }
    }

    private fun MutableList<Any>.add(key: String, value: Any) {
        add(key)
        add(value)
    }
}