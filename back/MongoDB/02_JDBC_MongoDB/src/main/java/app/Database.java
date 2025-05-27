package app;
import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import static com.mongodb.MongoClientSettings.getDefaultCodecRegistry;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

// db 관련된 작업 할때 공통적인 절차는 모듈화를 통해 분리 시켜 놓는 것이 편함 -> 수정/삭제가 용이
public class Database {

    // MongoDB에 서버에 연결을 담당하는 객체
    static MongoClient client;

    // MongoDB의 특정 데이터베이스에 접근하기 위한 객체
    // getDatabase("데이터베이스 이름")을 통해 데이터베이스 선택
    static MongoDatabase database;

    /*
    * 정적 초기화 블록
    * -> 클래스가 로드될때 한번 실행됨
    * */
    static {
        // 데이터베이스 연결 및 database 참조 설정
        // Java 클래스(POJO)를 MongoDB의 DSON으로 자동 변환해주는 Codec을 제공하는 객체
        CodecProvider pojoCodecProvider = PojoCodecProvider.builder() // 체인 형태로 사용 가능
                .automatic(true) // 자동매핑 활성화
                .build();

        // MongoDB 클라이언트에서 사용할 Codec(직렬화/역직렬화 규칙) 모음
        // getDefaultCodecRegistry() : 기본 codec 설정
        // fromProviders : 사용자 정의 Codec 등록
        CodecRegistry pojoCodecRegistry = fromRegistries(getDefaultCodecRegistry(), fromProviders(pojoCodecProvider));

        // 커넥션을 맺기 위한 URL 작성
        ConnectionString connectionString = new ConnectionString("mongodb://127.0.0.1:27017");
        client = MongoClients.create(connectionString);
//        database = client.getDatabase("todo_db");
        database = client.getDatabase("todo_db").withCodecRegistry(pojoCodecRegistry);
    }

    public static void close() { // 데이터베이스 닫기
        client.close();
    }

    // 몽고 database 꺼낼 수 있는 getter
    public static MongoDatabase getDatabase() { // 데이터베이스 참조 얻기
        return database;
    }

    public static MongoCollection<Document> getCollection(String colName) {  // 전달된 컬렉션이름의 컬렉션 리턴하기
        MongoCollection<Document> collection = database.getCollection(colName);
        return collection;
    }
    public static <T> MongoCollection<T> getCollection(String colName, Class<T> clazz) { // 매핑할 값도 넣어야함
        MongoCollection<T> collection = database.getCollection(colName, clazz);
        return collection;
    }
}