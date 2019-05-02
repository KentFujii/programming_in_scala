package case_classes_and_pattern_matching

object TuplePattern extends App {
  def tupleDemo(expr: Any) = expr match {
    case (a, b, c) => println("matched " + a + b + c)
    case _ =>
  }
  tupleDemo(("a", 3, "-tuple"))
}
