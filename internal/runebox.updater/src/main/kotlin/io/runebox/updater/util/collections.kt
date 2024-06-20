package io.runebox.updater.util

import java.util.*

fun <T> identityHashSetOf(vararg elements: T) = Collections.newSetFromMap<T>(IdentityHashMap())
fun <T> IdentityHashSet() = identityHashSetOf<T>()
