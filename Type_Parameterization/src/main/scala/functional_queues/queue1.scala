package functional_queue

class SlowAppendQueue[T](elems: List[T]) {
  def head = elems.head
  def tail = new SlowAppendQueue(elems.tail)
  def enqueue(x: T) = new SlowAppendQueue(elems ::: List(x))
}

object Queues1 extends App {
  // val q = new SlowAppendQueue(Nil) enqueue 1 enqueue 2
  val q = new SlowAppendQueue(Nil)
  val q1 = q enqueue 1
  // q.enqueue(2)
  println(q.head)
  println(q.tail)
}
