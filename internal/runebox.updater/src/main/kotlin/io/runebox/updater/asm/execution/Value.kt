package io.runebox.updater.asm.execution

import org.objectweb.asm.Type

class Value(val value: Any?) {

    fun get() = value!!

    val isNullOrUnknown get() = value == NULL || value == NULL

    override fun toString(): String {
        return "$value"
    }

    companion object {
        val NULL = Value(null)
        val UNKNOWN = Value(null)
    }
}

val NULL_TYPE = Type.getType(Nothing::class.java)