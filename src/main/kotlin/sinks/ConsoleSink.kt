package sinks

open class ConsoleWriter {
    open fun print(message: String) {
        println(message)
    }
}