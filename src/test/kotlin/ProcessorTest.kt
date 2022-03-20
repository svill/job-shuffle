import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class ProcessorTest {

    @Test
    fun `Load names and prints list to console when app started`() {
        val outputSink = MemorySink()
        val namesSource = NomineeNamesSource()
        val processor = Processor(namesSource, outputSink)

        processor.start()

        assertTrue(outputSink.sentMessages.containsAll(listOf(
            "** List of nominees **",
            "John",
            "Mary"
        )))
    }
}
