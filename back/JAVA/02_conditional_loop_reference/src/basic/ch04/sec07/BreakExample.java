package basic.ch04.sec07;

import java.util.Random;

public class BreakExample {
    public static void main(String[] args) {
        Random rand = new Random();
        int ran = 0;
        do {
            ran = rand.nextInt(6) + 1;
            System.out.println(ran);
        }while (ran!=6);
    }
}
