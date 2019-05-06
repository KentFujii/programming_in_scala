package bounds

class Queue[+T] private (private[this] var leading: List[T], private[this] var trailing: List[T]) {
  private def mirror() = {
    if (leading.isEmpty) {
      while (!trailing.isEmpty) {
        leading = trailing.head :: leading
        trailing = trailing.tail
      }
    }
  }
  def head: T = {
    mirror()
    leading.head
  }
  def tail: Queue[T] = {
    mirror()
    new Queue(leading.tail, trailing)
  }

  def enqueue[U >: T](x: U) = new Queue[U](leading, x :: trailing)
  override def toString = leading ::: trailing.reverse mkString ("Queue(", ", ", ")")
}

object Queue {
  def apply[T](xs: T*) = new Queue[T](xs.toList, Nil)
}


object QueueOps extends App {
  val q1 = Queue(1, 2, 3)
  val q2 = q1.enqueue(4)

  println(q1)
  println(q2)

  println(q1.head)
  println(q2.head)

  println(q1.tail)
  println(q2.tail)
}
