package basic.ch17.sec10;

import java.util.Arrays;

public class AggregateExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        long count = Arrays.stream(arr).filter(n -> n%2==0).count();
        System.out.println("2의 배수 개수 : " + count);

        int sum = Arrays.stream(arr).filter(n -> n%2==0).sum();
        System.out.println("2의 배수의 합 : " + sum);

        double avg = Arrays.stream(arr).filter(n -> n%2==0).average().orElse(0.0);
        System.out.println("2의 배수의 평균 : " + avg);

        int max = Arrays.stream(arr).filter(n->n%2==0).max().orElse(-1);
        System.out.println("최대값 : " + max);
        int min = Arrays.stream(arr).filter(n->n%2==0).min().orElse(-1);
        System.out.println("최소값 : " + min);

        Arrays.stream(arr).filter(n->n%3==0).limit(1)
                .forEach(n -> System.out.println("첫 번째 3의 배수 : " + n));

    }
}
