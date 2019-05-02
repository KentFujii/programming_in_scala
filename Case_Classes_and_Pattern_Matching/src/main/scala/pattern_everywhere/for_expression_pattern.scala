package pattern_everywhere

object ForExpressionPattern extends App {
  val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")
  for ((country, city) <- capitals) println("The capital of " + country + " is " + city)

  val results = List(Some("apple"), None, Some("orange"))
  for (Some(fruit) <- results) println(fruit)
}
