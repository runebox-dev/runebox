package io.runebox.updater.ir.ref.expr;

import io.runebox.updater.ir.ref.Expression;
import io.runebox.updater.ir.ref.Variable;
import io.runebox.updater.ir.type.ArrayType;
import io.runebox.updater.ir.type.Type;
import io.runebox.updater.ir.util.RCell;
import io.runebox.updater.ir.util.RWCell;

import java.util.Objects;
import java.util.Set;

/**
 * Reference an element of an array.
 */
public class ArrayBoxExpr implements Variable {
    /**
     * Array containing the referenced element.
     */
    private Expression array;

    /**
     * Index of the referenced element within the array.
     */
    private Expression index;

    public ArrayBoxExpr(Expression array, Expression index) {
        this.array = array;
        this.index = index;
    }

    public Expression getArray() {
        return array;
    }

    public void setArray(Expression array) {
        this.array = array;
    }

    public RWCell<Expression> getArrayCell() {
        return RWCell.of(this::getArray, this::setArray, Expression.class);
    }

    public Expression getIndex() {
        return index;
    }

    public void setIndex(Expression index) {
        this.index = index;
    }

    public RWCell<Expression> getIndexCell() {
        return RWCell.of(this::getIndex, this::setIndex, Expression.class);
    }

    @Override
    public Type getType() {
        return ((ArrayType) array.getType()).getLowerType();
    }

    @Override
    public Set<RCell<Expression>> getReadValueCells() {
        return Set.of(getArrayCell(), getIndexCell());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayBoxExpr expr = (ArrayBoxExpr) o;
        return Objects.equals(array, expr.array) &&
                Objects.equals(index, expr.index);
    }

    @Override
    public int hashCode() {
        return Objects.hash(array, index);
    }
}
