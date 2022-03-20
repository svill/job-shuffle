import sinks.ConsoleSink
import sources.FileLinesSource

fun main(args: Array<String>) {
    val namesSource = FileLinesSource()
    val consoleSink = ConsoleSink()
    val processor = Processor(namesSource, consoleSink)

    processor.start()

    consoleSink("** End **")
}