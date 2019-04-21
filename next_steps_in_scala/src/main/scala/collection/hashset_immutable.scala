package collection
import scala.collection.immutable.HashSet

object HashSetImmutable extends App {
  val hashSet = HashSet("Tomatoes", "Chilies")
  println(hashSet + "Coriander")
}
