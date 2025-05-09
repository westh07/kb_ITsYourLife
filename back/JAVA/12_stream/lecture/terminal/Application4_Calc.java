package lecture.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application4_Calc {
    public static void main(String[] args) {
        /*
        * Calculating
        * -> 최소 / 최대 / 종합 / 평균 같은 ㅕㄹ과
        *
        * */
        // count() sum()
        long count = IntStream.range(1,10).count();
        int sum = IntStream.range(1,10).sum();
        System.out.println("count = " + count);
        System.out.println("sum = " + sum);

        // max(),min()  최종연산 메소드는 해당 스트림이 어떤 작업인지 모르기 때문에 반환형이 Optional이다.
        // Optional : 값이 있을 수도 있고 없을 수도 있음
        OptionalInt max = IntStream.range(1,10).max();
        OptionalInt min = IntStream.range(1,10).min();
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
