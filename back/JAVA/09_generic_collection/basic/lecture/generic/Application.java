package basic.lecture.generic;

public class Application {
    /*
     * 제네릭 프로그래밍
     * -> 데이터의 형식에 의존하지 않고 하나의 값이 여러 다른 데이터를 가질 수 있음
     * -> 재사용성을 높이는 프로그래밍 방식
     * */

    public static void main(String[] args) {
        // 해당 클래스의 인스턴스를 만들대 타입을 명시해줌으로써 객체가 생성될 때 타입이 지정
        GenericTest<String> gtS = new GenericTest<>();
        GenericTest<Integer> gti = new GenericTest<>();

        gti.setValue(10); // 10(int값)이 Integer로 오토박싱된다.
//        gti.getValue();

        System.out.println(gti.getValue());
        System.out.println(gti.getValue() instanceof Integer);

        gtS.setValue("홍길동");
        System.out.println(gtS.getValue());
        System.out.println(gtS.getValue() instanceof String);
    }
}
