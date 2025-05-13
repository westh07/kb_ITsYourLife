package basic.ch18.sec04.exam01;

import java.io.*;

public class WriteExample {
    public static void main(String[] args) {
        /*
        * Writer
        * - 문자 기반 출력 스트림의 최상위 추상클래스
        * - 2바이트 단위로 처리
        * - 주로 FileWriter, InputStreamWriter 등을 사용
        * */
        try(Writer writer = new FileWriter("test.txt")){
            char a = 'A';
            writer.write(a);
            char b = 'B';
            writer.write(b);
            char[] arr = { 'C', 'D', 'E' };
            writer.write(arr);

            // 안써도 close() 호출 될 때 자동으로 호출됨
            writer.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
