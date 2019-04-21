package functional

object PrintArgs extends App {
  def printArgsMethod(args: Array[String]): Unit = {
    var i = 0
    while (i < args.length) {
      println(args(i))
      i += 1
    }
  }
  printArgsMethod(args)
}
