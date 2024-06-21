package io.runebox;

public @interface ObfInfo {
	String name() default "";

	String desc() default "";

	String opaque() default "";

	int intMultiplier() default 0;

	long longMultiplier() default 0L;
}
