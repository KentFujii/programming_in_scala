package call_function

object PrintTime extends App {
  def printTime(out: java.io.PrintStream = Console.out) = {
    out.println("time = " + System.currentTimeMillis())
  }
  printTime()
}
