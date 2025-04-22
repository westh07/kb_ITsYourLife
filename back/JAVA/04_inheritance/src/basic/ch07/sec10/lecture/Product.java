package basic.ch07.sec10.lecture;
// 추상화
public abstract class Product {
    private int nonStaticField;
    private static int staticField;


    public Product() {
    }

    // 추상 메서드를 가질 수 있다 : 몸통 { } 는 작성 X
    public abstract void abstMethod();
    public void nonStaticMethod(){
        System.out.println("추상클래스안의 noneStaticMethod() 호출됨!");
    }
    public static void staticMethod(){
        System.out.println("추상클래스안의 staticMethod() 호출됨!");
    }
}
