package io.runebox.asm.archive

import java.io.File

abstract class Archive(val file: File) {
    abstract fun read(): Map<String, ByteArray>
    abstract fun write(entries: Map<String, ByteArray>)
}