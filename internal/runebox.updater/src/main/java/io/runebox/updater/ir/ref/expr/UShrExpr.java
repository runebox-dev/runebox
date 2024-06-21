package io.runebox.updater.ir.ref.expr;

import io.runebox.updater.ir.ref.Expression;
import io.runebox.updater.ir.type.Type;

/**
 * Bitwise shift a int or long to the right while <b>not</b> preserving the sign.
 */
public class UShrExpr extends AbstractBinaryExpr {
    /**
     * Create a new UShrExpr.
     *
     * @param value1 value to be shifted
     * @param value2 amount of bits to shift
     */
    public UShrExpr(Expression value1, Expression value2) {
        super(value1, value2);
    }

    @Override
    public Type getType() {
        return getValue1().getType();
    }
}
