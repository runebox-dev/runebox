package io.runebox.deobfuscator

import java.lang.System.Logger.Level

object Logger {

    var level = Level.ALL

    fun trace(message: String) {
        println("[TRACE] - $message")
    }

    fun debug(message: String) {
        println("[DEBUG] - $message")
    }

    fun info(message: String) {
        println("[INFO] - $message")
    }

    fun warning(message: String) {
        System.err.println("[WARNING] - $message")
    }

    fun error(message: String) {
        System.err.println("[ERROR] - $message")
    }
}