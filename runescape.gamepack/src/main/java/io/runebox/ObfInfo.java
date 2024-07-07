package io.runebox;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.TYPE_USE, ElementType.METHOD, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ObfInfo {
	String owner() default "";

	String name() default "";

	String desc() default "";

	String opaque() default "";

	int intMultiplier() default 0;

	long longMultiplier() default 0L;
}
