package ch15.sec06.exam01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
// 모든 필드를 받는 생성자 생성
public class Coin {
    private int value;
}
