package advanced;

public class ForStar {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5-i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
