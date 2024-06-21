package io.runebox.updater.ir.ref.condition;

import io.runebox.updater.ir.ref.Expression;

/**
 * Check whether two values are not equal.
 */
public class NonEqual extends Condition {
    public NonEqual(Expression value1, Expression value2) {
        super(value1, value2);
    }

    @Override
    public Equal negate() {
        return new Equal(getValue1(), getValue2());
    }
}
