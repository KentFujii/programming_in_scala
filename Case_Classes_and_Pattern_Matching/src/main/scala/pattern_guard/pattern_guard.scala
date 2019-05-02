package pattern_guard
import case_classes.{Expr, BinOp, Number, Var}

object PatternGuard extends App {
  def simplifyAdd(e: Expr) = e match {
    case BinOp("+", x, y) if x == y => BinOp("*", x, Number(2))
    case _ => e
  }
  val v = Var("x")
  val expr: Expr = BinOp("+", Number(1), Number(1))
  println(simplifyAdd(expr))
}
