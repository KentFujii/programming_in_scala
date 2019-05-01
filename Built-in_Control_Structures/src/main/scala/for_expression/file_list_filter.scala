package for_expression

object FileListFilter extends App {
  val filesHere = (new java.io.File(".")).listFiles
  for (file <- filesHere if file.getName.endsWith(".txt")) println(file)
}
