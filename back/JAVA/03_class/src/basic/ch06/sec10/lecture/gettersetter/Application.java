package ch06.sec10.lecture.gettersetter;

public class Application {
    public static void main(String[] args) {
        Monster monster1 = new Monster();
        monster1.setName("드라큘라");
        monster1.setHp(200);
//        monster1.hp = // 불가능함 대신 getter와 setter을 사용함
        Monster monster2 = new Monster();
        monster2.setName("프랑켄슈타인");
        monster2.setHp(300);

        Monster monster3 = new Monster();
        monster3.setName("미라");
        monster3.setHp(500);

        System.out.println(monster1.toString());
        System.out.println(monster2.toString());
        System.out.println(monster3.toString());

    }
}
