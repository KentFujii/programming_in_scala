package pattern_match
import case_classes.{Expr, Var, Number, UnOp, BinOp}

object VariableBindingPattern  extends App {
  val expr = UnOp("abs", UnOp("abs", Number(0)))
  expr match {
    case UnOp("abs", e @ UnOp("abs", _)) => println(e)
    case _ => println("It's something else")
  }
}
