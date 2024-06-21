package io.runebox.updater.ir.ref.expr;

import io.runebox.updater.ir.FieldRef;
import io.runebox.updater.ir.ref.Variable;
import io.runebox.updater.ir.type.Type;

import java.util.Objects;

public abstract class AbstractFieldExpr implements Variable {
    /**
     * The referenced field.
     */
    private FieldRef field;

    public AbstractFieldExpr(FieldRef field) {
        this.field = field;
    }

    public FieldRef getField() {
        return field;
    }

    public void setField(FieldRef field) {
        this.field = field;
    }

    @Override
    public Type getType() {
        return field.getType();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractFieldExpr that = (AbstractFieldExpr) o;
        return Objects.equals(field, that.field);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field);
    }
}
