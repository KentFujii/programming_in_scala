package for_expression

object FileListMultipleFilter extends App {
  val filesHere = (new java.io.File(".")).listFiles
  for (
    file <- filesHere
    if file.isFile
    if file.getName.endsWith(".txt")
  ) println(file)
}
