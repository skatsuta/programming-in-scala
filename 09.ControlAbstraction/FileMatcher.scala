object FileMatcher {
  private val filesHere = new java.io.File(".").listFiles
  private def filesMatching(matcher: String => Boolean) =
    filesHere.map(_.getName).filter(matcher)
  def filesEnding(query: String) = filesMatching(_ endsWith query)
  def filesContaining(query: String) = filesMatching(_ contains query)
  def filesRegex(query: String) = filesMatching(_ matches query)
}
