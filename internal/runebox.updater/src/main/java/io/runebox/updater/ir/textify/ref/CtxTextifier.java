package io.runebox.updater.ir.textify.ref;


import io.runebox.updater.ir.textify.core.Printer;

public interface CtxTextifier<T> {
    void textify(Printer printer, TextifyCtx ctx, T value);
}
