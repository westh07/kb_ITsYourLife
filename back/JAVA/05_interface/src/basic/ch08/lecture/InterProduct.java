package basic.ch08.lecture;

public interface InterProduct {
    /*
    * 인터페이스는 상수 필드만 작성 가능
    * public static final -> 조합을 상수 필드 -> 선언과 동시에 초기화 해야함
    *
    * */

    // public static final 이 자동으로 붙여져서 실행 됨
    int MIN_NUM = 10;

    // 생성자를 가질 수 없음
//    public InterProduct();

    // 인터페이스는 구현부가 있는 메서드를 가질 수 없다.
//    public void nonStaticMethod(){}

    // static 메서드는 가질 수 있음 (java 8버전)
    public abstract void nonStaticMethod();
    /*
     * 인터페이스 안에 작성한 메소드는 public abstract의 의미를 가진다.
     * 인터페이스를 상속 받는 클래스는 메소드를 구현할때 접근제어자를 public으로 해야지 구현 가능함
     * */

    void abstMethod();
    // static 메서드는 가질 수 있음 (java 8버전 이후)
    public static void staticMethod() {
        System.out.println("InterProduct 인터페이스에서 staticMethod 호출됨...");
    }

    // 인터페이스에서 일반 메소드를 만들기 위해서는 default 키워드를 붙여야한다.
    public default void defaultMethod() {
        System.out.println("InterProduct 클래스의 defaultMethod 호출됨...");
    }
}
