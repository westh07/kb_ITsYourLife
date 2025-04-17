package ch06.sec10.lecture.gettersetter;

public class Monster {
    /*
    * 접근제어자
    * - 클래스 혹은 클래스의 멤버(field, method)에 참조연산자로 접근 할 수 있는 범위를 재한하기 위한 키워드
    * 1. public : 모든 패키지에서 접근가능
    * 2. protexted : 동일 패키지에 접근 가능 (단, 상속 관계에 있으면 다른 패키지에서도 접근 가능)
    * 3. default : 동일 패키지에서만 접근 허용 (작성안하면 default)
    * 4. private : 해당 클래스 내부에서만 접근 허용
    *   예외
    *   클래스 선언시 사용하는 접근 제어자는 public / default 두가지만 사용
    * */
    // 클래스 밖에서는 함수라고 부르고 클래스 안에서 있는 경우는 메서드라고 부름

    // private 접근 제어자는 해당 클래스 내부에서만 접근을 허용
    private String name;
    private int hp;

    // method : public으로 다른 곳에서도 사용할 수 있음

    // getter
    // 값을 인스턴스에서 꺼내기 위해 사용하는 메서드
    // 날짜 같은 것을 사용자에게 제공할때 전처리할 수 있음

    // 이름 출력
    public String getName() {
        return this.name;
    }
    // hp 출력
    public int getHp() {
        return this.hp;
    }

    // setter
    // 인스턴스의 멤버 값을 설정하기 위해 사용하는 메서드

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        // 0 이하로 바뀌면 X
        if (hp > 0){
            this.hp = hp;
        } else{
            this.hp = 0;
        }
    }
    // 생성자

}
