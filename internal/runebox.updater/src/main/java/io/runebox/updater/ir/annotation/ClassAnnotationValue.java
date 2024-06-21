package io.runebox.updater.ir.annotation;

import io.runebox.updater.ir.type.Type;

import java.util.Objects;

/**
 * Representation of {@link Class} instance.
 */
public class ClassAnnotationValue implements AnnotationValue {
    private Type value;

    public ClassAnnotationValue(Type value) {
        this.value = value;
    }

    public Type getValue() {
        return value;
    }

    public void setValue(Type value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassAnnotationValue that = (ClassAnnotationValue) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return ClassAnnotationValue.class.getSimpleName() + '{' +
                "value=" + value +
                '}';
    }
}
