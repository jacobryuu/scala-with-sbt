package training.json4s

import scala.collection.mutable.ListBuffer

import org.json4s.DefaultFormats
import org.json4s.native.Json

case class ApiKey(id: String, createDt: String, apikey: String, memo: String)


object JsonExample {


  def main(args: Array[String]): Unit = {
    var apiKeys = new ListBuffer[ApiKey]()


    for (idx <- 0 to 3) {
      apiKeys.append(ApiKey("id" + idx, java.time.LocalDate.now().toString, "apikey" + idx, "memo" + idx))
    }

    println(Json(DefaultFormats).write(apiKeys))


  }

}
