package io.runebox.updater.ir.textify.core;

import io.runebox.updater.ir.Method;

public interface BodyTextifier extends Textifier<Method> {
    /**
     * Write the parameters as printer between the two brackets.
     *
     * @param printer write the parameters to this printer
     * @param method  the method whose parameters are textified
     */
    void textifyParameters(Printer printer, Method method);
}
