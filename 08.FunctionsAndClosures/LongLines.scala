import scala.io.Source

object LongLines {
  def processFiles(filename: String, width: Int) {
    val source = Source.fromFile(filename)
    source.getLines.foreach(line => processLine(filename, width, line))
  }
  private def processLine(filename: String, width: Int, line: String) {
    if (line.length > width) println(filename + ": " + line.trim)
  }
}

