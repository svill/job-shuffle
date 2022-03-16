package sinks

class ConsoleDouble : ConsoleWriter() {
    val messages = mutableListOf<String>()

    override fun print(message: String) {
        messages.add(message)
    }
}