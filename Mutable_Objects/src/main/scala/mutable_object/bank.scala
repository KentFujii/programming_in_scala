package mutable_object

class BankAccount {
  private var bal: Int = 0
  def balance: Int = bal
  def deposit(amount: Int) = {
    require(amount > 0)
    bal += amount
  }
  def withdraw(amount: Int): Boolean = {
    if (amount > bal) false
    else {
      bal -= amount
      true
    }
  }
}

object BankAccount extends App {
  val account = new BankAccount
  account.deposit(100)
  println(account.withdraw(80))
  println(account.withdraw(80))
}
