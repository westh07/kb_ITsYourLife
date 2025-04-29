package basic.lecture.extend.run;

import basic.lecture.extend.*;

public class Application {
    public static void main(String[] args) {
        /*  클래스   상속 or 구현체
         * [Animal] (Interface)
         * ├── [Mammal] (implements Animal)
         * │       └── [Rabbit] (extends Mammal)
         * │              └── [Bunny] (extends Rabbit)
         * │                     └── [DrunkenBunny] (extends Bunny)
         * └── [Reptile] (implements Animal)
         *         └── [Snake] (extends Reptile)
         *
         * RabbitFarm
         * Rabbit의 후손만 사용할 수 있게 제한
         * */

        // 제네릭 클래스 작성시 extends 키워드를 이용해서 특정 타입만 제한을 걸 수 있다.
        // -> 특정 타입만 사용하도록 제한, 특정 타입 및 특정 타임의 자식 타임들도 대입 가능

        // Rabbit의 후손이거나 Rabbit 타입인 경우에만 사용 가능
//        RabbitFarm<Animal> farm1 = new RabbitFarm<>();
//        RabbitFarm<Snake> farm1 = new RabbitFarm<>();
        RabbitFarm<Rabbit> farm1 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm2 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm3 = new RabbitFarm<>();

//        farm4.setAnimal(new Snake());
        farm1.setAnimal(new DrunkenBunny());
        farm1.getAnimal().cry();

    }
}
