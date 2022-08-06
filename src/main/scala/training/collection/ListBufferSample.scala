package training.collection

import scala.collection.mutable.ListBuffer

import org.json4s.DefaultFormats
import org.json4s.native.Json

object ListBufferSample {
  def main(args: Array[String]): Unit = {
    val apiKeyList = List("apikey1", "apikey2", "apikey3", "apikey4")
    val memoList = List("memo1", "memo2", "memo3")
    val createDtList = List("2022/01/01", "2022/01/01", "2022/01/01", "2022/01/01")
    val idList = List("1", "2", "3", "4")


    val length = apiKeyList.length
    val list = new ListBuffer[ApiKey]()
    if (length > 0) {
      for (idx <- 0 to length - 1) {
        def memo(idx: Int) = {
          if(idx >memoList.length-1 ) "" else memoList(idx)
        }
        list.append(ApiKey(idList.apply(idx), createDtList.apply(idx), apiKeyList.apply(idx), memo(idx)))
      }
    }
    println(Option(Json(DefaultFormats).write(list)))

  }


  case class ApiKey(id: String, createDt: String, apiKey: String, memo: String)
}
