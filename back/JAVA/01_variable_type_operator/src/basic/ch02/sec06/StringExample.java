package basic.ch02.sec06;

public class StringExample {
    public static void main(String[] args) {
        // 이스케이프 문
        char ch = 'a';
        String name = "홍길동";
        String job = "이로운 도둑질";
        // \" : 큰따옴표 표시
        // \' : 작은 따옴표 표시
        String str = "나는 \"자바\"를 배웁니다";
        System.out.println("str = " + str);

        // \t : 탭
        str = "번호\t이름\t직업";
        System.out.println("str = " + str);

        // \n : 줄바꿈
        str = "번호\n이름\n직업";
        System.out.println("str = " + str);
    }
}
