package io.runebox.asm.expr

/**
 * Represents a Try-Catch block in the code.
 *
 * @property isStart Indicates whether this is the start of the Try-Catch block.
 * @property isEnd Indicates whether this is the end of the Try-Catch block.
 * @property isHandler Indicates whether this is the exception handler of the Try-Catch block.
 */
class TryCatch(
    val isStart: Boolean,
    val isEnd: Boolean,
    val isHandler: Boolean
)