package trais_structure

trait Philosohical {
  def philosohize() = {
    println("I consume memory, therefore I am!")
  }
}

trait HasLegs

class Animal

class Frog extends Animal with Philosohical with HasLegs {
  override def toString = "green"
  override def philosohize() = {
    println("It ain't easy being " + toString + "!")
  }
}

object Philosohize extends App {
  val frog = new Frog
  frog.philosohize()

  val phil: Philosohical = frog
  phil.philosohize()
}
