import sinks.Sink
import sources.Source

class NomineeNamesSource: Source<String, List<String>> {
    override fun invoke(a: String): List<String> {
        return listOf("John", "Mary")
    }
}

class MemorySink : Sink<String> {
    val sentMessages = mutableListOf<String>()

    override fun invoke(input: String) {
        sentMessages.add(input)
    }
}
