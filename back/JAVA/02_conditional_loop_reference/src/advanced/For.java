package advanced;

public class For {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <= 100; i++) {
            if(i%3==0){
                System.out.printf("%d ",i);
                sum += i;
            }
        }
        System.out.println();
        System.out.println("sum = " + sum);
    }
}
