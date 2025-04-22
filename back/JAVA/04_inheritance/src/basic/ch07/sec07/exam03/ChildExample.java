package basic.ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();
        // 불가능함 지금 parent에는 field2 필드가 없음
//        parent.field2 = "data2";
//        parent.method3();
        Child child = (Child) parent;
        child.field2 = "data2";
        child.method3();
    }
}
