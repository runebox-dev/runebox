package io.runebox.updater.ir.textify.core;

import io.runebox.updater.ir.MethodDescriptor;

public class MethodDescriptorTextifier implements Textifier<MethodDescriptor> {
    private static final MethodDescriptorTextifier INSTANCE = new MethodDescriptorTextifier();

    private MethodDescriptorTextifier() {
    }

    public static MethodDescriptorTextifier getInstance() {
        return INSTANCE;
    }

    @Override
    public void textify(Printer printer, MethodDescriptor descriptor) {
        printer.addText("(");

        TextUtil.joined(descriptor.getParameterTypes(),
                type -> TypeTextifier.getInstance().textify(printer, type),
                () -> printer.addText(", "));

        printer.addText(") ");

        descriptor.getReturnType().ifPresentOrElse(
                type -> TypeTextifier.getInstance().textify(printer, type),
                () -> printer.addText("void"));
    }
}
