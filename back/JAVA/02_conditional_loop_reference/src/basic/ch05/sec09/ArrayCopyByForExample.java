package basic.ch05.sec09;

public class ArrayCopyByForExample {
    public static void main(String[] args) {
        int[] newIntArray = new int[5];
        int[] oldIntArray = {1,2,3};
        for(int i = 0; i < oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
        }
        for(int i:newIntArray){
            System.out.printf("%d, ",i);
        }

    }
}
