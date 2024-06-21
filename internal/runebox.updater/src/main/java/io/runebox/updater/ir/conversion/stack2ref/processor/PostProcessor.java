package io.runebox.updater.ir.conversion.stack2ref.processor;

import io.runebox.updater.ir.ref.RefBody;

/**
 * Apply patches to an already build RefBody
 */
public interface PostProcessor {
    public void process(RefBody body);
}
