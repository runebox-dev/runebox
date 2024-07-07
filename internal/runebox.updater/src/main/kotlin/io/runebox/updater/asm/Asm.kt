package io.runebox.updater.asm

fun String.isObfuscatedName(): Boolean {
    return (this.length <= 2 || (this.length == 3 && listOf("get", "add", "set", "put", "run", "abs", "err", "out").any { this.startsWith(it) }))
            || (listOf("Class", "method", "field", "staticMethod", "staticField").any { this.startsWith(it) })
}