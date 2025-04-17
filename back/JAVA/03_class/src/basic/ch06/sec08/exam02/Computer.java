package ch06.sec08.exam02;

public class Computer {
    public int sum(int ... arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


}
