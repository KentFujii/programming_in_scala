package implicit_conversion_to_an_expected_type

object Main extends App {
  implicit def doubleToInt(x: Double) = x.toInt
  val i: Int = 3.5
  println(i)
}
