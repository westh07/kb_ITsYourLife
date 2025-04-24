package ch12.sec03.exam05;

import lombok.*;

@NoArgsConstructor // 매개변수없는 생성자
@AllArgsConstructor // 모든필드를 매개변수로 받는 생성자
@ToString // 오버라이딩
@Getter
@Setter

public class Member {
    private String id;
    private String name;
    private int age;
}
