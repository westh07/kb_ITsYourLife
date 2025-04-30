package pm.ch10_collection.src.main.java.lecture.list;

import java.util.EmptyStackException;
import java.util.Stack;

public class Application2 {
    public static void main(String[] args) {
        /*
         * Stack
         * 선형 메모리 공간에 데이터를 저장하며 후입 선출(LIFO) 방식의 자료구조
         * */
        Stack<Integer> integerStack = new Stack<>();
        // stack에서는 push() 사용이 권장됨
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println(integerStack);

        // search() : 요소를 찾을때
        System.out.println("integerStack.search(5) : " + integerStack.search(5)); // 1이 출력됨 (위에서 부터 1)

        // peek() : 가장 상단에 (마지막에) 있는 요소 반환
        System.out.println("peek() : " + integerStack.peek());
        System.out.println(integerStack);
        // pop() : 가장 상단에 (마지막에) 있는 요소 반환 및 제거
        System.out.println("pop() : " + integerStack.pop());
        System.out.println(integerStack);
        // 다 비어있는 경우 예외 발생 가능 EmptyStackException
//        System.out.println(integerStack.pop());
    }

}
