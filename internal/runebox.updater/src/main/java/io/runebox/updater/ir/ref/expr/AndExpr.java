package io.runebox.updater.ir.ref.expr;

import io.runebox.updater.ir.ref.Expression;
import io.runebox.updater.ir.type.Type;

/**
 * Instructions that calculates the 'logical and' of two numeric values.
 */
public class AndExpr extends AbstractBinaryExpr {
    public AndExpr(Expression value1, Expression value2) {
        super(value1, value2);
    }

    @Override
    public Type getType() {
        Type type1 = getValue1().getType();
        Type type2 = getValue2().getType();
        if (type1.equals(type2)) {
            return type1;
        } else {
            throw new IllegalStateException("Cannot and values of types " + type1 + " and " + type2);
        }
    }
}