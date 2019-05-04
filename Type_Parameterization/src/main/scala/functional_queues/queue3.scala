package functional_queue

class Queue[T](
  private val leading: List[T],
  private val trailing: List[T]
) {
  private def mirror = {
    if (leading.isEmpty) new Queue(trailing.reverse, Nil)
    else this
  }
  def head = mirror.leading.head
  def tail = {
    val q = mirror
    new Queue(q.leading.tail, q.trailing)
  }
  def enqueue(x: T) = new Queue(leading, x :: trailing)
  override def toString = leading ::: trailing.reverse mkString ("Queue(", ", ", ")")
}

object Queue {
  def apply[T](xs: T*) = new Queue[T](xs.toList, Nil)
}

object Queues3 extends App {
  val q = Queue[Int]() enqueue 1 enqueue 2
  println(q.head)
  println(q.tail.head)
}
