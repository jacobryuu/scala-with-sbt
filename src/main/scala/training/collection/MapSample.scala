package training.collection

object MapSample {

  def main(args: Array[String]): Unit = {
    //map add element
    var map: Map[Int, String] = Map(1 -> "test1", 2 -> "test2")
    map += (1 -> "test111")

    // filter
    val filterMap: Map[Int, String] = Map(
      1 -> "apple",
      2 -> "orange",
      3 -> "grape",
      4 -> "strawberry",
    )
    // match
    println(filterMap.filter { e =>
      e match {
        case (e._1, _) => e._1 % 2 == 1
      }
    })
    //
    val filterResult = filterMap.filter(x => x._1 == 2 && x._2 == "orange")
    
    //for
    for {
      (key, value) <- filterMap
      if (key > 2)
    } println((key, value))



   println((31 to 60).map("tag" + _))

    for (i <- 31 to 60) {
      println("tag" + i)
    }
  }

}
