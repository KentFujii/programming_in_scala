package extractors

object EMail {
  def apply(user: String, domain: String) = user + "@" + domain
  def unapply(str: String): Option[(String, String)] = {
    val parts = str split "@"
    if (parts.length == 2) Some(parts(0), parts(1)) else None
  }
}

object Main extends App {
  println(EMail.unapply("John@epfl.ch") equals Some("John", "epfl.ch"))
  println(EMail.unapply("John Doe") equals None)

  val email = EMail("John", "epfl.ch")
  println(email)
  println(EMail.unapply(email))
}
