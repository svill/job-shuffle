import org.junit.jupiter.api.Test
import sinks.ConsoleDouble
import sources.Source
import kotlin.test.assertTrue

class ProcessorTest {

    @Test
    fun `Load names and prints list to console when app started`() {
        val consoleSink = ConsoleDouble()
        val namesSource = NomineeNamesSource()
        val processor = Processor(namesSource, consoleSink)

        processor.start()

        assertTrue(consoleSink.messages.containsAll(listOf(
            "** List of nominees **",
            "John",
            "Mary"
        )))
    }
}
