package basic.ch17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
    public static int sum; // 합계를 구하기 위한 변수

    /*
    * 순수 함수와 부수 효과
    *
    * 순수합수 : 입력만으로 결과가 정해지고 외부 상태를 변경하지 않는 함수
    *
    * 부수효과 : 함수나 메서드가 리턴값이외에 외부 상태를 변경하는 행위
    * -> 스트림에서 병렬 처리해서 나온 결과가 이상할 수 있음
    * */
    public static void main(String[] args) {
        // parallel() : 병렬 처리
//        IntStream stream = IntStream.rangeClosed(1,100).parallel(); // 병렬 처리로 에러 발생 가능
        IntStream stream = IntStream.rangeClosed(1,100); //1~100
        stream.forEach(i->sum+=i); // 외부에 있는 변수를 사용
        System.out.println("총합 : " + sum);
    }
}
