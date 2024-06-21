package io.runebox.updater.ir.textify.core;

@FunctionalInterface
public interface Textifier<T> {
    void textify(Printer printer, T value);

    default String toString(T value) {
        Printer printer = new Printer();
        textify(printer, value);
        return printer.toString();
    }
}
