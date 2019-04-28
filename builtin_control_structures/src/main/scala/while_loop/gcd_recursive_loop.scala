package while_loop

object GcdRecursiveLoop extends App {
  def gcd(x: Long, y: Long): Long = if (y == 0) x else gcd(y, x % y)
  println(gcd(12, 18))
}
