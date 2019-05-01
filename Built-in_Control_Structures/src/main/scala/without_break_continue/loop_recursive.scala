package without_break_continue

object LoopRecursive extends App {
  def searchFrom(i: Int): Int = {
    if (i >= args.length) -1
    else if (args(i).startsWith("-")) searchFrom(i + 1)
    else if (args(i).endsWith(".txt")) i
    else searchFrom(i + 1)
  }
  val i = searchFrom(0)
  println(s"Loop Count: $i")
}
