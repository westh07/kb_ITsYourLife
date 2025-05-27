package sec03_find;
import app.Database;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import java.util.Iterator;

public class FindTest {
    public static void main(String[] args) {
        MongoCollection<Document> collection = Database.getCollection("todo");

        // FindIterable ==> mysql jdbc에서 ResultSet에 해당
        // 반복해서 꺼내주는 기능이 없음 --> 외부 반복자를 만들어주어야함
        FindIterable<Document> doc = collection.find();

        // Iterator : 반복자
        Iterator itr = doc.iterator(); // FindIterable 안에 있는 반복 메소드

        while (itr.hasNext()) {
            System.out.println("==> findResultRow : " + itr.next());
        }
        // itr.hasNext()가 false일 때까지 무한 반복!

        Database.close();
    }
}