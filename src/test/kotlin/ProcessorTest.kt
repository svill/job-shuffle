import org.junit.jupiter.api.Test
import sinks.ConsoleDouble
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ProcessorTest {

    @Test
    fun `Load names and prints list to console when app started`() {
        val consoleSink = ConsoleDouble()
        val nameSource = NomineeNamesSource()
        val processor = Processor(nameSource.names, consoleSink)

        processor.start()

        assertTrue(consoleSink.messages.containsAll(listOf(
            "** List of nominees **",
            "John",
            "Mary"
        )))
    }
}
