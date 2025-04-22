package basic.ch07.sec10.lecture;

// 상속
public class SmartPhone extends Product{

    @Override
    public void abstMethod() {
        System.out.println("Product 클래스의 abstMethod 오버라이딩한 메소드 호출..!");
    }
}
