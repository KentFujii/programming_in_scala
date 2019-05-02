package while_if

object PrintArgs extends App {
  var i = 0
  while (i < args.length) {
    println(args(i))
    i += 1
  }
}
