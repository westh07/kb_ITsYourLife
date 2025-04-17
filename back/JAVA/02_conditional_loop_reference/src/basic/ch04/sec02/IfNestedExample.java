package basic.ch04.sec02;

import java.util.Random;

public class IfNestedExample {
    public static void main(String[] args) {
        int score = 0;
        Random rand = new Random();
        score = rand.nextInt(20)+81;
        // 0~19 + 81 = 81~100
        if ((score <= 100)&&(score >= 95)){
            System.out.println("점수 : "+score);
            System.out.println("학점 : A+");
        } else if (score >= 90) {
            System.out.println("점수 : "+score);
            System.out.println("학점 : A");
        }else if (score >= 85) {
            System.out.println("점수 : "+score);
            System.out.println("학점 : B+");
        }else{
            System.out.println("점수 : "+score);
            System.out.println("학점 : B");
        }
    }
}
