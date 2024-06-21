package io.runebox.updater.ir.textify.core;

import io.runebox.updater.ir.annotation.AbstractAnnotation;
import io.runebox.updater.ir.annotation.Annotation;

public class AnnotationTextifier implements Textifier<Annotation> {
    private final static AnnotationTextifier INSTANCE = new AnnotationTextifier();

    private AnnotationTextifier() {
    }

    public static AnnotationTextifier getInstance() {
        return INSTANCE;
    }

    public static void appendValues(Printer printer, AbstractAnnotation annotation) {
        TextUtil.joined(annotation.getValues().entrySet(),
                entry -> {
                    printer.addLiteral(entry.getKey());
                    printer.addText(" = ");
                    AnnotationValueTextifier.getInstance().textify(printer, entry.getValue());
                }, () -> printer.addText(", "));
    }

    @Override
    public void textify(Printer printer, Annotation annotation) {
        printer.addText("@");
        printer.addPath(annotation.getType());
        printer.addText("[visible = ");
        printer.addText(annotation.isRuntimeVisible() ? "true" : "false");
        printer.addText("](");
        appendValues(printer, annotation);
        printer.addText(")");
    }
}
