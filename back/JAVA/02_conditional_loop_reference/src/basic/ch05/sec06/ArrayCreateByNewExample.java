package basic.ch05.sec06;

import java.util.Arrays;

public class ArrayCreateByNewExample {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        System.out.println(Arrays.toString(arr1)); // [0, 0, 0]

        String[] arr2 = new String[3];
        System.out.println(Arrays.toString(arr2)); // [null, null, null]
    }
}
