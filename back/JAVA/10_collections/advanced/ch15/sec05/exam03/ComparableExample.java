package advanced.ch15.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        /*
        * TreeSet 특징
        * - 자동정렬 유지 : 요소를 추가하면 내부에서 compareTo 또는 생성자에 넘긴 Comparator에 따라 적절한 위치에 삽입 및 항상 오름차순 또는 Comparator 기준으로 정렬됨
        * - 중복 불가
        * - null 금지
        * */
        TreeSet<Person> treeSet = new TreeSet<>();
        treeSet.add(new Person("홍길동",25));
        treeSet.add(new Person("김자바",30));
        treeSet.add(new Person("박씨플",15));
        treeSet.add(new Person("python",15));
        for(Person p : treeSet)
        {
            System.out.println(p.name + " : " + p.age);}
    }
}
