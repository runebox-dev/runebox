package io.runebox.updater.ir.type;

public class DoubleType implements PrimitiveType {
    private static final DoubleType INSTANCE = new DoubleType();

    public static DoubleType getInstance() {
        return INSTANCE;
    }

    private DoubleType() {}

    @Override
    public String toString() {
        return DoubleType.class.getSimpleName() + "{}";
    }
}
