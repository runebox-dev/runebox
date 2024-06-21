package io.runebox.updater.ir.textify.ref;

import io.runebox.updater.ir.MethodDescriptor;
import io.runebox.updater.ir.MethodRef;
import io.runebox.updater.ir.constant.BootstrapConstant;
import io.runebox.updater.ir.ref.Expression;
import io.runebox.updater.ir.ref.invoke.*;
import io.runebox.updater.ir.textify.core.*;

import java.util.List;

public class InvokeTextifier implements CtxTextifier<AbstractInvoke> {
    public static final CtxTextifier<InvokeDynamic> DYNAMIC = (printer, ctx, invoke) -> {
        printer.addText("invoke dynamic { name = ");
        printer.addEscaped(invoke.getName(), '"');

        printer.addText(", type = ");
        textifyDescriptorWithArguments(printer, ctx, invoke.getDescriptor(), invoke.getArguments());

        printer.addText(", bootstrap = ");
        HandleTextifier.getInstance().textify(printer, invoke.getBootstrapMethod());

        printer.addText(", arguments = ");
        List<BootstrapConstant> bootstrapArguments = invoke.getBootstrapArguments();
        if (bootstrapArguments.isEmpty()) {
            printer.addText("[]");
        } else {
            printer.addText("[ ");
            TextUtil.joined(bootstrapArguments,
                    constant -> ConstantTextifier.BOOTSTRAP.textify(printer, constant),
                    () -> printer.addText(", "));
            printer.addText(" ]");
        }

        printer.addText(" }");
    };
    public static final CtxTextifier<AbstractConcreteInvoke> CONCRETE = (printer, ctx, invoke) -> {
        MethodRef method = invoke.getMethod();

        printer.addPath(method.getOwner());
        printer.addText(".<");

        String keyword;
        if (invoke instanceof InvokeInterface) {
            keyword = "interface";
        } else if (invoke instanceof InvokeSpecial) {
            boolean isInterface = ((InvokeSpecial) invoke).isInterface();
            keyword = "special" + (isInterface ? " interface" : "");
        } else if (invoke instanceof InvokeStatic) {
            boolean isInterface = ((InvokeStatic) invoke).isInterface();
            keyword = "static" + (isInterface ? " interface" : "");
        } else if (invoke instanceof InvokeVirtual) {
            keyword = "virtual";
        } else {
            throw new AssertionError();
        }
        printer.addText(keyword);

        if (invoke instanceof AbstractInstanceInvoke) {
            printer.addText(" ");
            Expression instance = ((AbstractInstanceInvoke) invoke).getInstance();
            ExpressionTextifier.getInstance().textify(printer, ctx, instance);
        }
        printer.addText(">.");

        printer.addLiteral(method.getName());
        printer.addText("(");

        TextUtil.biJoined(invoke.getArguments(), method.getArguments(),
                (argument, argumentType) -> {
                    ExpressionTextifier.getInstance().textify(printer, ctx, argument);
                    printer.addText(" : ");
                    TypeTextifier.getInstance().textify(printer, argumentType);
                },
                () -> printer.addText(", "));

        printer.addText(") : ");
        method.getReturnType().ifPresentOrElse(
                type -> TypeTextifier.getInstance().textify(printer, type),
                () -> printer.addText("void"));
    };
    private static final InvokeTextifier INSTANCE = new InvokeTextifier();

    public static InvokeTextifier getInstance() {
        return INSTANCE;
    }

    private static void textifyDescriptorWithArguments(Printer printer, TextifyCtx ctx, MethodDescriptor descriptor, List<Expression> parameters) {
        TextUtil.biJoined(descriptor.getParameterTypes(), parameters,
                (parameterType, parameter) -> {
                    ExpressionTextifier.getInstance().textify(printer, ctx, parameter);
                    printer.addText(" : ");
                    TypeTextifier.getInstance().textify(printer, parameterType);
                },
                () -> printer.addText(", "));

        printer.addText(" : ");

        descriptor.getReturnType().ifPresentOrElse(
                type -> TypeTextifier.getInstance().textify(printer, type),
                () -> printer.addText("void"));
    }

    @Override
    public void textify(Printer printer, TextifyCtx ctx, AbstractInvoke invoke) {
        if (invoke instanceof AbstractConcreteInvoke) {
            CONCRETE.textify(printer, ctx, (AbstractConcreteInvoke) invoke);
        } else if (invoke instanceof InvokeDynamic) {
            DYNAMIC.textify(printer, ctx, (InvokeDynamic) invoke);
        } else {
            throw new AssertionError();
        }
    }
}
