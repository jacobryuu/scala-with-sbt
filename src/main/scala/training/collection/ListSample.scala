package training.collection

import org.json4s._
import org.json4s.native.Serialization

object ListSample {

  def main(args: Array[String]): Unit = {
    implicit val formats = Serialization.formats(NoTypeHints)

    val list = List[Int](1, 2, 3, 4, 5, 6)
    list.::(7)
    println(list(8))
    val result = list.filter(_ > 3)
    println(result)

    var UserList = List(
      User(1, "Yellow Tulip"),
      User(2, "Red Rose"),
      User(3, "Black Rose"))

    println(UserList.filter(user => user.id == 1))
    println(UserList)


  }

}


case class User(id: Int, name: String)