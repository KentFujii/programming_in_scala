package functional_queue

class SlowAppendQueue[T](elems: List[T]) {
  def head = elems.head
  def tail = new SlowAppendQueue(elems.tail)
  def enqueue(x: T) = new SlowAppendQueue(elems ::: List(x))
}

object SlowAppendQueueOps extends App {
  val q = new SlowAppendQueue(Nil) enqueue 1 enqueue 2
  println(q)
  println(q.head)
  println(q.tail)
  println(q.tail.head)
}
