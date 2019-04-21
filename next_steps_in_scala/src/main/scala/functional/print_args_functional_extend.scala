package functional

object PrintArgsFunctionalExtend extends App {
  def formatArgsFunctionalExtendMethod(args: Array[String]) = args.mkString("\n")
  println(formatArgsFunctionalExtendMethod(args))
}
