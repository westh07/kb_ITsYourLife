package pm.ch10_collection.src.main.java.lecture.list;

import java.util.LinkedList;
import java.util.Queue;

public class Application3 {
    public static void main(String[] args) {
        /*
        * Queue
        * -  선형 메모리 공간에 데이터를 저장하는 선입선출(FIFO) 방식의 자료구조
        * - 자체가 인터페이스이기 때문에 인스턴스 생성이 불가 (new Queue X -> LinkedList<>();)
        * */
        Queue<String> que = new LinkedList<>();

        // offer() : Queue에 데이터를 넣는 함수
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");
        System.out.println("que = " + que);

        /*
        * peek() : 큐에 가장 앞에 있는 요소를 반환
        * poll() : 해당 큐에 가장 앞에 있는 요소를 반환 후 제거
        * */
        System.out.println("peek() : " + que.peek());
        System.out.println(que);
        System.out.println("poll() : " + que.poll());
        System.out.println(que);
    }
}
