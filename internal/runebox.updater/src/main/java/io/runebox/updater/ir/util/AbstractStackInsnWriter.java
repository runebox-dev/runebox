package io.runebox.updater.ir.util;

import io.runebox.updater.ir.FieldRef;
import io.runebox.updater.ir.Path;
import io.runebox.updater.ir.constant.PushableConstant;
import io.runebox.updater.ir.stack.StackLocal;
import io.runebox.updater.ir.stack.insn.*;
import io.runebox.updater.ir.stack.invoke.Invoke;
import io.runebox.updater.ir.type.ArrayType;
import io.runebox.updater.ir.type.PrimitiveType;
import io.runebox.updater.ir.type.RefType;
import io.runebox.updater.ir.type.Type;

import java.util.*;

/**
 * Abstract superclass for visitors that collects all events represented as {@link Instruction}.
 */
public abstract class AbstractStackInsnWriter<I, L> extends StackInsnVisitor<I, L> {
    private List<Instruction> instructions = new ArrayList<>();

    public AbstractStackInsnWriter() {
        super(null);
    }

    public abstract void registerTargetCell(I target, RWCell<Instruction> cell);

    public abstract StackLocal convertLocal(L local);

    /**
     * Get all yet collected events.
     *
     * @return a list of instructions
     */
    public List<Instruction> getInstructions() {
        return instructions;
    }

    private void visitInsn(Instruction instruction) {
        instructions.add(instruction);
    }

    @Override
    public void visitPush(PushableConstant constant) {
        visitInsn(new PushInsn(constant));
    }

    @Override
    public void visitNeg(Type type) {
        visitInsn(new NegInsn(type));
    }

    @Override
    public void visitAdd(Type type) {
        visitInsn(new AddInsn(type));
    }

    @Override
    public void visitSub(Type type) {
        visitInsn(new SubInsn(type));
    }

    @Override
    public void visitMul(Type type) {
        visitInsn(new MulInsn(type));
    }

    @Override
    public void visitDiv(Type type) {
        visitInsn(new DivInsn(type));
    }

    @Override
    public void visitMod(Type type) {
        visitInsn(new ModInsn(type));
    }

    @Override
    public void visitAnd(Type type) {
        visitInsn(new AndInsn((type)));
    }

    @Override
    public void visitOr(Type type) {
        visitInsn(new OrInsn((type)));
    }

    @Override
    public void visitXor(Type type) {
        visitInsn(new XorInsn(type));
    }

    @Override
    public void visitShl(Type type) {
        visitInsn(new ShlInsn(type));
    }

    @Override
    public void visitShr(Type type) {
        visitInsn(new ShrInsn(type));
    }

    @Override
    public void visitUShr(Type type) {
        visitInsn(new UShrInsn(type));
    }

    @Override
    public void visitCmp() {
        visitInsn(new CmpInsn());
    }

    @Override
    public void visitCmpl(Type type) {
        visitInsn(new CmplInsn(type));
    }

    @Override
    public void visitCmpg(Type type) {
        visitInsn(new CmpgInsn(type));
    }

    @Override
    public void visitNewArray(ArrayType type, int initializedDimensions) {
        visitInsn(new NewArrayInsn(type, initializedDimensions));
    }

    @Override
    public void visitArrayLength() {
        visitInsn(new ArrayLengthInsn());
    }

    @Override
    public void visitArrayLoad(Type type) {
        visitInsn(new ArrayLoadInsn(type));
    }

    @Override
    public void visitArrayStore(Type type) {
        visitInsn(new ArrayStoreInsn(type));
    }

    @Override
    public void visitSwap() {
        visitInsn(new SwapInsn());
    }

    @Override
    public void visitPop() {
        visitInsn(new PopInsn());
    }

    @Override
    public void visitDup() {
        visitInsn(new DupInsn());
    }

    @Override
    public void visitDupX1() {
        visitInsn(new DupX1Insn());
    }

    @Override
    public void visitDupX2() {
        visitInsn(new DupX2Insn());
    }

    @Override
    public void visitDup2() {
        visitInsn(new Dup2Insn());
    }

    @Override
    public void visitDup2X1() {
        visitInsn(new Dup2X1Insn());
    }

    @Override
    public void visitDup2X2() {
        visitInsn(new Dup2X2Insn());
    }

    @Override
    public void visitLoad(Type type, L local) {
        visitInsn(new LoadInsn(type, convertLocal(local)));
    }

    @Override
    public void visitStore(Type type, L local) {
        visitInsn(new StoreInsn(type, convertLocal(local)));
    }

    @Override
    public void visitIncrement(L local, int value) {
        visitInsn(new IncrementInsn(convertLocal(local), value));
    }

    @Override
    public void visitNew(Path type) {
        visitInsn(new NewInsn(type));
    }

    @Override
    public void visitInstanceOf(RefType type) {
        visitInsn(new InstanceOfInsn(type));
    }

    @Override
    public void visitPrimitiveCast(PrimitiveType from, PrimitiveType to) {
        visitInsn(new PrimitiveCastInsn(from, to));
    }

    @Override
    public void visitReferenceCast(RefType type) {
        visitInsn(new RefCastInsn(type));
    }

    @Override
    public void visitReturn(Optional<Type> type) {
        visitInsn(new ReturnInsn(type));
    }

    @Override
    public void visitThrow() {
        visitInsn(new ThrowInsn());
    }

    @Override
    public void visitMonitorEnter() {
        visitInsn(new MonitorEnterInsn());
    }

    @Override
    public void visitMonitorExit() {
        visitInsn(new MonitorExitInsn());
    }

    @Override
    public void visitFieldGet(FieldRef fieldRef, boolean isStatic) {
        visitInsn(new FieldGetInsn(fieldRef, isStatic));
    }

    @Override
    public void visitFieldSet(FieldRef fieldRef, boolean isStatic) {
        visitInsn(new FieldSetInsn(fieldRef, isStatic));
    }

    @Override
    public void visitInvokeInsn(Invoke invoke) {
        visitInsn(new InvokeInsn(invoke));
    }

    @Override
    public void visitGoto(I target) {
        GotoInsn insn = new GotoInsn(null);
        registerTargetCell(target, insn.getTargetCell());

        visitInsn(insn);
    }

    @Override
    public void visitIf(IfInsn.Condition condition, I target) {
        IfInsn insn = new IfInsn(condition, null);
        registerTargetCell(target, insn.getTargetCell());

        visitInsn(insn);
    }

    @Override
    public void visitSwitch(Map<Integer, I> targetTable, I defaultTarget) {
        LinkedHashMap<Integer, Instruction> table = new LinkedHashMap<>();
        SwitchInsn insn = new SwitchInsn(table, null);

        registerTargetCell(defaultTarget, insn.getDefaultLocationCell());
        targetTable.forEach((key, label) -> {
            table.put(key, null);
            registerTargetCell(label, RWCell.ofMap(key, table, Instruction.class));
        });

        visitInsn(insn);
    }
}
