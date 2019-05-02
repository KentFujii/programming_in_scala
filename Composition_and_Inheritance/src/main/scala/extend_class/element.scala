package extend_class

abstract class Element {
  def contents: Array[String]
  val height = contents.length
  val width = if (height == 0) 0 else contents(0).length
}

class ArrayElement(conts: Array[String]) extends Element {
  def contents: Array[String] = conts
}

object GetWidth extends App {
  val ae = new ArrayElement(Array("hello", "world"))
  println(ae.width)
}
