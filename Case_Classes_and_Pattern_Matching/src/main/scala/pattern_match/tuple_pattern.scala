package pattern_match
import case_classes.{Expr, Var, Number, UnOp, BinOp}

object TuplePattern extends App {
  def tupleDemo(expr: Any) = expr match {
    case (a, b, c) => println("matched " + a + b + c)
    case _ =>
  }
  tupleDemo(("a", 3, "-tuple"))
}
