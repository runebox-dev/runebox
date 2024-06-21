package io.runebox.updater.ir.textify.stack;

import io.runebox.updater.ir.FieldRef;
import io.runebox.updater.ir.MethodRef;
import io.runebox.updater.ir.constant.BootstrapConstant;
import io.runebox.updater.ir.constant.PushableConstant;
import io.runebox.updater.ir.stack.insn.*;
import io.runebox.updater.ir.stack.invoke.*;
import io.runebox.updater.ir.textify.core.*;
import io.runebox.updater.ir.type.ArrayType;

import java.util.List;

public class InsnTextifier implements Textifier<Instruction> {

    private final TextifyContext ctx;

    public InsnTextifier(TextifyContext ctx) {
        this.ctx = ctx;
    }

    @Override
    public void textify(Printer printer, Instruction instruction) {
        if (instruction instanceof AbstractBinaryMathInsn) {
            textifyMathInsn(printer, (AbstractBinaryMathInsn) instruction);
        } else if (instruction instanceof BranchInsn) {
            if (instruction instanceof GotoInsn) {
                textifyGotoInsn(printer, (GotoInsn) instruction);
            } else if (instruction instanceof IfInsn) {
                textifyIfInsn(printer, (IfInsn) instruction);
            } else if (instruction instanceof SwitchInsn) {
                textifySwitchInsn(printer, (SwitchInsn) instruction);
            } else {
                throw new AssertionError();
            }
        } else if (instruction instanceof AbstractFieldInsn) {
            textifyFieldInsns(printer, (AbstractFieldInsn) instruction);
        } else if (instruction instanceof ArrayLengthInsn) {
            printer.addText("arraylength;");
        } else if (instruction instanceof ArrayLoadInsn) {
            textifyArrayLoadInsn(printer, (ArrayLoadInsn) instruction);
        } else if (instruction instanceof ArrayStoreInsn) {
            textifyArrayStoreInsn(printer, (ArrayStoreInsn) instruction);
        } else if (instruction instanceof IncrementInsn) {
            textifyIncrementInsn(printer, (IncrementInsn) instruction);
        } else if (instruction instanceof InstanceOfInsn) {
            texifyInstanceOfInsn(printer, (InstanceOfInsn) instruction);
        } else if (instruction instanceof InvokeInsn) {
            textifyInvokeInsn(printer, (InvokeInsn) instruction);
        } else if (instruction instanceof LoadInsn) {
            textifyLoadInsn(printer, (LoadInsn) instruction);
        } else if (instruction instanceof StoreInsn) {
            textifyStoreInsn(printer, (StoreInsn) instruction);
        } else if (instruction instanceof MonitorEnterInsn) {
            printer.addText("monitor enter;");
        } else if (instruction instanceof MonitorExitInsn) {
            printer.addText("monitor exit;");
        } else if (instruction instanceof NegInsn) {
            textifyNegInsn(printer, (NegInsn) instruction);
        } else if (instruction instanceof NewArrayInsn) {
            textifyNewArrayInsn(printer, (NewArrayInsn) instruction);
        } else if (instruction instanceof NewInsn) {
            textifyNewInsn(printer, (NewInsn) instruction);
        } else if (instruction instanceof PrimitiveCastInsn) {
            textifyPrimitiveCast(printer, (PrimitiveCastInsn) instruction);
        } else if (instruction instanceof RefCastInsn) {
            textifyRefCast(printer, (RefCastInsn) instruction);
        } else if (instruction instanceof PushInsn) {
            textifyPush(printer, (PushInsn) instruction);
        } else if (instruction instanceof ReturnInsn) {
            textifyReturnInsn(printer, (ReturnInsn) instruction);
        } else if (instruction instanceof ThrowInsn) {
            printer.addText("throw;");
        } else if (instruction instanceof SwapInsn) {
            printer.addText("swap;");
        } else if (instruction instanceof PopInsn) {
            printer.addText("pop;");
        } else if (instruction instanceof DupInsn) {
            printer.addText("dup;");
        } else if (instruction instanceof DupX1Insn) {
            printer.addText("dup x1;");
        } else if (instruction instanceof DupX2Insn) {
            printer.addText("dup x2;");
        } else if (instruction instanceof Dup2Insn) {
            printer.addText("dup2;");
        } else if (instruction instanceof Dup2X1Insn) {
            printer.addText("dup2 x1;");
        } else if (instruction instanceof Dup2X2Insn) {
            printer.addText("dup2 x2;");
        } else {
            throw new AssertionError();
        }
    }

