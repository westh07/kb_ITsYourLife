package basic.ch05.sec09;

public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] newStrArray = new String[5];
        String[] oldStrArray = { "java", "array", "copy" };
        for(int i = 0; i < oldStrArray.length; i++) {
            newStrArray[i] = oldStrArray[i];
        }
        for(String i:newStrArray){
            System.out.printf("%s, ",i);
        }

    }
}
