package sec02_insert;

import app.Database;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.InsertManyResult;
import org.bson.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
* mongo db는 _id 인 주 아이디가 생김
* */
public class InsertManyTest2 {
    public static void main(String[] args) {
        MongoCollection<Document> collection = Database.getCollection("todo");

        List<Document> insertList = new ArrayList<>();
        for (int i = 10; i <= 20; i++) {
            Document document1 = new Document();
            document1.append("name","user_"+i);
            document1.append("age",i);
            document1.append("created",new Date());
            insertList.add(document1);
        }

        InsertManyResult result = collection.insertMany(insertList);
        System.out.println("==> InsertManyResult : " + result.getInsertedIds());
        Database.close();
    }
}









