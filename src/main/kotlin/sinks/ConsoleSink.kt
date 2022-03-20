package sinks

interface ConsoleWriter {
    fun println(message: String) {
        kotlin.io.println(message)
    }
}

open class ConsoleSink : Sink<String>, ConsoleWriter {
    override fun apply(a: String) {
        println(a)
    }
}