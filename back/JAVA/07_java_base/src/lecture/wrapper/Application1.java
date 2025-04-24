package lecture.wrapper;

public class Application1 {
    /*
     *  기본타입         래퍼클래스
     *  byte          Byte
     *  short         Short
     *  int           Integer
     *  long          Long
     *  float         Float
     *  double        Double
     *  char          Character
     *  boolean       Boolean
     * */

    public static void main(String[] args) {
        /*
         * 박싱과 언박싱
         * 박싱 : 기본타입을 래퍼클래스의 인스턴스로 인스턴스화 하는거
         * 언박싱 : 래퍼클래스의 인스턴스를 기본타입으로 바꾸는 것
         * */

        int intValue = 10;
        // 박싱
//    Integer boxingNumber = new Interger(intValue); // 더이상 사용하지 않은 문법
        Integer boxingNumber1 = intValue;
        Integer boxingNumber2 = Integer.valueOf(intValue);
        // class명.함수명 호출 -> 메모리 상에 올라감

        int unBoxingNumber1 = boxingNumber1; // 오토 언박싱
        System.out.println(unBoxingNumber1);

        // == 숫자가 같으면 true 다르면 false
        Integer num1 = 20;
        Integer num2 = 20;
        int num3 = 20;

        System.out.println("Integer와 Integer 비교 : " + (num1 == num2)); // true
        System.out.println("int와 Integer 비교 : " + (num1 == num3)); // true
    }
}
