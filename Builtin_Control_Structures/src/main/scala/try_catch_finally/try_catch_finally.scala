package try_catch_finally
import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object TryCatchFinally extends App {
  try {
    val f = new FileReader("input.txt")
  } catch {
    case e: FileNotFoundException => println("File not found")
    case e: IOException => println("I/O error")
  } finally {
    println("fin")
  }
}
