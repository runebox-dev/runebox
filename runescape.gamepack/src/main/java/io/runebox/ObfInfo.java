package io.runebox;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ObfInfo {
	String owner() default "";

	String name() default "";

	String desc() default "";

	String opaque() default "";

	int intMultiplier() default 0;

	long longMultiplier() default 0L;
}
