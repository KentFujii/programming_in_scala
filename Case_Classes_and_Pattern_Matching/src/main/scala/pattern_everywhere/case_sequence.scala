package pattern_everywhere

object CaseSequence extends App {
  val withDefault: Option[Int] => Int = {
    case Some(x) => x
    case None => 0
  }
  println(withDefault(Some(10)))
  println(withDefault(None))
}
