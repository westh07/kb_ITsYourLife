package basic.lecture;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        /*
        * 깊은 복사
        * - 객체(또는 배열)을 복사할 때 내부에 포함된 배열까지 모두 새로운 메모리 공간에 복사
        *
        * 얖은 복사
        * - 주소 값을 복사해 원본과 동일한 메모리 주소를 가르키게 됨(공유함)
        *
        * */

        String[] original = {"Apple","Banana","Cherry"};
        // 얕은 복사
        String[] shallowCopy = original;
        System.out.println("original = " + original);
        System.out.println("shallowCopy = " + shallowCopy);

        // 깊은 복사
        String[] deepCopy = new String[original.length];
        for (int i = 0; i < original.length; i++) {
            deepCopy[i] = original[i];
        }
        // 얕은 복사 대상의 0번째 인덱스 값을 change로 변경
        shallowCopy[0]="change";
        deepCopy[0]="orange";
        // 전체 출력
        System.out.println("original : "+ Arrays.toString(original));
        System.out.println("shallowCopy : "+Arrays.toString(shallowCopy));
        System.out.println("deepCopy : "+Arrays.toString(deepCopy));


    }
}
