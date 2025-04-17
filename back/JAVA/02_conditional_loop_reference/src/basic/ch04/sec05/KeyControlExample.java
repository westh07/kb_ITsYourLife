package basic.ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {

    public static void main(String[] args) {
        int curSpeed = 0;
        // scan을 불러오고 변수에 scan.nextInt()를 선언을 통해 여러번 부르기
        // 마지막에 close() 까지 해서 scanner 사용하기!
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("""
                    -----------------------------
                    1. 증속 | 2. 감속 | 3. 중지
                    -----------------------------
                    """);
            System.out.printf("선택: ");
            int input = scan.nextInt();
            if(input == 1){
                curSpeed += 1;
            } else if (input == 2) {
                curSpeed -= 1;
            } else if (input == 3) {
                System.out.println("프로그램 종료");
                break;
            } else{
                System.out.println("존재하지 않은 번호 입니다.");
            }
            System.out.println("현재 속도 = "+curSpeed);
        }
        scan.close();
    }
}
