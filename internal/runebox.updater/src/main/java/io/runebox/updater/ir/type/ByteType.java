package io.runebox.updater.ir.type;

public class ByteType implements IntLikeType {
    private static final ByteType INSTANCE = new ByteType();

    public static ByteType getInstance() {
        return INSTANCE;
    }

    private ByteType() {}

    @Override
    public String toString() {
        return ByteType.class.getSimpleName() + "{}";
    }
}
