package basic.ch13.sec02.exam02;

public class GenericExample {
    public static void main(String[] args) {
        // 추상 메서드 반환 타입 제너릭일때,
        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();

        home.turnOnLight();

//        Home home1 = new Home();
//        home1.turnOnLight();

        CarAgency carAgency = new CarAgency();
        Car car = carAgency.rent();

    }
}
