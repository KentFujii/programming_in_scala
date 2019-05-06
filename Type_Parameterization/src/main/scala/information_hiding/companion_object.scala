package information_hiding

class Queue4[T] private (private val leading: List[T], private val trailing: List[T]) {
  private def mirror = {
    if (leading.isEmpty) new Queue4(trailing.reverse, Nil)
    else this
  }
  def head = mirror.leading.head
  def tail = {
    val q = mirror
    new Queue4(q.leading.tail, q.trailing)
  }
  def append(x: T) = new Queue4(leading, x :: trailing)
  override def toString() = (leading ::: trailing.reverse) mkString ("Queue(", ", ", ")")
}

object Queue4 {
  def apply[T](xs: T*) = new Queue4[T](xs.toList, Nil)
}

object CompanionObject extends App {
  val q = Queue4[Int]() append 1 append 2
  println(q)
  println(q.head)
  println(q.tail)
  println(q.tail.head)
}
