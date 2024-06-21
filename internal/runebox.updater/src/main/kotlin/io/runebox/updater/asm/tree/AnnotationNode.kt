package io.runebox.updater.asm.tree

import org.objectweb.asm.Type
import org.objectweb.asm.tree.AnnotationNode
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode
import sun.reflect.annotation.AnnotationParser

@Suppress("UNCHECKED_CAST")
operator fun <T> AnnotationNode.get(key: String, default: T): T {
    if(!values.contains(key)) return default
    return values[values.indexOf(key) + 1] as T
}


inline fun <reified T : Annotation> AnnotationNode.parse(): T? {
    if(desc != Type.getDescriptor(T::class.java)) return null
    val valueMap = mutableMapOf<String, Any>()
    if(values != null && values.isNotEmpty()) {
        var i = 0
        while(i < values.size) {
            val key = values[i] as String
            val value = values[i + 1]
            valueMap[key] = value
            i += 2
        }
    }
    return AnnotationParser.annotationForMap(T::class.java, valueMap) as T
}

inline fun <reified T : Annotation> List<AnnotationNode>.parse(): T? {
    for(an in this) {
        val anno = an.parse<T>()
        if(anno != null) return anno
    }
    return null
}

val ClassNode.annotations: List<AnnotationNode> get() {
    if(visibleAnnotations == null) visibleAnnotations = mutableListOf()
    if(invisibleAnnotations == null) invisibleAnnotations = mutableListOf()
    return visibleAnnotations.plus(invisibleAnnotations)
}

val MethodNode.annotations: List<AnnotationNode> get() {
    if(visibleAnnotations == null) visibleAnnotations = mutableListOf()
    if(invisibleAnnotations == null) invisibleAnnotations = mutableListOf()
    return visibleAnnotations.plus(invisibleAnnotations)
}

val FieldNode.annotations: List<AnnotationNode> get() {
    if(visibleAnnotations == null) visibleAnnotations = mutableListOf()
    if(invisibleAnnotations == null) invisibleAnnotations = mutableListOf()
    return visibleAnnotations.plus(invisibleAnnotations)
}

fun ClassNode.annotation(desc: String) = annotations.firstOrNull { it.desc == desc }
fun MethodNode.annotation(desc: String) = annotations.firstOrNull { it.desc == desc }
fun FieldNode.annotation(desc: String) = annotations.firstOrNull { it.desc == desc }
