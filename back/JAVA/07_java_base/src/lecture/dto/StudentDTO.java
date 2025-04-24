package lecture.dto;
import lombok.*;
@NoArgsConstructor // 매개 변수 없는 생성자
@AllArgsConstructor // 모든필드를 매개변수로 받는 생성자
//@RequiredArgsConstructor // final, notnull 이 붙은 필드가 있으면 이 필드만 초기화 시키는 생성자
@Getter
@Setter
//@Data // -> RequiredArgsConstructor, getter, setter, @tostring 다 합친것 but, 사용 권장되지 않음

// 롬복
// Data Transfer Object
// -> 데이터 전달용 객체
public class StudentDTO {
    // 클래스끼리 데이터를 전달하기 위함
//    @NonNull
    private String name;
    private int age;
    private String email;

    @Override
    public String toString() {
        return "StudentDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
