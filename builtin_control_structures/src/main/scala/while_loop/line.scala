package while_loop

object LineLoop extends App {
  var line = ""
  do {
    line = readLine()
    println("Read: " + line)
  } while (line != "")
}
