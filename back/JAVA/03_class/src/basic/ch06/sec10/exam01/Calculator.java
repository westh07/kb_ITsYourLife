package ch06.sec10.exam01;

public class Calculator {
    // 정적 필드
    static double PI = 3.14159;
    static final double PI1  = 3.14159; // 값을 따로 변경할 수 없음
    int z;
    // 정적 메서드
    static int plus(int x, int y) {
        return x + y;
    }
    static int minus(int x, int y) {
        return x - y;
    }
}
