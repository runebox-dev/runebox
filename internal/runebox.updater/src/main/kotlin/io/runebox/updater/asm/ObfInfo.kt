package io.runebox.updater.asm

import org.objectweb.asm.tree.ClassNode

data class ObfInfo(
    val owner: String,
    val name: String,
    val desc: String,
    val opaque: String,
    val intMultiplier: Int,
    val longMultiplier: Long,
)

val ClassNode.obf: ObfInfo? get() {
    val anno = (this.visibleAnnotations ?: emptyList()).find("ObfInfo") ?: return null
    return ObfInfo(
        anno["owner", ""],
        anno["name", ""],
        anno["desc", ""],
        anno["opaque", ""],
        anno["intMultiplier", 0],
        anno["longMultiplier", 0L]
    )
}