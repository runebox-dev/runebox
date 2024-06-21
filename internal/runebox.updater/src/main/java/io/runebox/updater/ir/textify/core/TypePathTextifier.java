package io.runebox.updater.ir.textify.core;

import io.runebox.updater.ir.typeannotation.TypePath;

import java.util.List;

public class TypePathTextifier implements Textifier<TypePath> {
    public final static Textifier<TypePath.Kind> KIND = (printer, kind) -> {
        if (kind instanceof TypePath.Kind.Array) {
            printer.addText("[]");
        } else if (kind instanceof TypePath.Kind.InnerClass) {
            printer.addText(".");
        } else if (kind instanceof TypePath.Kind.WildcardBound) {
            printer.addText("?");
        } else if (kind instanceof TypePath.Kind.TypeArgument) {
            int argument = ((TypePath.Kind.TypeArgument) kind).getTypeArgumentIndex();
            printer.addText("<" + argument + ">");
        } else {
            throw new AssertionError();
        }
    };
    private final static TypePathTextifier INSTANCE = new TypePathTextifier();

    private TypePathTextifier() {
    }

    public static TypePathTextifier getInstance() {
        return INSTANCE;
    }

    @Override
    public void textify(Printer printer, TypePath value) {
        List<TypePath.Kind> paths = value.getPaths();

        if (paths.isEmpty()) {
            printer.addText("{}");
        } else {
            printer.addText("{ ");
            TextUtil.joined(paths,
                    kind -> KIND.textify(printer, kind),
                    () -> printer.addText(" "));
            printer.addText(" }");
        }
    }
}
