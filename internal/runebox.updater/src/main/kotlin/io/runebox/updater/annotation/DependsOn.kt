package io.runebox.updater.annotation

import io.runebox.updater.mapper.Mapper
import java.lang.annotation.Inherited
import kotlin.reflect.KClass

@Inherited
@Target(AnnotationTarget.CLASS)
annotation class DependsOn(
    vararg val mappers: KClass<out Mapper<*>>
)