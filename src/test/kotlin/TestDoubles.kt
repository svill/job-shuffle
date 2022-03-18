import sources.Source

class NomineeNamesSource: Source<String, List<String>> {
    override fun apply(a: String): List<String> {
        return listOf("John", "Mary")
    }
}
