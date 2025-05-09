package lecture.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application5_Reduce {
    public static void main(String[] args) {
      /*
      * reduce() : 스트림에 있는 데이터들의 총합을 계산
      * */
        
        OptionalInt reduceOneParam = IntStream.range(1,4)
                .reduce((a,b)->{
                    return Integer.sum(a,b);
                });
        System.out.println("reduceOneParam = " + reduceOneParam); // 출력 : reduceOneParam = OptionalInt[6]

        int reduceTwoParam = IntStream.range(1,4)
                .reduce(100,(a,b)->{ // 100을 기준으로 2,3 더함
                    return Integer.sum(a,b);
                });
        System.out.println("reduceTwoParam = " + reduceTwoParam); // 출력 : reduceTwoParam = 106
    }
}
