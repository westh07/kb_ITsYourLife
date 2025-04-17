package ch06.sec10.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        double pi = Calculator.PI;
        double result1 = 10*10*Calculator.PI;
        System.out.println("result1 = " + result1);

        int result2 = Calculator.plus(10,5);
        System.out.println("result2 = " + result2);

        int result3 = Calculator.minus(10,5);
        System.out.println("result3 = " + result3);

        Calculator cal1 = new Calculator();
        cal1.z = 10;
        System.out.println(cal1.z);
        cal1.PI = 15; // static인데 임의로 할당함
        // cal1.PI1 = 3 // 이건 에러됨

        Calculator cal2 = new Calculator();
        cal2.z = 20;
        System.out.println(cal2.z);

        System.out.println("cal2.PI = " + cal2.PI); // 변경된 값이 출력됨

        // 인스턴스를 만들지 않아도 클래스 이름.""으로 참조할 수 있음
        System.out.println(Calculator.plus((int)pi,5));
    }
}
