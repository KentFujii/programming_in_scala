package variable_argument_extractors

object ExpandedEMail {
  def unapplySeq(email: String)
      : Option[(String, Seq[String])] = {
    val parts = email split "@"
    if (parts.length == 2) Some(parts(0), parts(1).split("\\.").reverse)
    else None
  }
}

object Main extends App {
  val s = "tom@support.epfl.ch"
  val ExpandedEMail(name, topdom, subdoms @ _*) = s
  println(name)
  println(topdom)
  println(subdoms)
}
