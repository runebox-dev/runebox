package io.runebox.updater

import java.lang.System.Logger.Level

object Logger {

    var level = Level.ALL

    fun log(message: String) { println(message) }

    fun trace(message: String) {
        println("[TRACE] - $message")
    }

    fun debug(message: String) {
        println("[DEBUG] - $message")
    }

    fun info(message: String) {
        println(message)
    }

    fun warning(message: String) {
        System.err.println("[WARNING] - $message")
    }

    fun error(message: String) {
        System.err.println("[ERROR] - $message")
    }
}