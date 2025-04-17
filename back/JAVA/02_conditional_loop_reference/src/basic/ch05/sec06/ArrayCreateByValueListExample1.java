package basic.ch05.sec06;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        String[] season = {"Spring", "Summer", "Fall", "Winter"};
        int[] scores = { 83, 90, 87 };
        for (int i = 0; i < season.length; i++) {
            System.out.println("season["+i+"] : "+season[i]);
        }
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("총합 : "+sum);
        System.out.println("평균 : "+ (float)sum/ scores.length);
    }
}
