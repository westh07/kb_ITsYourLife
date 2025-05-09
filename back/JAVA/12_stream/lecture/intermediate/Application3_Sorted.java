package lecture.intermediate;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Application3_Sorted {
    public static void main(String[] args) {
        /*
        * sorted(Compartor<>())
        * 스트림에 담긴 데이터들을 정렬해서 반환
        * */
        List<Integer> integerList = IntStream.of(5,10,99,2,4,6)
                .boxed() // 각 정수를 Integer형태로 변환
                .sorted()
                .toList(); // 리스트로 변환
        System.out.println("integerList = " + integerList);

        List<Integer> reverseList = IntStream.of(5,10,99,2,4,6)
                .boxed() // 각 정수를 Integer형태로 변환
                .sorted(Comparator.reverseOrder())
                .toList(); // 리스트로 변환
        System.out.println("reverseList = " + reverseList);
    }
}
