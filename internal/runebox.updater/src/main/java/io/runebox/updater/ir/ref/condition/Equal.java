package io.runebox.updater.ir.ref.condition;

import io.runebox.updater.ir.ref.Expression;

/**
 * Check whether two values are equal.
 */
public class Equal extends Condition {
    public Equal(Expression value1, Expression value2) {
        super(value1, value2);
    }

    @Override
    public NonEqual negate() {
        return new NonEqual(getValue1(), getValue2());
    }
}
