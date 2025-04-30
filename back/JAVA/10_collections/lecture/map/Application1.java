package pm.ch10_collection.src.main.java.lecture.map;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Application1 {
    public static void main(String[] args) {
        /*
        * Map
        * -> Collection 인터페이스들과는 다른 저장 방식
        * key, value 쌍으로 저장하는 방식
        *
        * key란?
        * - 값을 찾기 위한 이름 역할의 객체
        * - 키는 중복을 허용하지 않음, 키가 다르면 중복되는 값은 저장 가능
        * */

        HashMap<String,String> hashMap = new HashMap<>();

        hashMap.put("1","java8");
        hashMap.put("2","oracle");
        hashMap.put("3","css3");
        hashMap.put("4","html5");
        hashMap.put("5","c++");
        // 키는 중복 저장되지 않고 최근 키의 value로 덮어씌워짐
        hashMap.put("5","c");
        System.out.println(hashMap);
        
        // 삭제
        hashMap.remove("1");
        System.out.println("hashMap = " + hashMap);

        // getOrDefault(key, DefalutValue)
        // 지정한 키가 맵에 없을때 기본값을 반환, 있을때는 해당 키의 value을 반환
        System.out.println("getOrDefault 테스트 : " + hashMap.getOrDefault("2","기본값"));
        System.out.println("getOrDefault 테스트 : " + hashMap.getOrDefault("1","기본값"));

        /* Iterator로 key value 출력 */
        System.out.println("================Set을 이용해 Iterator로 변환 ==================");

        // keySet() : map에 저장된 모든 key를 Set형태로 변환
        Set<String> keys = hashMap.keySet();

        // iterator() -> iterator 객체 반환
        Iterator<String> keyIter = keys.iterator();

        while (keyIter.hasNext()){
            String key = keyIter.next();

            // key값으로 value 꺼냄
            String value = hashMap.get(key);
            System.out.println(key + " = " + value);
        }

        System.out.println("================Set을 이용해 forEach로 변환 ==================");
        for(String key : keys){
            String value = hashMap.get(key);
            System.out.println(key + " = " + value);
        }

        System.out.println("================ Map 내부의 EntrySet 이용 ==================");
        // entrySet() : Map에 저장된 key와 value 쌍을 Set형태로 "뷰"로 반환
        // -> 이때 반환된 Set은 Map이랑 연결되어 있어서 추가 수정 삭제를 하면 원본에도 반영
        // Set<Map,Entry<K,V>> set = map.entrySet()
        // Map.Entry<String,String> -> 한덩어리로 entry라고 함
        Set<Map.Entry<String,String>> set = hashMap.entrySet();

        Iterator<Map.Entry<String,String>> entryIterator = set.iterator();
        while(entryIterator.hasNext()){
            Map.Entry<String,String> entry = entryIterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
