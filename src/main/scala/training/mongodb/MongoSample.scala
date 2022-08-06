package training.mongodb

import com.mongodb.BasicDBObject
import com.mongodb.MongoClientURI
import com.mongodb.QueryBuilder
import org.bson.Document


object MongodbSample {
  def main(args: Array[String]): Unit = {

    import com.mongodb.MongoClient
    import com.mongodb.client.FindIterable
    import com.mongodb.client.MongoCursor

    val connectionString = "XXXX"

    val databaseName: String = "XXXX"
    val collectionName: String = "XXXX"

    val clientURI = new MongoClientURI(connectionString)
    val mongoClient = new MongoClient(clientURI)
    val database = mongoClient.getDatabase(databaseName)
    val coll = database.getCollection(collectionName)

    //    val query: BasicDBObject = new BasicDBObject
    //    query.put("domainId", "localtest")
    //    query.put("name", "extraRoom")
    //    System.out.println(query)

    val builder = QueryBuilder.start
    builder.put("domainId").is("localtest")
    builder.put("name").is("extraRoom")
    builder.put("createdAt").lessThan(1659683044)

    val rooms: FindIterable[Document] = coll.find(builder.get().asInstanceOf[BasicDBObject])
    val cursor: MongoCursor[Document] = rooms.iterator()
    while (cursor.hasNext) {
      println(cursor.next.toJson)
    }
    cursor.close()

    val count: Long = coll.countDocuments()
    System.out.println(count + "件")


  }
}