    private void textifyMathInsn(Printer printer, AbstractBinaryMathInsn instruction) {
        if (instruction instanceof CmpInsn) {
            printer.addText("cmp;");
        } else {
            String keyword = instruction instanceof AddInsn ? "add" :
                    instruction instanceof SubInsn ? "sub" :
                            instruction instanceof MulInsn ? "mul" :
                                    instruction instanceof DivInsn ? "div" :
                                            instruction instanceof ModInsn ? "mod" :
                                                    instruction instanceof AndInsn ? "and" :
                                                            instruction instanceof OrInsn ? "or" :
                                                                    instruction instanceof XorInsn ? "xor" :
                                                                            instruction instanceof ShlInsn ? "shl" :
                                                                                    instruction instanceof ShrInsn ? "shr" :
                                                                                            instruction instanceof UShrInsn ? "ushr" :
                                                                                                    instruction instanceof CmplInsn ? "cmpl" :
                                                                                                            instruction instanceof CmpgInsn ? "cmpg" :
                                                                                                                    TextUtil.assertionError();

            printer.addText(keyword + " ");
            TypeTextifier.INSN_TYPE.textify(printer, instruction.getType());
            printer.addText(";");
        }
    }

    private void textifyGotoInsn(Printer printer, GotoInsn instruction) {
        printer.addText("goto ");
        printer.addLiteral(ctx.getLabel(instruction.getTarget()));
        printer.addText(";");
    }

    private void textifyIfInsn(Printer printer, IfInsn instruction) {
        IfInsn.Condition condition = instruction.getCondition();
        String type = condition instanceof IfInsn.IntCondition ? "int" :
                condition instanceof IfInsn.ReferenceCondition ? "ref" :
                        TextUtil.assertionError();

        printer.addText("if " + type + " (? ");
        textifyComparison(printer, condition.getComparison());
        printer.addText(" ");
        textifyCompareValue(printer, condition.getCompareValue());
        printer.addText(") goto ");
        printer.addLiteral(ctx.getLabel(instruction.getTarget()));
        printer.addText(";");
    }

    private void textifyComparison(Printer printer, IfInsn.Comparison comparison) {
        String symbol = comparison instanceof IfInsn.EQ ? "==" :
                comparison instanceof IfInsn.NE ? "!=" :
                        comparison instanceof IfInsn.LT ? "<" :
                                comparison instanceof IfInsn.LE ? "<=" :
                                        comparison instanceof IfInsn.GE ? ">" :
                                                comparison instanceof IfInsn.GT ? ">=" :
                                                        TextUtil.assertionError();

        printer.addText(symbol);
    }

    private void textifyCompareValue(Printer printer, IfInsn.CompareValue value) {
        String literal = value instanceof IfInsn.StackValue ? "?" :
                value instanceof IfInsn.NullValue ? "null" :
                        value instanceof IfInsn.ZeroValue ? "0" :
                                TextUtil.assertionError();

        printer.addText(literal);
    }

    private void textifySwitchInsn(Printer printer, SwitchInsn instruction) {
        printer.addText("switch {");
        printer.newLine();
        printer.increaseIndent();

        instruction.getBranchTable().forEach((key, target) -> {
            printer.addText("case " + key + ": goto ");
            printer.addLiteral(ctx.getLabel(target));
            printer.addText(";");
        });

        printer.addText("default: goto ");
        printer.addLiteral(ctx.getLabel(instruction.getDefaultLocation()));
        printer.addText(";");
        printer.newLine();

        printer.decreaseIndent();
        printer.addText("}");
    }

    private void textifyFieldInsns(Printer printer, AbstractFieldInsn instruction) {
        printer.addText(instruction instanceof FieldGetInsn ? "get " : "set ");
        if (instruction.isStatic()) {
            printer.addText("static ");
        }

        FieldRef field = instruction.getField();
        printer.addPath(field.getOwner());
        printer.addText(".");
        printer.addLiteral(field.getName());
        printer.addText(" : ");
        TypeTextifier.getInstance().textify(printer, field.getType());
        printer.addText(";");
    }

    private void textifyArrayLoadInsn(Printer printer, ArrayLoadInsn instruction) {
        printer.addText("arrayload ");
        TypeTextifier.INSN_TYPE.textify(printer, instruction.getType());
        printer.addText(";");
    }

    private void textifyArrayStoreInsn(Printer printer, ArrayStoreInsn instruction) {
        printer.addText("arraystore ");
        TypeTextifier.INSN_TYPE.textify(printer, instruction.getType());
        printer.addText(";");
    }

    private void textifyIncrementInsn(Printer printer, IncrementInsn instruction) {
        printer.addText("inc ");
        printer.addLiteral(ctx.getLocalName(instruction.getLocal()));
        printer.addText(" " + instruction.getValue() + ";");
    }

    private void texifyInstanceOfInsn(Printer printer, InstanceOfInsn instruction) {
        printer.addText("instanceof ");
        TypeTextifier.REF_TYPE.textify(printer, instruction.getType());
        printer.addText(";");
    }

