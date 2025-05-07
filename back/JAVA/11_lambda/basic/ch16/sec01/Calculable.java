package basic.ch16.sec01;

/*
* 함수형 인터페이스
* - 단 하나의 추상메서드만 가지는 인터페이스
* */
@FunctionalInterface
public interface Calculable {

    // 추상메서드
    void calculator(int x, int y);

//    double calc(int i, int i1);
}
