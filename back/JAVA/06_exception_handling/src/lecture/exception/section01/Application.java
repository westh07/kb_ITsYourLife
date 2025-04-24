package lecture.exception.section01;

public class Application {
    // throws을 사용해서 강제로 예외 발생
    public static void main(String[] args) throws Exception{
        ExceptionTest et = new ExceptionTest();
        /*
        * 예외 처리 방법
        * -> try-catch 처리
        * */
        et.checkEnoughMoney(1000,5000);
    }
}
