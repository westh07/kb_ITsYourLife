package lecture.generation;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// int long 타입의 스트링 확인
public class Application_Boxed {

    public static void main(String[] args) {
        /*
         * Wrapper 클래스 자료형의 스트림으로 변환이 필요할 때 boxing
         *
         * DoubleStream -> Stream<Double>
         * Random().doubles(num) : num의 크기의 DoubleStream을 반환해준다.
         * boxed() : 기본 타입 스트림인 XXXStream을 박싱하여 Wrapper 타입의 Stream<XXX>으로 반환한다.
         * */
        Stream<Double> doubleStream = new Random().doubles(5).boxed();

        // 문자열을 intStream으로 변환
        IntStream intChars = "hello World ABCD".chars();
        intChars.forEach(v -> System.out.print(v + " "));
    }
}
