package io.runebox.updater.ir.ref.stmt;

import io.runebox.updater.ir.ref.Expression;

/**
 * Throw an exception
 */
public class ThrowStmt extends AbstractUnaryStmt {
    public ThrowStmt(Expression value) {
        super(value);
    }

    @Override
    public boolean continuesExecution() {
        return false;
    }
}
