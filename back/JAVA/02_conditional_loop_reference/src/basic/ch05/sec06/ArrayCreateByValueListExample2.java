package basic.ch05.sec06;

public class ArrayCreateByValueListExample2 {
    static void printItem(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("score["+i+"] : "+arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] scores = new int[] {83, 90, 87};
        printItem(scores);
    }
}
