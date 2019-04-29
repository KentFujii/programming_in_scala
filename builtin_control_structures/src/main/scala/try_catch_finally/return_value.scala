package try_catch_finally
import java.net.URL
import java.net.MalformedURLException


object ReturnValue extends App {
  def urlFor(path: String) = {
    try {
      new URL(path)
    } catch {
    case e: MalformedURLException => new URL("https://www.scala-lang.org")
    }
  }
  println(urlFor("aaa"))
}
