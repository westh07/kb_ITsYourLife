package ch12.sec04;

public class MeasureRunTimeExample {
    public static void main(String[] args) {
        long strTime = System.nanoTime();
        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += (i+1);
        }
        long endTime = System.nanoTime();

        System.out.println("계산 결과 : " + sum);
        System.out.println("소요 시간 : " + (endTime - strTime));

    }
}
