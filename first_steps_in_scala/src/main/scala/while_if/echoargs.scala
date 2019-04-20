package while_if

object EchoArgs extends App {
  var i = 0
  while (i < args.length) {
    if (i != 0)
      print(" ")
    print(args(i))
    i += 1
  }
  println()
}
