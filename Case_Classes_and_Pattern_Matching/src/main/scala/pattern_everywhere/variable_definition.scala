package pattern_everywhere
import case_classes.{Expr, Var, Number, UnOp, BinOp}

object VariableDefinition extends App {
  val myTuple = (123, "abc")
  val (number, string) = myTuple
  println(number)
  println(string)

  val exp = new BinOp("*", Number(5), Number(1))
  val BinOp(op, left, right) = exp
  println(op)
  println(left)
  println(right)
}
