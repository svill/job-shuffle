package sources

interface Source<A, B> {
    fun apply(a: A): B
}