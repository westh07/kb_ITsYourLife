package basic.ch07.sec04.exam02;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();
        sa.fly();
        /*
        *     public void fly() {
                  System.out.println("일반 비행합니다.");
              }
        * */
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        /*
        *       @Override
                public void fly() {
                    if(flyMode == SUPERSONIC) {
                        System.out.println("초음속 비행합니다.");
                    } else {
                        super.fly();
                    }
                }
        * */
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();
    }
}
