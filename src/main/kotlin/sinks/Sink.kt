package sinks

interface Sink<A> {
    fun apply(a: A)
}