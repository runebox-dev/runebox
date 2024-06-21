package io.runebox.updater.ir.constant;

import io.runebox.updater.ir.type.ObjectType;
import io.runebox.updater.ir.type.Type;

import java.util.Objects;

/**
 * An instance of "java.lang.String".
 */
public class StringConstant implements FieldConstant, BootstrapConstant, PushableConstant, DexConstant, Constant {
    private final String value;

    public StringConstant(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringConstant that = (StringConstant) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return StringConstant.class.getSimpleName() + '{' +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public Type getType() {
        return ObjectType.STRING;
    }
}
