package basic.ch05.sec06;

public class ArrayLengthExample {
    public static void main(String[] args) {
        int[] arr1 = {84, 90, 96};
        int sum = 0;
        for (int i:arr1){
            sum += i;
        }
        System.out.println("총합 : "+sum);
        System.out.println("평균 : "+ (float)sum/ arr1.length);
    }
}
