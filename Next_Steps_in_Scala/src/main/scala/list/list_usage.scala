package list

object ListUsage extends App {
  var oneTwo = List(1, 2)
  var threeFour = List(3, 4)
  var oneTwoThreeFour = oneTwo ::: threeFour
  println(oneTwo, " and" + threeFour + " were not mutated.")
  println("Thus, " + oneTwoThreeFour + " is a new list.")
}
