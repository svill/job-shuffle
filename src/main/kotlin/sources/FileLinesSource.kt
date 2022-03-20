package sources

import java.io.File

class FileLinesSource: Source<String, List<String>> {
    override fun invoke(a: String): List<String> {
        return File(a).useLines {  it.toList()  }
    }
}
