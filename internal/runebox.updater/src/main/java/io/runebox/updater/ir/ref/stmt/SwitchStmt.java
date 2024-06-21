package io.runebox.updater.ir.ref.stmt;

import io.runebox.updater.ir.ref.Expression;
import io.runebox.updater.ir.ref.Statement;
import io.runebox.updater.ir.util.RCell;
import io.runebox.updater.ir.util.RWCell;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Compare an int value against a branch table or else branch to a default location.
 */
public class SwitchStmt implements BranchStmt {
    /**
     * Value that will be compared against the branch table.
     */
    private Expression value;

    /**
     * Table that maps integers to branch locations.
     */
    private LinkedHashMap<Integer, Statement> branchTable;

    /**
     * Branch target if the value is not contained within the branch table.
     */
    private Statement defaultTarget;

    public SwitchStmt(Expression value, LinkedHashMap<Integer, Statement> branchTable, Statement defaultTarget) {
        this.value = value;
        this.branchTable = branchTable;
        this.defaultTarget = defaultTarget;
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

    public LinkedHashMap<Integer, Statement> getBranchTable() {
        return branchTable;
    }

    public void setBranchTable(LinkedHashMap<Integer, Statement> branchTable) {
        this.branchTable = branchTable;
    }

    public RWCell<Statement> getBranchTableCell(int key) {
        return RWCell.ofMap(key, branchTable, Statement.class);
    }

    public List<RWCell<Statement>> getBranchTableCells() {
        return this.branchTable.keySet().stream()
                .map(key -> RWCell.ofMap(key, this.branchTable, Statement.class))
                .collect(Collectors.toList());
    }

    public Statement getDefaultTarget() {
        return defaultTarget;
    }

    public void setDefaultTarget(Statement defaultTarget) {
        this.defaultTarget = defaultTarget;
    }

    public RWCell<Statement> getDefaultTargetCell() {
        return RWCell.of(this::getDefaultTarget, this::setDefaultTarget, Statement.class);
    }

    @Override
    public Set<RCell<Expression>> getReadValueCells() {
        return Set.of(getValueCell());
    }

    @Override
    public Set<Statement> getBranchTargets() {
        return Stream.concat(getBranchTable().values().stream(), Stream.of(getDefaultTarget()))
                .collect(Collectors.toUnmodifiableSet());
    }

    @Override
    public Set<RWCell<Statement>> getBranchTargetsCells() {
        return Stream.concat(getBranchTableCells().stream(), Stream.of(getDefaultTargetCell()))
                .collect(Collectors.toUnmodifiableSet());
    }

    @Override
    public boolean continuesExecution() {
        return false;
    }
}
