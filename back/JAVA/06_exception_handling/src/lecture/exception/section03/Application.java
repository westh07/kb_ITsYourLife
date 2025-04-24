package lecture.exception.section03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        // BufferedReader : 파일을 읽어오는 클래스

        BufferedReader in = null;


        try {
            in = new BufferedReader(new FileReader("hello.txt"));

            String s;

            in.close();

            while((s = in.readLine()) != null) {
                System.out.println(s);
            }

            System.out.println("정상 동작함!");

            // catch 블럭을 여러개 작성할때
            // 상위 타입이 하단에 오고
            // 후손 타입이 상단에 온다
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException 발생!");

        } catch (IOException e) {
            System.out.println("IO Exception 발생!");
        }
    }
}