package app;

import app.domain.Todo;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static com.mongodb.client.model.Filters.eq;

public class App {
    private static final Scanner scanner = new Scanner(System.in);
    private static final MongoCollection<Todo> collection = Database.getCollection("todo", Todo.class);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n==== Todo 관리 프로그램 ====");
            System.out.println("0. 종료");
            System.out.println("1. insertOne");
            System.out.println("2. insertMany");
            System.out.println("3. findAll");
            System.out.println("4.sw updateOne");
            System.out.println("5. deleteOne");
            System.out.print("원하는 작업 번호를 입력하세요: ");

            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // 개행 문자 제거
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력하세요.");
                scanner.nextLine(); // 잘못된 입력 제거
                continue;
            }

            switch (choice) {
                case 0 -> {
                    System.out.println("프로그램을 종료합니다.");
                    Database.close();
                    return; // main 메서드 종료
                }
                case 1 -> insertOne();
                case 2 -> insertMany();
                case 3 -> findAll();
                case 4 -> updateOne();
                case 5 -> deleteOne();
                default -> System.out.println("잘못된 번호입니다.");
            }
        }
    }

    private static void deleteOne() {
        Bson query = eq("age",10);
        DeleteResult result = collection.deleteOne(query);
    }

    private static void updateOne() {
        String id = "683563b9d44b5a4d098e3adb";
//        Bson query = eq("_id", new ObjectId(id));
        Bson query = eq("desc", "desc1");
        Bson updates = Updates.combine(
            Updates.set("name","modify name")
        );
        UpdateResult result = collection.updateOne(query, updates);
    }

    private static void insertMany() {
        List<Todo> insertList = new ArrayList<>();
        Todo newTodo1 = new Todo(null,"insertMany 예시 title1","insertMany 예시 desc1",false);
        Todo newTodo2 = new Todo(null,"insertMany 예시 title2","insertMany 예시 desc2",false);
        insertList.add(newTodo1);
        insertList.add(newTodo2);
        collection.insertMany(insertList);
    }

    private static void findAll() {
        // todo 객체 list 형태
        List<Todo> todos = new ArrayList<>();

        // into() : List에다 매핑한 find 결과를 담아줌
        collection.find().into(todos);

        for(Todo todo:todos){
            System.out.println(todo);
        }
    }

    private static void insertOne() {
        // id title desc done
        String t = null;
        String d = null;
        Boolean done = null;
        while (true) {
            try {
                System.out.print("title을 입력하시오 : ");
                t = scanner.nextLine();

                System.out.print("desc 설명을 입력하시오 : ");
                d = scanner.nextLine();

                System.out.print("done을 입력하시오 (true/false) : ");
                done = Boolean.parseBoolean(scanner.nextLine());

                break;
            } catch (Exception e) {
                System.out.println("다시 입력하시오");
            }
        }
        Todo newTodo = new Todo(null,t,d,done);

        System.out.println("ID : " + newTodo.getId() + " ===> insert 이전");

        collection.insertOne(newTodo);

        // insertOne을 할 경우 객체에 id 값이 자동으로 저장됨
        System.out.println("ID : " + newTodo.getId() + " ===> insert 이후");
    }
}
