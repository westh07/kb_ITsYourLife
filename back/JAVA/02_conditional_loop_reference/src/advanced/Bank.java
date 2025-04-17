package advanced;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0;
        while(true){
            System.out.println("""
                    -----------------------------------
                    1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
                    -----------------------------------
                    """);
            System.out.printf("선택> ");
            int choose = sc.nextInt();
            if(choose == 1){
                System.out.printf("예금액> ");
                int input = sc.nextInt();
                balance += input;
            } else if (choose == 2) {
                System.out.printf("출금액> ");
                int input = sc.nextInt();
                balance -= input;
            } else if (choose == 3) {
                System.out.println("잔고> " + balance);
            } else if (choose == 4) {
                System.out.println("프로그램 종료");
                break;
            } else{
                System.out.println("제공되지 않은 서비스 번호입니다.");
            }
        }
    }
}
