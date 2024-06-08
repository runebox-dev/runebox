package io.runebox.asm.util

@DslMarker annotation class TernaryOpTrueDsl
@DslMarker annotation class TernaryOpFalseDslMarker

@Suppress("NOTHING_TO_INLINE")
@TernaryOpTrueDsl
inline infix fun <T> Boolean.T(trueOutput: T) = TernaryPart(this, trueOutput)

@TernaryOpFalseDslMarker
inline infix fun <T> TernaryPart<T>.F(falseOutput: T) = if (condition) trueOutput else falseOutput

class TernaryPart<T>(val condition: Boolean, val trueOutput: T)

// T overload for conditional evaluation of functional arguments
@TernaryOpTrueDsl
fun <T> Boolean.T(trueBranch: () -> T) = TernaryPart(this, trueBranch)

// F overload for conditional evaluation of functional arguments
@TernaryOpFalseDslMarker
inline infix fun <T, U: () -> T> TernaryPart<U>.F(falseBranch: U) = if (condition) trueOutput() else falseBranch()
