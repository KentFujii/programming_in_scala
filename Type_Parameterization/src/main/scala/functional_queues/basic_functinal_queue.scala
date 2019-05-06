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
  val q = BasicQueue[Int]() enqueue 1 enqueue 2
  println(q)
  println(q.head)
  println(q.tail)
  println(q.tail.head)
}
