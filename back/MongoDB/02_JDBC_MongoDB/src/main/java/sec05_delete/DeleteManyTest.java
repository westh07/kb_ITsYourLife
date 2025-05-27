package sec05_delete;

import app.Database;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.DeleteResult;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.gt;

public class DeleteManyTest {
    public static void main(String[] args) {
        MongoCollection<Document> collection = Database.getCollection("todo");
        //String id = "6835279a1b9fb913da880b03";

        Bson query = gt("age", 15);

        DeleteResult result = collection.deleteMany(query);

        System.out.println("==> DeleteResult : " + result.getDeletedCount());
        Database.close();
    }
}