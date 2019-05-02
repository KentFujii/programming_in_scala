package call_function

object PrintTime2 extends App {
  def printTime(out: java.io.PrintStream = Console.out, divisor: Int = 1) = {
    out.println("time = " + System.currentTimeMillis() / divisor)
  }
  printTime(divisor = 1000)
}
