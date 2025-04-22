package basic.ch07.sec03.exam02;

public class SmartPhone  extends Phone{
    public SmartPhone() {
//        super();
        // 부모의 기본생성자를 호출 할 수 없음
    }

    public SmartPhone(String model, String color) {
        // 자식 생성자에서는 부모 생성자를 무조건 호출
        // 부모 필드를 호출하려면, 부모 생성자가 그 필드를 매개변수로 받아야 하고 자식 생성자에서 "super(필드에 대한 값)"을 호출해야함
        super(model, color);
        System.out.println("SmartPhone 생성자 호출됨..");
    }
    /*
     * 메소드 재정의 (Overriding)
     * - 부모가 가지는 메소드 선언부를 그대로 사용하면서
     * - 자식클래스에서 정의한 메소드대로 동작하도록 다시작성
     *
     * 오버라이딩의 성립요건
     * - 메소드 이름, 리턴타입, 매개변수의 타입, 갯수, 순서 가 동일해야한다.
     * - private 메서드는 접근 불가하기때문에 불가능
     * - final 메서드도 오버라이딩 불가
     * - 접근제어자  부모 메소드와 같거나 더 넓은 범위
     * - 예외처리 같은 예외거나 더 구체적인(하위) 예외 처리
     * */

    @Override // 컴파일시 정확히 오버라이딩 되었는지 체크해줌
    public void printModel() {
        super.printModel();
    }
}
