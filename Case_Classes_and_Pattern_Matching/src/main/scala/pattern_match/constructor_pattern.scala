package pattern_match
import case_classes.{Expr, Var, Number, UnOp, BinOp}

object ConstructorPattern extends App {
  val v = Var("x")
  val expr: Expr = BinOp("+", v, Number(0))
  expr match {
    case BinOp("+", e, Number(0)) => println("a deep match")
    case _ =>
  }
}
