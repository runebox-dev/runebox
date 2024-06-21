package io.runebox.updater.ir.ref.expr;

import io.runebox.updater.ir.ref.Expression;
import io.runebox.updater.ir.type.IntType;
import io.runebox.updater.ir.type.Type;

/**
 * Compare two float or double values.
 *
 * If both numbers are equal it evaluates to 0.
 * Otherwise it evaluates to either 1 or -1
 * depending on which number is greater.
 *
 * {@link CmplExpr} and {@link CmpgExpr} differ in the way they handle NaN.
 */
public class CmplExpr extends AbstractBinaryExpr {
    public CmplExpr(Expression value1, Expression value2) {
        super(value1, value2);
    }

    @Override
    public Type getType() {
        return IntType.getInstance();
    }
}
