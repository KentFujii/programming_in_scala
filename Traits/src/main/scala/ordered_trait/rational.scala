package rational

class Rational(n: Int, d: Int) extends Ordered[Rational] {
  require(d != 0)
  val numer: Int = n
  val denom: Int = d
  def this(n: Int) = this(n, 1)
  def compare(that: Rational) = (this.numer * that.denom) - (that.numer * this.denom)
}

object RationalOrdered extends App {
  val half = new Rational(1, 2)
  val third = new Rational(1, 3)
  println(half < third)
  println(half > third)
}
