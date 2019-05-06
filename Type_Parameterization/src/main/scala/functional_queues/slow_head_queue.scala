package functional_queue

class SlowHeadQueue[T](smele: List[T]) {
  def head = smele.last
  def tail = new SlowHeadQueue(smele.init)
  def enqueue(x: T) = new SlowHeadQueue(x :: smele)
}

object SlowHeadQueueOps extends App {
  val q = new SlowHeadQueue(Nil) enqueue 1 enqueue 2
  println(q)
  println(q.head)
  println(q.tail)
  println(q.tail.head)
}
