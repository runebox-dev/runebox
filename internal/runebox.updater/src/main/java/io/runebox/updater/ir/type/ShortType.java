package io.runebox.updater.ir.type;

public class ShortType implements IntLikeType {
    private static final ShortType INSTANCE = new ShortType();

    public static ShortType getInstance() {
        return INSTANCE;
    }

    private ShortType() {}

    @Override
    public String toString() {
        return ShortType.class.getSimpleName() + "{}";
    }
}
