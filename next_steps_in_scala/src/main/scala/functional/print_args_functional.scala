package functional

object PrintArgsFunctional extends App {
  def printArgsFunctionalMethod(args: Array[String]): Unit = {
    args.foreach(println)
  }
  printArgsFunctionalMethod(args)
}
