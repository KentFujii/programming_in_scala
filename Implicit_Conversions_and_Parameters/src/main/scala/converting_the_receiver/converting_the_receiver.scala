package converting_the_receiver

class Rational(n: Int, d: Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g
  def this(n: Int) = this(n, 1)
  def + (that: Rational): Rational = {
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )
  }
  def + (i: Int): Rational = new Rational(numer + i * denom, denom)
  def - (that: Rational): Rational = {
    new Rational(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )
  }
  def - (i: Int): Rational = new Rational(numer - i * denom, denom)
  def * (that: Rational): Rational = new Rational(numer * that.numer, denom * that.denom)
  def * (i: Int): Rational = new Rational(numer * i, denom)
  def / (that: Rational): Rational = new Rational(numer * that.denom, denom * that.numer)
  def / (i: Int): Rational = new Rational(numer, denom * i)
  override def toString = numer + "/" + denom
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}

object Main extends App {
  val oneHalf = new Rational(1, 2)
  println(oneHalf + oneHalf)
  println(oneHalf + 1)
  implicit def intToRational(x: Int) = new Rational(x, 1)
  println(1 + oneHalf)
}
