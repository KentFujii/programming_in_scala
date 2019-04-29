package reduce_duplicated_logic

object FileMatcher extends App {
  private def filesHere = (new java.io.File(".")).listFiles()
  private def filesMatching(matcher: String => Boolean) = {
    for {
      file <- filesHere
      if matcher(file.getName)
    } yield file
  }
  def filesEnding(query: String) = filesMatching(_.endsWith(query))
  def filesContaining(query: String) = filesMatching(_.contains(query))
  def filesRegex(query: String) = filesMatching(_.matches(query))

  println(filesEnding(".txt").mkString)
  println(filesContaining("test").mkString)
  println(filesRegex(".*?\\.txt").mkString)
}
