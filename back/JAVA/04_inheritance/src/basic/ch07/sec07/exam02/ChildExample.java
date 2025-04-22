package basic.ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        // 자식타입 객체 생성
        Child child = new Child();
        // 부모타입 -> child를 업케스팅
        Parent parent = child;
        // Parent par = new Child();
        // 상위 계층은 Child이지만 메모리는 Parent만큼만 있기 때문에 오버라이딩되었을때는 Child가 불러와지고 아니면 Parent에 있는 메소드만 불러와진다
        parent.method1(); // Parent-method1()
        parent.method2(); // Child-method2()
//        parent.method3();
    }
}
