package ch06.sec07.exam04;

public class Car {
    //필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    //생성자 매개변수 x
    Car() {
    }

    //생성자 model
    Car(String model) {
        this.model = model;
    }

    //생성자 model color
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    //생성자 model color maxSpeed
    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }


}
