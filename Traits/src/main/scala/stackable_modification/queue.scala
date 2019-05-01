package stackable_modification
import scala.collection.mutable.ArrayBuffer

abstract class IntQueue {
  def get(): Int
  def put(x: Int)
}

trait Doubling extends IntQueue {
  abstract override def put(x: Int) = { super.put(2 * x) }
}

trait Incrementing extends IntQueue {
  abstract override def put(x: Int) = { super.put(x + 1) }
}
trait Filtering extends IntQueue {
  abstract override def put(x: Int) = {
    if (x >= 0) super.put(x)
  }
}

class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]
  def get() = buf.remove(0)
  def put(x: Int) = { buf += x }
}

class MyQueue extends BasicIntQueue with Doubling

object QueueOps extends App {
  println("basicQueue")
  val basicQueue = new BasicIntQueue
  basicQueue.put(10)
  basicQueue.put(20)
  println(basicQueue.get())
  println(basicQueue.get())

  println("myQueue")
  val myQueue = new MyQueue
  myQueue.put(10)
  println(myQueue.get())

  println("basicIntQueue")
  val basicIntQueue = new BasicIntQueue with Doubling
  basicIntQueue.put(10)
  println(basicIntQueue.get())

  println("filteringQueue")
  val filteringQueue = (new BasicIntQueue with Incrementing with Filtering)
  filteringQueue.put(-1)
  filteringQueue.put(0)
  filteringQueue.put(1)
  println(filteringQueue.get())
  println(filteringQueue.get())

  println("incrementingQueue")
  val incrementingQueue = (new BasicIntQueue with Filtering with Incrementing)
  incrementingQueue.put(-1)
  incrementingQueue.put(0)
  incrementingQueue.put(1)
  println(incrementingQueue.get())
  println(incrementingQueue.get())
  println(incrementingQueue.get())
}