    private void textifyInvokeInsn(Printer printer, InvokeInsn instruction) {
        Invoke invoke = instruction.getInvoke();

        if (invoke instanceof DynamicInvoke dynamicInvoke) {

            printer.addText("invoke dynamic { name = ");
            printer.addEscaped(dynamicInvoke.getName(), '"');

            printer.addText(", type = ");
            MethodDescriptorTextifier.getInstance().textify(printer, dynamicInvoke.getDescriptor());

            printer.addText(", bootstrap = ");
            HandleTextifier.getInstance().textify(printer, dynamicInvoke.getBootstrapMethod());

            printer.addText(", arguments = ");
            List<BootstrapConstant> arguments = dynamicInvoke.getBootstrapArguments();
            if (arguments.isEmpty()) {
                printer.addText("[]");
            } else {
                printer.addText("[ ");
                TextUtil.joined(arguments,
                        constant -> ConstantTextifier.BOOTSTRAP.textify(printer, constant),
                        () -> printer.addText(", "));
                printer.addText(" ]");
            }

            printer.addText(" };");

            MethodDescriptorTextifier.getInstance().textify(printer, dynamicInvoke.getDescriptor());
        } else {
            MethodRef method = ((AbstractConcreteInvoke) invoke).getMethod();

            String keyword;
            if (invoke instanceof InterfaceInvoke) {
                keyword = "invoke interface ";
            } else if (invoke instanceof SpecialInvoke) {
                keyword = "invoke special ";
                if (((SpecialInvoke) invoke).isInterface()) {
                    keyword += "interface ";
                }
            } else if (invoke instanceof StaticInvoke) {
                keyword = "invoke static ";
                if (((StaticInvoke) invoke).isInterface()) {
                    keyword += "interface ";
                }
            } else if (invoke instanceof VirtualInvoke) {
                keyword = "invoke virtual ";
            } else {
                throw new AssertionError();
            }

            printer.addText(keyword);
            printer.addPath(method.getOwner());
            printer.addText(".");
            printer.addLiteral(method.getName());
            MethodDescriptorTextifier.getInstance().textify(printer, method.getDescriptor());
            printer.addText(";");
        }
    }

    private void textifyLoadInsn(Printer printer, LoadInsn instruction) {
        printer.addText("load ");
        TypeTextifier.INSN_TYPE.textify(printer, instruction.getType());
        printer.addText(" ");
        printer.addLiteral(ctx.getLocalName(instruction.getLocal()));
        printer.addText(";");
    }

    private void textifyStoreInsn(Printer printer, StoreInsn instruction) {
        printer.addText("store ");
        TypeTextifier.INSN_TYPE.textify(printer, instruction.getType());
        printer.addText(" ");
        printer.addLiteral(ctx.getLocalName(instruction.getLocal()));
        printer.addText(";");
    }

    private void textifyNegInsn(Printer printer, NegInsn instruction) {
        printer.addText("neg ");
        TypeTextifier.INSN_TYPE.textify(printer, instruction.getType());
        printer.addText(";");
    }

    private void textifyNewArrayInsn(Printer printer, NewArrayInsn instruction) {
        ArrayType array = instruction.getType();
        printer.addText("new ");
        TypeTextifier.getInstance().textify(printer, array.getBaseType());
        for (int i = 0; i < array.getDimensions(); i++) {
            boolean fromStack = i < instruction.getInitializedDimensions();
            printer.addText(fromStack ? "[?]" : "[]");
        }
        printer.addText(";");
    }

    private void textifyNewInsn(Printer printer, NewInsn instruction) {
        printer.addText("new ");
        printer.addPath(instruction.getPath());
        printer.addText(";");
    }

    private void textifyPrimitiveCast(Printer printer, PrimitiveCastInsn instruction) {
        printer.addText("cast ");
        TypeTextifier.PRIMITIVE_TYPE.textify(printer, instruction.getFromType());
        printer.addText(" -> ");
        TypeTextifier.PRIMITIVE_TYPE.textify(printer, instruction.getToType());
        printer.addText(";");
    }

    private void textifyRefCast(Printer printer, RefCastInsn instruction) {
        printer.addText("cast ");
        TypeTextifier.REF_TYPE.textify(printer, instruction.getType());
        printer.addText(";");
    }

    private void textifyPush(Printer printer, PushInsn instruction) {
        PushableConstant constant = instruction.getConstant();

        printer.addText("push ");
        ConstantTextifier.PUSHABLE.textify(printer, constant);
        printer.addText(";");
    }

    private void textifyReturnInsn(Printer printer, ReturnInsn instruction) {
        instruction.getType().ifPresentOrElse(
                type -> {
                    printer.addText("return ");
                    TypeTextifier.INSN_TYPE.textify(printer, type);
                    printer.addText(";");
                },
                () -> printer.addText("return;"));
    }
}
