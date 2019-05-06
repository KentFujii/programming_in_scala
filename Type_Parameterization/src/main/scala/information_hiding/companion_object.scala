package information_hiding

class CompanionObjectQueue[T] private (private val leading: List[T], private val trailing: List[T]) {
  private def mirror = {
    if (leading.isEmpty) new CompanionObjectQueue(trailing.reverse, Nil)
    else this
  }
  def head = mirror.leading.head
  def tail = {
    val q = mirror
    new CompanionObjectQueue(q.leading.tail, q.trailing)
  }
  def enqueue(x: T) = new CompanionObjectQueue(leading, x :: trailing)
  override def toString() = (leading ::: trailing.reverse) mkString ("Queue(", ", ", ")")
}

object CompanionObjectQueue {
  def apply[T](xs: T*) = new CompanionObjectQueue[T](xs.toList, Nil)
}

object CompanionObjectQueueOps extends App {
  val q1 = CompanionObjectQueue(1, 2, 3)
  val q2 = q1.enqueue(4)

  println(q1)
  println(q2)

  println(q1.head)
  println(q2.head)

  println(q1.tail)
  println(q2.tail)
}
