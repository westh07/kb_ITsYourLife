package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    // 문제점 : 매개변수의 값이 null 인 경우 NullPointerException 문제가 발생됨
    public static void printLength(String data) {

        int result = 0;
        try {
            result = data.length();
            System.out.println("문자 수: " + result);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException 예외 발생 : " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("[ "+data + " 의 printLength 종료]");
        }

    }
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null); // data가 null이라 error 발생됨
        System.out.println("[프로그램 종료]");
    }

}
