package lecture.book;

public class Application {
    public static void main(String[] args) {
        // Book() : 생성자를 호출함
        Book myBook = new Book();
        myBook.pageCount = 5;
        myBook.title = "해리포터";
        myBook.author = "j.k. rollin";
        myBook.coverType = "hardcover";

        Book myBook2 = new Book();
        myBook2.pageCount = 10;
        myBook2.title = "해리포터2";
        myBook2.author = "j,k, rollin";
        myBook2.coverType = "hardcover";

        myBook.getTitle();
        myBook2.getTitle();
        System.out.println(myBook2.toString());

        Book myBook3 = new Book("원쌤","vuejs퀵스타트",500,"soft cover");
        System.out.println(myBook3.toString());
    }
}
