package basic.ch03.sec04;

public class AccuracyExample1 {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double result = apple - number*pieceUnit;
        System.out.println("사과 1개에서 남은 양 " + result); // 0.29999999999999993
        // 컴퓨터는 소수를 이진수로 완벽하게 표현이 불가능
        // 근사값을 이용하기 때문에 연산을 여러번하면 오차가 누적됨
        apple = 10;
        pieceUnit = 1;
        result = apple - number*pieceUnit;
        System.out.println("10을 곱해서 사용 "+ result/10);
    }
}
