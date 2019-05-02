package case_classes_and_pattern_matching
import case_classes.{Expr, Var, Number, UnOp, BinOp}
import math.{E, Pi}

object Patterns extends App {
  def describe(x: Any) = x match {
    case 5 => "five"
    case true => "truth"
    case "hello" => "hi!"
    case Nil => "the empty list"
    case _ => "something else"
  }
  def tupleDemo(expr: Any) = expr match {
    case (a, b, c) => println("matched " + a + b + c)
    case _ =>
  }
  def generalSize(x: Any) = x match {
    case s: String => s.length
    case m: Map[_, _] => m.size
    case _ => -1
  }
  def isStringArray(x: Any) = x match {
    case a: Array[String] => "yes"
    case _ => "no"
  }
  def simplifyAdd(e: Expr) = e match {
    case BinOp("+", x, y) if x == y => BinOp("*", x, Number(2))
    case _ => e
  }
  def simplifyAll(expr: Expr): Expr = expr match {
    case UnOp("-", UnOp("-", e)) => simplifyAll(e)
    case BinOp("+", e, Number(0)) => simplifyAll(e)
    case BinOp("*", e, Number(1)) => simplifyAll(e)
    case UnOp(op, e) => UnOp(op, simplifyAll(e))
    case BinOp(op, left, right) => BinOp(op, simplifyAll(left), simplifyAll(right))
    case _ => expr
  }
  val v = Var("x")
  val expr: Expr = BinOp("+", Number(1), v)
  val expr1 = 1
  expr match {
    case BinOp(_, _, _) => println(expr + " is a binary operation")
    case _ => println("It's something else")
  }
  expr1 match {
    case 0 => "zero"
    case somethingElse => "not zero: " + somethingElse
  }
  val pi = math.Pi
  E match {
    case `pi` => "strange math? Pi = " + pi
    case _ => "OK"
  }
  expr match {
    case BinOp("+", e, Number(0)) => println("a deep match")
    case _ =>
  }
  val list = List(1, 2, 3)
  list match  {
    case List(0, _, _) => println("found it")
    case _ =>
  }
  list match {
    case List(0, _*) => println("found it")
    case _ =>
  }
  expr match {
    case UnOp("abs", e @ UnOp("abs", _)) => e
    case _ => expr
  }
}
