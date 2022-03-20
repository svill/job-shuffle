package sources

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FileLinesSourceTest {

    @Test
    fun `should read from file`() {
        val source = FileLinesSource()
        val result = source.apply("src/test/resources/lines.txt")
        assertEquals(listOf("line1", "line2", "line3"), result)
    }
}