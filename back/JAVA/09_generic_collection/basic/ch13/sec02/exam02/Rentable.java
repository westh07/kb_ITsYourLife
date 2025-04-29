package basic.ch13.sec02.exam02;

public interface Rentable<P> {
    // 추상메서드 -> implement했을 때 꼭 구현해야함!
    // 반환 타입 P
    P rent();
}
