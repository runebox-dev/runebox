package io.runebox.updater.ir.ref.condition;

import io.runebox.updater.ir.ref.Expression;

/**
 * Check whether one number is less or equal than another.
 */
public class LessEqual extends Condition {
    public LessEqual(Expression value1, Expression value2) {
        super(value1, value2);
    }

    @Override
    public GreaterThan negate() {
        return new GreaterThan(getValue1(), getValue2());
    }
}
