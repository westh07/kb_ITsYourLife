package lecture.book;

public class Book {
    
    // 필드
    String author;
    String title;
    int pageCount;
    String coverType;

    // 생성자
    // JVM이 기본적으로 비어있는 생성자를 만들어 줌
    // public Book(){} <- 이거를 만들어줌
    // 생성자 메소드는 반드시 클래스의 이름과 동일해야한다(대소문자까지)
    // 생성자 메소드는 반환형을 작성하지 않는다. (작성하게되면 일반 메소드로 인식한다.)

    // 기본 생성자 ( 매개변수가 없는 생성자)
    // -> 매개변수 있는 생성자가 하나라도 있으면 Compiler가 자동으로 기본생성자를 만들어 주지 않는다.
    public Book(){
        System.out.println("기본 생성자 호출함...");
    }

    // 매개변수를 author와 titile만 받는 생성자
    public Book(String author, String title) {
        System.out.println("매개 변수는 author,title 만 받는 생성자 호출함...");
        this.author = author;
        this.title = title;
    }

    // 모든 필드를 매개변수로 받는 생성자
    // alt insert -> constructor -> 매개변수 전체
    public Book(String author, String title, int pageCount, String coverType) {
        System.out.println("모든 필드를 매개변수로 받는 생성자 호출함...");
        // this는 자기 자신의 주소를 가리킴
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
        this.coverType = coverType;
    }
    // 오버로딩
    // -> 같은 이름의 메소드나 생성자를 매개변수의 갯수나 타입에 따라 여러개 선언하는 것


    // 메소드
    // alt + insert -> getter
    // public(어디서든) 접근 제어자 String 반환 타입 변수명 (매개변수){}

    public String getTitle() {
        System.out.println(title+"책의 작가는 " + author);
        return title;
    }
    // alt + insert -> toString
    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", coverType='" + coverType + '\'' +
                '}';
    }
}
