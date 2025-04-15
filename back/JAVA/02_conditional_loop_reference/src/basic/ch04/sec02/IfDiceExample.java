package basic.ch04.sec02;

public class IfDiceExample {
    public static void main(String[] args) {
        // 1~6 사이의 값을 랜덤
        // Math.random : 0.0 ~ 1.0 미만 난수 반환(double)
        int num = (int)( Math.random()*6) + 1;
    }
}
