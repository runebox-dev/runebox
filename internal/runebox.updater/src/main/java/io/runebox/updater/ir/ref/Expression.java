package io.runebox.updater.ir.ref;

import io.runebox.updater.ir.type.Type;

public interface Expression extends Referencing {
    /**
     * The type of this value
     */
    Type getType();
}
