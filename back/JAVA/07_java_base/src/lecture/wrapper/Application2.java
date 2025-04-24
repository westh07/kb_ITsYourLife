package lecture.wrapper;

public class Application2 {
    public static void main(String[] args) {

        // 문자열 파싱
        // 문자열값을 기본자료형 값으로 변경하는 것
        byte b = Byte.parseByte("1");
        short s = Short.parseShort("2");
        int i = Integer.parseInt("4");
        long l = Long.parseLong("8"); //8L은 안됨
        float f = Float.parseFloat("4.0f"); //4.0f는 됨
        double d = Double.parseDouble("8.0");
        boolean bl = Boolean.parseBoolean("true");

        // char은 charAt 사용
        char c = "abc".charAt(0);

        // 파싱의 반대 (자료형 값 -> 문자열로)
        String b2 = Byte.valueOf((byte) 1).toString();
        String s2 = Short.valueOf((short) 2).toString();
        String i2 = Integer.valueOf(4).toString();
        String l2 = Long.valueOf(8L).toString();
        String f2 = Float.valueOf(4.0f).toString();
        String d2 = Double.valueOf(8.0).toString();
        String bl2 = Boolean.valueOf(true).toString();
        String c2 = Character.valueOf('a').toString();

        String str = String.valueOf(10);

        String str2 = 123 + "";
    }
}
