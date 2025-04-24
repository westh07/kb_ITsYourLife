package basic.ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
//        vehicle.checkFare(); // Vehicle에 checkFare이 없기 때문에 사용 불가

        Bus bus = (Bus)vehicle;
        bus.run();
        bus.checkFare();
    }
}
