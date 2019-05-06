package information_hiding

trait TypeAbstractionQueue[T] {
  def head: T
  def tail: TypeAbstractionQueue[T]
  def enqueue(x: T): TypeAbstractionQueue[T]
}

object TypeAbstractionQueue {
  def apply[T](xs: T*): TypeAbstractionQueue[T] = new QueueImpl[T](xs.toList, Nil)
  private class QueueImpl[T](private val leading: List[T], private val trailing: List[T]) extends TypeAbstractionQueue[T] {
    def mirror = {
      if (leading.isEmpty) new QueueImpl(trailing.reverse, Nil)
      else this
    }
    def head: T = mirror.leading.head
    def tail: QueueImpl[T] = {
      val q = mirror
      new QueueImpl(q.leading.tail, q.trailing)
    }
    def enqueue(x: T) = new QueueImpl(leading, x :: trailing)
  override def toString() = (leading ::: trailing.reverse) mkString ("Queue(", ", ", ")")
  }
}

object TypeAbstractionQueueOps extends App {
  val q1 = TypeAbstractionQueue(1, 2, 3)
  val q2 = q1.enqueue(4)

  println(q1)
  println(q2)

  println(q1.head)
  println(q2.head)

  println(q1.tail)
  println(q2.tail)
}
