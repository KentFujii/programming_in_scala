package currency

object Main extends App {
  val japanEn = Japan.Yen from US.Dollar * 100
  val europeEuro = Europe.Euro from japanEn
  val usDollor = US.Dollar from europeEuro
  println(japanEn)
  println(europeEuro)
  println(usDollor)
  println(US.Dollar * 100 + usDollor)
}
