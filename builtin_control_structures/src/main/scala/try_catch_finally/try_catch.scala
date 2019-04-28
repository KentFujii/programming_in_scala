import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object TryCatch extends App {
  try {
    val f = new FileReader("input.txt")
  } catch {
    case e: IOException => "I/O error"
    case e:  => "I/O error"
  }
}
