package pattern_match
import case_classes.{Expr, Var, Number, UnOp, BinOp}

object WildCardPattern extends App {
  val v = Var("x")
  val expr: Expr = BinOp("+", Number(1), v)
  expr match {
    case BinOp(_, _, _) => println(expr + " is a binary operation")
    case _ => println("It's something else")
  }
}
