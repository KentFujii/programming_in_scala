package pattern_overlap
import case_classes.{Expr, Var, Number, UnOp, BinOp}

object PatternOverlap extends App {
  def simplifyAll(expr: Expr): Expr = expr match {
    case UnOp("-", UnOp("-", e)) => simplifyAll(e)
    case BinOp("+", e, Number(0)) => simplifyAll(e)
    case BinOp("*", e, Number(1)) => simplifyAll(e)
    case UnOp(op, e) => UnOp(op, simplifyAll(e))
    case BinOp(op, left, right) => BinOp(op, simplifyAll(left), simplifyAll(right))
    case _ => expr
  }

  val unOp = UnOp("-", Number(1))
  val expr: Expr = UnOp("-", unOp)
  println(simplifyAll(expr))
}
