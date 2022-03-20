import sinks.Sink
import sources.Source

class NomineeNamesSource: Source<String, List<String>> {
    override fun apply(a: String): List<String> {
        return listOf("John", "Mary")
    }
}

class MemorySink : Sink<String> {
    val sentMessages = mutableListOf<String>()

    override fun apply(a: String) {
        sentMessages.add(a)
    }
}
