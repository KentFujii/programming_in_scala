package case_classes_and_pattern_matching

object SequencePattern extends App {
  val list = List(0, 1, 2)
  list match  {
    case List(0, _, _) => println("found it")
    case _ =>
  }
  list match  {
    case List(0, _*) => println("found it")
    case _ =>
  }
}
