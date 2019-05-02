package pattern_match
import case_classes.{Expr, Var, Number, UnOp, BinOp}

object TypedPattern extends App {
  def generalSize(x: Any) = x match {
    case s: String => s.length
    case m: Map[_, _] => m.size
    case _ => -1
  }
  println(generalSize("abc"))
  println(generalSize(Map(1 -> 'a', 2 -> 'b')))
  println(generalSize(math.Pi))
}
