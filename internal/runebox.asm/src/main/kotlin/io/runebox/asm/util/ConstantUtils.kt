package io.runebox.asm.util

val Any.isDoubleOrLong: Boolean get() = (this is Double || this is Long)