package main
import ChecksumAccumulator.calculate

object FallWinterSprintSummer extends App {
  for (season <- List("Fall", "Winter", "Spring", "Summer"))
    println(season + ": " + calculate(season))
}
