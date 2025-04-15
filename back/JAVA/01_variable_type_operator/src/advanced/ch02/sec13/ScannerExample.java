package advanced.ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // new 는 heap영역에 저장됨
        Scanner sc = new Scanner(System.in);
        System.out.print("x 값 입력 : ");
        String str = sc.nextLine();
        System.out.println("str = " + str);

        while(true){
            System.out.print("x 값 입력 : ");
            String str1 = sc.nextLine();
            System.out.println("str1 = " + str1);
            if(str1.equals("q")){
                break;
            }
        }
        sc.close();

    }
}
