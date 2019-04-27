package main

class Rational(n: Int, d: Int) {
  require (d != 0)

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

  def / (that: Rational): Rational =
    new Rational(numer * that.denom, denom * that.numer)

  def / (i: Int): Rational = new Rational(numer, denom * i)

  override def toString = numer + "/" + denom

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}

object Rational extends App {
  val oneHalf = new Rational(1, 2)
  val twoThirds = new Rational(2, 3)
  println(oneHalf + twoThirds)

  val y = new Rational(3)
  println(y)

  val x = new Rational(66, 42)
  println(x)

  val a = new Rational(1, 2)
  val b = new Rational(2, 3)
  println(a + b)
  println(a + a * b)

  println(x * x)
  println(x * 14)

  implicit def intToRational(x: Int) = new Rational(x)
  println(2 * twoThirds)
}
