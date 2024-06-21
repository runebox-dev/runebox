package io.runebox.updater.ir.textify.core;

import io.runebox.updater.ir.FieldRef;
import io.runebox.updater.ir.MethodRef;
import io.runebox.updater.ir.handle.*;

public class HandleTextifier implements Textifier<Handle> {
    public static final Textifier<FieldHandle> FIELD_HANDLE = (printer, handle) -> {
        boolean isGet = handle instanceof GetFieldHandle || handle instanceof GetStaticHandle;
        boolean isStatic = handle instanceof GetStaticHandle || handle instanceof SetStaticHandle;

        printer.addText(isGet ? "get " : "set ");
        if (isStatic) {
            printer.addText("static ");
        }

        FieldRef field = handle.getFieldRef();
        printer.addPath(field.getOwner());
        printer.addText(".");
        printer.addLiteral(field.getName());
        printer.addText(" : ");
        TypeTextifier.getInstance().textify(printer, field.getType());
    };
    public static final Textifier<MethodHandle> METHOD_HANDLE = (printer, handle) -> {
        printer.addText("invoke ");
        printer.addText(
                handle instanceof InvokeInterfaceHandle ? "interface " :
                        handle instanceof InvokeSpecialHandle ? "special " :
                                handle instanceof InvokeStaticHandle ? "static " :
                                        handle instanceof InvokeVirtualHandle ? "virtual " :
                                                handle instanceof NewInstanceHandle ? "new " :
                                                        TextUtil.assertionError()
        );

        if (handle instanceof AbstractAmbiguousMethodHandle &&
                ((AbstractAmbiguousMethodHandle) handle).isInterface()) {
            printer.addText("interface ");
        }

        MethodRef method = handle.getMethodRef();
        printer.addPath(method.getOwner());
        printer.addText(".");
        printer.addLiteral(method.getName());
        printer.addText("(");
        TextUtil.joined(method.getArguments(),
                type -> TypeTextifier.getInstance().textify(printer, type),
                () -> printer.addText(", "));
        printer.addText(") : ");
        method.getReturnType().ifPresentOrElse(
                type -> TypeTextifier.getInstance().textify(printer, type),
                () -> printer.addText("void"));
    };
    private static final HandleTextifier INSTANCE = new HandleTextifier();

    private HandleTextifier() {
    }

    public static HandleTextifier getInstance() {
        return INSTANCE;
    }

    @Override
    public void textify(Printer printer, Handle handle) {
        if (handle instanceof FieldHandle) {
            FIELD_HANDLE.textify(printer, (FieldHandle) handle);
        } else if (handle instanceof MethodHandle) {
            METHOD_HANDLE.textify(printer, (MethodHandle) handle);
        } else {
            throw new AssertionError();
        }
    }
}
