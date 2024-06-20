package io.runebox.updater.mapper

import io.runebox.updater.asm.Class2
import io.runebox.updater.asm.Field2
import io.runebox.updater.asm.Jar2
import io.runebox.updater.asm.Method2

interface ElementMatcher<out T> {
    fun match(jar: Jar2): T

    interface Class : ElementMatcher<Class2>
    interface Field : ElementMatcher<Field2>
    interface Method : ElementMatcher<Method2>
}