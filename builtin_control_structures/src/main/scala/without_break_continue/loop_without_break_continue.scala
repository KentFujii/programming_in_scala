package without_break_continue

object LoopWithoutBreakContinue extends App {
  var i = 0
  var foundIt = false
  while (i < args.length && !foundIt) {
    if (!args(i).startsWith("-")) {
      if (args(i).endsWith(".txt")) foundIt = true
    }
    i = i + 1
  }
  println(s"Loop Count: $i")
  println(s"Found It: $foundIt")
}
