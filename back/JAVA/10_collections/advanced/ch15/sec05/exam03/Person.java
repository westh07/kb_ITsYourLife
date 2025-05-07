package advanced.ch15.sec05.exam03;
/*
* Comparble을 구현해서 person 객체 간의 정렬 기준을 정의
* */

public class Person implements Comparable<Person>{
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Comparable 하면 꼭 작성해야할 override compareTo를 하야함
    /*
    * Comparable
    * - 이 객체들끼리 기본 정렬(순서)를 어떻게 할 것 인지에 결정하는 인터페이스
    *
    * compareTo 메서드
    * - 음수 : this.age < o.age -> this 객체가 o  객체보다 앞에 위치
    * - 0 : this.age == o.age -> 순서 변경 없음
    * - 양수 : this.age > o.age -> this 객체가 o 객체보다 뒤에 위치
    *
    * Collections.sort() 등의 정렬 메서드는 이 반환값을 참조하여 객체들의 순서를 결정
    * */

    // 나이 int 정렬
//    @Override
//    public int compareTo(Person o) {
//        if(this.age < o.age){
//            return -1; // this가 o보다 작아서 앞으로 오도록
//        } else if (this.age == o.age) {
//            return 0;
//        } else return 1; // this가 o보다 뒤로 가도록
//    }

    // 이름 String 정렬 : String안에 있는 compareTo는 사전 순으로 정렬
    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}
