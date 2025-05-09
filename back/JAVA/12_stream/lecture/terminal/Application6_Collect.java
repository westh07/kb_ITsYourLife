package lecture.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application6_Collect {
    public static void main(String[] args) {
      /*
      * collect()
      * - collector 타입을 받아서 처리를 하는데, 메소드를 통해 컬렉션을 출력으로 받으ㅡㄹ 수 있다.
      * - collector 객체에서 제공하는 정적메소드를 사용 가능
      * */

        List<Member> memberList = Arrays.asList(
                new Member("test01","test01Name"),
                new Member("test02","test02Name"),
                new Member("test03","test03Name")
        );

        List<String> collector = memberList
                .stream()
                .map(m -> m.getMemberName())
                .toList();

        System.out.println("collector = " + collector);
        
        String str = memberList
                .stream()
                .map(m -> m.getMemberName())
                .collect(Collectors.joining(" ","*시작*","*끝*")); // 모든 이름을 구분자 없이 하나의 문자열로 결합해서 반환
        System.out.println("str = " + str);
    }
}
