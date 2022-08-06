package training.base


/**
 * Option class
 * child class Some
 * child class None
 */
object OptionSample {

  def main(args: Array[String]): Unit = {
    val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo", "China" -> "Beijing")
    println(capitals get "France")  // return Some(paris)
    println(capitals.get("France").get)  //return paris
    println(capitals get "other" getOrElse "other")  //return other

    var option = Option("option-string")
    println(option)   // Some(option-string)
    println(option.get) //option-string
    println(option.getOrElse("other-string")) //option-string
    option = None
    println(option.getOrElse("other-string")) //other-string

    var some = showCapital(Option("Japan"))
    println(some)

  }


  def showCapital(x: Option[String]) = x match {
    case Some(s) => s
    case None => "?"
  }

}
