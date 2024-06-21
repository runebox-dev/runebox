package io.runebox.updater.ir.ref.stmt;

import io.runebox.updater.ir.ref.Expression;
import io.runebox.updater.ir.ref.Statement;
import io.runebox.updater.ir.ref.Variable;
import io.runebox.updater.ir.util.RCell;
import io.runebox.updater.ir.util.RWCell;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Assign a value to a variable
 */
public class AssignStmt implements Statement {
    /**
     * Variable that will be reassigned
     */
    private Variable variable;

    /**
     * Value to be assigned to the variable.
     */
    private Expression value;

    public AssignStmt(Variable variable, Expression value) {
        this.variable = variable;
        this.value = value;
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public RWCell<Variable> getVariableCell() {
        return RWCell.of(this::getVariable, this::setVariable, Variable.class);
    }

    public Expression getValue() {
        return value;
    }

    public void setValue(Expression value) {
        this.value = value;
    }

    public RWCell<Expression> getValueCell() {
        return RWCell.of(this::getValue, this::setValue, Expression.class);
    }

    @Override
    public Set<Expression> getReadValues() {
        return Set.of(getValue());
    }

    @Override
    public Set<RCell<Expression>> getReadValueCells() {
        return Set.of(getValueCell());
    }

    @Override
    public Set<Expression> getAllReadValues() {
        Stream<Expression> allReads = getReadValues().stream()
                .flatMap(read -> Stream.concat(Stream.of(read), read.getAllReadValues().stream()));

        Stream<Expression> readsOfWrites = getVariable().getAllReadValues().stream();

        return Stream.concat(allReads, readsOfWrites).collect(Collectors.toUnmodifiableSet());
    }

    @Override
    public Set<RCell<Expression>> getAllReadValueCells() {
        Stream<RCell<Expression>> allReadCells = getReadValueCells().stream()
                .flatMap(readCell -> Stream.concat(Stream.of(readCell), readCell.get().getAllReadValueCells().stream()));

        Stream<RCell<Expression>> readCellsOfWrite = getVariable().getAllReadValueCells().stream();

        return Stream.concat(allReadCells, readCellsOfWrite).collect(Collectors.toUnmodifiableSet());
    }

    @Override
    public Optional<Variable> getWriteValue() {
        return Optional.of(getVariable());
    }

    @Override
    public Optional<RWCell<Variable>> getWriteValueCell() {
        return Optional.of(getVariableCell());
    }
}
