package functional_queue

class BasicQueue[T](private val leading: List[T], private val trailing: List[T]) {
  private def mirror = {
    if (leading.isEmpty) new BasicQueue(trailing.reverse, Nil)
    else this
  }
  def head = mirror.leading.head
  def tail = {
    val q = mirror
    new BasicQueue(q.leading.tail, q.trailing)
  }
  def enqueue(x: T) = new BasicQueue(leading, x :: trailing)
  override def toString = leading ::: trailing.reverse mkString ("Queue(", ", ", ")")
}

object BasicQueue {
  def apply[T](xs: T*) = new BasicQueue[T](xs.toList, Nil)
}

object BasicQueueOps extends App {
  val q1 = BasicQueue(1, 2, 3)
  val q2 = q1.enqueue(4)

  println(q1)
  println(q2)

  println(q1.head)
  println(q2.head)

  println(q1.tail)
  println(q2.tail)
}
