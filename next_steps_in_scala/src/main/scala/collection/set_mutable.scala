package collection
import scala.collection.mutable

object SetMutable extends App {
  val movieSet = mutable.Set("Hitch", "Poltergeist")
  movieSet += "Shrek"
  println(movieSet)
}
