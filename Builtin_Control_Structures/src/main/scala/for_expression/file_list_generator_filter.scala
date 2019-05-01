package for_expression

object FileListGeneratorFilter extends App {
  val filesHere = (new java.io.File(".")).listFiles
  def fileLines(file: java.io.File) = {
    scala.io.Source.fromFile(file).getLines().toList
  }
  def grep(pattern: String) = {
    for {
      file <- filesHere
      if file.getName.endsWith(".txt")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(pattern)
    } println(file + ": " + line.trim)
  }
  grep(".*World.*")
}
