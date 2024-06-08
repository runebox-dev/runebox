package io.runebox.asm.util

@DslMarker
annotation class TernaryOpDsl

@Suppress("NOTHING_TO_INLINE")
@TernaryOpDsl
inline infix fun <T : Any> Boolean.T(value: T): T? = if(this) value else null