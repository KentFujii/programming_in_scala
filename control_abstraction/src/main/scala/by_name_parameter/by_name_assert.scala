package by_name_parameter

object ByNameAssert extends App  {
  var assertionsEnabled = true
  def myAssert(predicate: => Boolean) = {
    if (assertionsEnabled && !predicate) throw new AssertionError
  }

  println(myAssert(5 > 3))

  assertionsEnabled = false
  println(myAssert(5 / 0 == 0))
}
