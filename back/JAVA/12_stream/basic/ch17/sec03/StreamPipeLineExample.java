package basic.ch17.sec03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("유미선", 30)
        );

        // 1. 단게별로 변수에 담아 처리

        // 1) List<Student> -> Stream<Student>로 변환
        Stream<Student> studentStream = list.stream();

        // 2) Student의 score만 추출
        IntStream scoreStream = studentStream
                .mapToInt(student -> student.getScore());

        // Stream은 한번만 사용 가능 (이미 사용해서 더이상 사용 불가)
//        IntStream scoreStream2 = studentStream
//                .mapToInt(student -> student.getScore());

        // 3) 평균을 계산 (average())하고 Optional에서 double 값을 꺼냄
        double avg1 = scoreStream
                .average() // 평균을 계산 OptionalDouble 변환
                .orElseThrow(()-> new IllegalArgumentException("점수가 없음")); // optional 없을 경우에 대한 예외 처리
        System.out.println(avg1);

        // 파이프라인스트림 (체이닝)
        double avg2 = list.stream()
                .mapToInt(s -> s.getScore())
                .average()
                .orElse(0.0);
        System.out.println(avg2);

        // Stream 합치기 concat
        Stream<Student> studentStream1 = list.stream();
        Stream<Student> studentStream2 = Stream.of(
                new Student("세종", 40),
                new Student("광종", 30)
        );

        Stream<Student> concatStudent = Stream.concat(studentStream1,studentStream2);
        concatStudent.forEach(s -> System.out.println(s));
    }
}
