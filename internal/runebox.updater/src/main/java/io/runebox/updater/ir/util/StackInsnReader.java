package io.runebox.updater.ir.util;

import io.runebox.updater.ir.stack.StackLocal;
import io.runebox.updater.ir.stack.insn.*;

/**
 * Produce events for {@link StackInsnVisitor StackInsnVisitors} from {@link Instruction Instructions}.
 */
public class StackInsnReader {
    private final StackInsnVisitor<Instruction, StackLocal> iv;

    public StackInsnReader(StackInsnVisitor<Instruction, StackLocal> iv) {
        this.iv = iv;
    }

    public void accept(Instruction instruction) {
        if (instruction instanceof AbstractBinaryMathInsn) {
            if (instruction instanceof AddInsn) {
                iv.visitAdd(((AddInsn) instruction).getType());
            } else if (instruction instanceof SubInsn) {
                iv.visitSub(((SubInsn) instruction).getType());
            } else if (instruction instanceof MulInsn) {
                iv.visitMul(((MulInsn) instruction).getType());
            } else if (instruction instanceof DivInsn) {
                iv.visitDiv(((DivInsn) instruction).getType());
            } else if (instruction instanceof ModInsn) {
                iv.visitMod(((ModInsn) instruction).getType());
            } else if (instruction instanceof AndInsn) {
                iv.visitAnd(((AndInsn) instruction).getType());
            } else if (instruction instanceof OrInsn) {
                iv.visitOr(((OrInsn) instruction).getType());
            } else if (instruction instanceof XorInsn) {
                iv.visitXor(((XorInsn) instruction).getType());
            } else if (instruction instanceof ShlInsn) {
                iv.visitShl(((ShlInsn) instruction).getType());
            } else if (instruction instanceof ShrInsn) {
                iv.visitShr(((ShrInsn) instruction).getType());
            } else if (instruction instanceof UShrInsn) {
                iv.visitUShr(((UShrInsn) instruction).getType());
            } else if (instruction instanceof CmpInsn) {
                iv.visitCmp();
            } else if (instruction instanceof CmplInsn) {
                iv.visitCmpl(((CmplInsn) instruction).getType());
            } else if (instruction instanceof CmpgInsn) {
                iv.visitCmpg(((CmpgInsn) instruction).getType());
            } else {
                throw new AssertionError();
            }
        } else if (instruction instanceof BranchInsn) {
            if (instruction instanceof GotoInsn) {
                iv.visitGoto(((GotoInsn) instruction).getTarget());
            } else if (instruction instanceof IfInsn) {
                IfInsn ifInsn = (IfInsn) instruction;
                iv.visitIf(ifInsn.getCondition(), ifInsn.getTarget());
            } else if (instruction instanceof SwitchInsn) {
                SwitchInsn switchInsn = (SwitchInsn) instruction;
                iv.visitSwitch(switchInsn.getBranchTable(), switchInsn.getDefaultLocation());
            } else {
                throw new AssertionError();
            }
        } else if (instruction instanceof AbstractFieldInsn) {
            AbstractFieldInsn fieldInsn = (AbstractFieldInsn) instruction;
            if (instruction instanceof FieldGetInsn) {
                iv.visitFieldGet(fieldInsn.getField(), fieldInsn.isStatic());
            } else if (instruction instanceof FieldSetInsn) {
                iv.visitFieldSet(fieldInsn.getField(), fieldInsn.isStatic());
            } else {
                throw new AssertionError();
            }
        } else if (instruction instanceof ArrayLengthInsn) {
            iv.visitArrayLength();
        } else if (instruction instanceof ArrayLoadInsn) {
            iv.visitArrayLoad(((ArrayLoadInsn) instruction).getType());
        } else if (instruction instanceof ArrayStoreInsn) {
            iv.visitArrayStore(((ArrayStoreInsn) instruction).getType());
        } else if (instruction instanceof DupInsn) {
            iv.visitDup();
        } else if (instruction instanceof DupX1Insn) {
            iv.visitDupX1();
        } else if (instruction instanceof DupX2Insn) {
            iv.visitDupX2();
        } else if (instruction instanceof Dup2Insn) {
            iv.visitDup2();
        } else if (instruction instanceof Dup2X1Insn) {
            iv.visitDup2X1();
        } else if (instruction instanceof Dup2X2Insn) {
            iv.visitDup2X2();
        } else if (instruction instanceof IncrementInsn) {
            IncrementInsn incInsn = (IncrementInsn) instruction;
            iv.visitIncrement(incInsn.getLocal(), incInsn.getValue());
        } else if (instruction instanceof InstanceOfInsn) {
            iv.visitInstanceOf(((InstanceOfInsn) instruction).getType());
        } else if (instruction instanceof InvokeInsn) {
            iv.visitInvokeInsn(((InvokeInsn) instruction).getInvoke());
        } else if (instruction instanceof LoadInsn) {
            LoadInsn loadInsn = (LoadInsn) instruction;
            iv.visitLoad(loadInsn.getType(), loadInsn.getLocal());
        } else if (instruction instanceof MonitorEnterInsn) {
            iv.visitMonitorEnter();
        } else if (instruction instanceof MonitorExitInsn) {
            iv.visitMonitorExit();
        } else if (instruction instanceof NegInsn) {
            iv.visitNeg(((NegInsn) instruction).getType());
        } else if (instruction instanceof NewArrayInsn) {
            NewArrayInsn newArrayInsn = (NewArrayInsn) instruction;
            iv.visitNewArray(newArrayInsn.getType(), newArrayInsn.getInitializedDimensions());
        } else if (instruction instanceof NewInsn) {
            iv.visitNew(((NewInsn) instruction).getPath());
        } else if (instruction instanceof PopInsn) {
            iv.visitPop();
        } else if (instruction instanceof PrimitiveCastInsn) {
            PrimitiveCastInsn castInsn = (PrimitiveCastInsn) instruction;
            iv.visitPrimitiveCast(castInsn.getFromType(), castInsn.getToType());
        } else if (instruction instanceof PushInsn) {
            iv.visitPush(((PushInsn) instruction).getConstant());
        } else if (instruction instanceof RefCastInsn) {
            iv.visitReferenceCast(((RefCastInsn) instruction).getType());
        } else if (instruction instanceof ReturnInsn) {
            iv.visitReturn(((ReturnInsn) instruction).getType());
        } else if (instruction instanceof StoreInsn) {
            StoreInsn storeInsn = (StoreInsn) instruction;
            iv.visitStore(storeInsn.getType(), storeInsn.getLocal());
        } else if (instruction instanceof SwapInsn) {
            iv.visitSwap();
        } else if (instruction instanceof ThrowInsn) {
            iv.visitThrow();
        } else {
            throw new AssertionError();
        }
    }
}
