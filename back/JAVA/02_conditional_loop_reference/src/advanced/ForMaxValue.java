package advanced;

public class ForMaxValue {
    public static void main(String[] args) {
        int[] array = {1,5,3,8,2};
        int max = array[0];
        for (int compare:array){
            if(max < compare){
                max = compare;
            }
        }
        System.out.println(max);
    }
}
