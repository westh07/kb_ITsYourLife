package basic.ch05.sec05;

public class SplitExample {
    public static void main(String[] args) {
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
        // indexOf subString(start,end) split("나눌 값") length
        String[] sen = board.split(",");
        for (String one:sen){
            System.out.println(one);
        }
    }
}
