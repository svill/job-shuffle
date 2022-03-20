import sinks.Sink
import sources.Source

class Processor(
    private val getNames: Source<String, List<String>>,
    private val output: Sink<String>,
) {
    fun start() {
        val names = getNames("sampleNames.txt")

        printNomineeNames(names)
    }

     private fun printNomineeNames(names: List<String>) {
        output("** List of nominees **")
        names.forEach { name -> output(name) }
    }
}
