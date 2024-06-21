package io.runebox.updater.ir.ref.expr;

import io.runebox.updater.ir.FieldRef;
import io.runebox.updater.ir.ref.Expression;
import io.runebox.updater.ir.util.RCell;

import java.util.Set;

/**
 * Reference the value of a static field.
 */
public class StaticFieldExpr extends AbstractFieldExpr {
    public StaticFieldExpr(FieldRef field) {
        super(field);
    }

    @Override
    public Set<RCell<Expression>> getReadValueCells() {
        return Set.of();
    }
}
