package io.runebox;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ObfInfo {
    public String origOwner() default "";
    public String origName() default "";
    public String origDesc() default "";
    public String opaqueType() default "";
    public int opaqueValue() default Integer.MIN_VALUE;
    public int multiplier() default Integer.MIN_VALUE;
}
