import sinks.ConsoleWriter

class Processor(
    private val names: List<String>,
    private val output: ConsoleWriter,
) {
    fun start() {
        printNomineeNames()
    }

     private fun printNomineeNames() {
        output.print("** List of nominees **")
        names.forEach { name -> output.print(name) }
    }
}
