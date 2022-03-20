package sinks

interface ConsoleWriter {
    fun println(message: String) {
        kotlin.io.println(message)
    }
}

open class ConsoleSink : Sink<String>, ConsoleWriter {
    override fun invoke(message: String) {
        println(message)
    }
}