package basic.ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";
        int slice = subject.indexOf("프로그래밍");
        System.out.println(subject.substring(0,slice-1)+"와 관련된 책이군요.");
    }
}