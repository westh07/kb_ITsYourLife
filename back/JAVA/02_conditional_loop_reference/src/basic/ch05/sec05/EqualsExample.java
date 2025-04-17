package basic.ch05.sec05;

public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";
        // == 으로 두 변수 비교
        System.out.println(strVar1 == strVar2?"strVar1과 strVar2는 참조가 같음":"strVar1과 strVar2는 참조가 다름"); // t

        // 내용으로 두 변수 비교
        System.out.println(strVar1.equals(strVar2)?"strVar1과 strVar2는 문자열이 같음":"strVar1과 strVar2는 문자열이 다름"); //t
        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");
        // == 으로 두 변수 비교
        System.out.println(strVar3 == strVar4?"strVar3과 strVar4는 참조가 같음.":"strVar3과 strVar4는 참조가 다름" ); //f
        // 내용으로 두 변수 비교
        System.out.println(strVar3.equals(strVar4)?"strVar3과 strVar4는 문자열이 같음":"strVar3과 strVar4는 문자열이 다름"); //t
    }
}
