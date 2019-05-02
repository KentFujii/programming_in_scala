package composition_and_inheritance

abstract class Element {
  def contents: Array[String]
  def height: Int = contents.length
  def width: Int = if (height == 0) 0 else contents(0).length
}

class LineElement(s: String) extends Element {
  val contents = Array(s)
  override def width = s.length
  override def height = 1
}

object GetWidth extends App {
  val le = new LineElement("hello world")
  println(le.width)
}
