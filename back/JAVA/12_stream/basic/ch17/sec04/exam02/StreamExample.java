package basic.ch17.sec04.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        String[] strArr = { "홍길동", "신용권", "김미나"};
        int[] intArr = { 1, 2, 3, 4, 5 };
        Arrays.stream(strArr).forEach(n -> System.out.print( n + ", "));
        Arrays.stream(intArr).forEach(i-> System.out.print(i + ", "));
    }
}
