package basic.ch04.sec02;

import java.util.Random;

public class SwitchExample {
    public static void main(String[] args) {
        int num = 0;
        Random rand = new Random();
        num = rand.nextInt(6) + 1;
        switch (num){
            case 1:
                System.out.println("1이 나왔습니다.("+num+")");
                break;
            case 2:
                System.out.println("2가 나왔습니다.("+num+")");
                break;
            case 3:
                System.out.println("3이 나왔습니다.("+num+")");
                break;
            case 4:
                System.out.println("4가 나왔습니다.("+num+")");
                break;
            case 5:
                System.out.println("5가 나왔습니다.("+num+")");
                break;
            case 6:
                System.out.println("6이 나왔습니다.("+num+")");
                break;
            default:
                System.out.println("what???");
                break;

        }
    }
}
