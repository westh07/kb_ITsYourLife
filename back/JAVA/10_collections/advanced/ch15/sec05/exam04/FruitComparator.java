package advanced.ch15.sec05.exam04;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> {

    @Override
    public int compare(Fruit o1, Fruit o2) {
        if(o1.getPrice() < o2.getPrice()) {
            return -1; // o1이 o2보다 앞에 오게함
        }
        else if (o1.getPrice() > o2.getPrice()) {
            return 1; // o1이 o2보다 뒤에 오게함
        }
        else return 0;
    }
}
