package if_expression

object IfExpression extends App {
  val filename = if (!args.isEmpty) args(0) else "default.txt"
  println(filename)
}
