package variable_argument_extractors

object EMail {
  def apply(user: String, domain: String) = user + "@" + domain
  def unapply(str: String): Option[(String, String)] = {
    val parts = str split "@"
    if (parts.length == 2) Some(parts(0), parts(1)) else None
  }
}

object Domain {
  def apply(parts: String*): String = parts.reverse.mkString(".")
  def unapplySeq(whole: String): Option[Seq[String]] = Some(whole.split("\\.").reverse)
}

object TomInDotCom extends App {
  def isTomInDotCom(s: String): Boolean = s match {
    case EMail("tom", Domain("com", _*)) => true
    case _ => false
  }
  println(isTomInDotCom("tom@sun.com"))
  println(isTomInDotCom("peter@sun.com"))
  println(isTomInDotCom("tom@acm.com"))
}
