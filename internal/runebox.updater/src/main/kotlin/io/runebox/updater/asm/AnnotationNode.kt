package io.runebox.updater.asm

import org.objectweb.asm.tree.AnnotationNode

inline operator fun <reified T : Any> AnnotationNode.get(key: String, default: T): T {
    var i = 0
    while(i < values.size) {
        if(values[i] == key) {
            return values[i+1] as? T ?: error("$key is not an instance of ${T::class}")
        }
        i += 2
    }
    return default
}

fun Collection<AnnotationNode>.find(name: String) = this.firstOrNull { it.desc.contains(name) }