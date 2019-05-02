package field

class Rational(n: Int, d: Int) {
  require(d != 0)
  val numer: Int = n
  val denom: Int = d
  override def toString = numer + "/" + denom
  def add(that: Rational): Rational = {
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )
  }
}

object Rational extends App {
  val oneHalf = new Rational(1, 2)
  println(oneHalf)

  val twoThirds = new Rational(2, 3)
  println(twoThirds)

  println(oneHalf.add(twoThirds))
}
