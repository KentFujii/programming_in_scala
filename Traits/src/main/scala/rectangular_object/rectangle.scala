package rectangle

class Point(val x: Int, val y: Int)

trait Rectangular {
  def topLeft: Point
  def bottomRight: Point
  def left = topLeft.x
  def right = bottomRight.x
}

abstract class Component extends Rectangular {
  def width = right - left
}

class Rectangle(val topLeft: Point, val bottomRight: Point) extends Component

object GetRectangleSize extends App {
  val rect = new Rectangle(new Point(1, 1), new Point(10, 10))
  println(rect.left)
  println(rect.right)
  println(rect.width)
}
