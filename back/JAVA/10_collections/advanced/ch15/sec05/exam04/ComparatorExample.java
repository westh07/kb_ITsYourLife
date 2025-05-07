package advanced.ch15.sec05.exam04;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        // 파일 이용
//        TreeSet<Fruit> treeSet = new TreeSet<>(new FruitComparator());
        TreeSet<Fruit> treeSet = new TreeSet<>(new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                // o1이 o2보다 뒤에 오게함
                return Integer.compare(o1.getPrice(),o2.getPrice());
            }
        });
        treeSet.add(new Fruit("포도",3000));
        treeSet.add(new Fruit("딸기",5000));
        treeSet.add(new Fruit("수박",18000));
        treeSet.add(new Fruit("참외",2000));

        for(Fruit f : treeSet){
            System.out.println(f.getName() + " : " + f.getPrice());
        }
    }
}
