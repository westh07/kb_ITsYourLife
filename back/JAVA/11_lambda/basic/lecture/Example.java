package basic.lecture;

import java.time.LocalDateTime;
import java.util.function.*;

public class Example {
    public static void main(String[] args) {
        /*
         * 표준 함수형 인터페이스
         * JDK 8 자주 사용되는 함수적 인터페이스를 표준 API로 제공하고있다.
         * Consumer : 리턴값이 없는 accept() 메소드를 가지고 있다. (매개변수 소비자 역할)
         * Supplier : 매개변수가 없고, 리턴값이 있는 getXXX() 메소드를 가지고 있다. 객체 생성할 때 많이 사용
         * Function : 매개변수와 리턴값이 있는 applyXXX() 메소드를 가지고 있다. (매개변수를 리턴값으로 매핑)
         * Operator : Function과 똑같이 applyXXX() 메소드를 가지고 있는데, 매개변수로 연산을 한 후 통일된 타입으로 리턴
         * Predicate : 매개변수와 boolean 값을 반환하는 testXXX() 메소드를 가지고 있다. (매개변수를 활용해서 Boolean값 리턴)
         * */

        Consumer<String> consumer = (str) -> System.out.println(str + " : 출력됨");
        consumer.accept("안녕하세요");

        // 객체 생성 시 많이 사용
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        LocalDateTime localDateTime = supplier.get();
        System.out.println(localDateTime);

        //
        Function<String,Integer> function = (str1) -> Integer.parseInt(str1);

        String str1 = "1234";
        System.out.println(function.apply(str1));

        // operator 같은 타입끼리 연산해서 같은 타입을 리턴함
        BinaryOperator<String> binaryOperator = (str2,str3) -> str2+str3 ;
        System.out.println(binaryOperator.apply("hello","world"));

        //
        Predicate<Object> predicate = value -> value instanceof String;
        System.out.println("문자열인지 확인 : " + predicate.test("123"));
        System.out.println("문자열인지 확인 : " + predicate.test(123));
    }
}
