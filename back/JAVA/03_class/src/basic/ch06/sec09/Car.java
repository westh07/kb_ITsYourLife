package ch06.sec09;

public class Car {
    String model;
    int speed;

    public Car(String model) {
        this.model = model;
    }
    void setSpeed(int speed){
        this.speed = speed;
    }
    public void run(){
        System.out.println(model+"(model값)가 달립니다.(시속:"+speed+"(speed 값)km/h)");
    }
}
