import sinks.ConsoleWriter
import sources.Source

class Processor(
    private val getNames: Source<String, List<String>>,
    private val output: ConsoleWriter,
) {
    fun start() {
        val names = getNames.apply("not_exist.txt")

        printNomineeNames(names)
    }

     private fun printNomineeNames(names: List<String>) {
        output.print("** List of nominees **")
        names.forEach { name -> output.print(name) }
    }
}
