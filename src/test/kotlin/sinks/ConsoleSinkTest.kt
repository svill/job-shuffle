package sinks

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ConsoleSinkTest {

    class ConsoleDouble : ConsoleSink(), ConsoleWriter {
        var lastMessage = ""

        override fun println(message: String) {
            lastMessage = message
        }
    }

    @Test
    fun `should write to the console`() {
        val sink = ConsoleDouble()
        sink("Hello World!")
        assertEquals("Hello World!", sink.lastMessage)
    }
}