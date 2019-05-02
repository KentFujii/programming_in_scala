package pattern_match
import case_classes.{Expr, Var, Number, UnOp, BinOp}
import math.{E, Pi}

object ConstantAndVariablePattern extends App {
  def describe(x: Any) = x match {
    case 5 => "five"
    case true => "truth"
    case "hello" => "hi!"
    case Nil => "the empty list"
    case _ => "something else"
  }
  println(describe(5))
  println(describe(true))
  println(describe("hello"))
  println(describe(Nil))
  println(describe(List(1, 2, 3)))

  val expr = 1
  expr match {
    case 0 => println("zero")
    case somethingElse => println("not zero: " + somethingElse)
  }
  E match {
    case Pi => println("strange math? Pi = " + Pi)
    case _ => println("OK")
  }
  val pi = Pi
  E match {
    case `pi` => println("strange math? Pi = " + Pi)
    case _ => println("OK")
  }
}
