package collection
import scala.collection.mutable

object MapMutable extends App {
  val treasureMap = mutable.Map[Int, String]()
  treasureMap += (1 -> "Go to island.")
  treasureMap += (2 -> "Find big X on ground.")
  treasureMap += (3 -> "Dig.")
  println(treasureMap(2))
}
