package a0327;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HW {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("name", "홍길동");
        map.put("addr", "대전");
        map.put("tel", "010-1234-5678");

        System.out.println("map -> " + map);

        map.put("addr", "서울");
        System.out.println("map -> " + map);

        map.remove("name");
        System.out.println("map => " + map);

        System.out.println("addr => " + map.get("addr"));
        System.out.println("==============================================");

        Set<String> keySet = map.keySet();

        System.out.println("Iterator를 이용한 방법");
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println("==============================================");

        System.out.println("향상된 for문을 이용하는 방법");
		for(String key : keySet) {
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println("==============================================");

		System.out.println("values()메서드 이용하는 방법");
		for(String value : map.values()) {
			System.out.println(value);
		}
		System.out.println("==============================================");

        Set<Map.Entry<String, String>> mapSet = map.entrySet();

        Iterator<Map.Entry<String, String>> entryIt = mapSet.iterator();
        while (entryIt.hasNext()) {
            Map.Entry<String, String> entry = entryIt.next();

            System.out.println("key 값 : " + entry.getKey());
            System.out.println("value 값 : " + entry.getValue());
        }
    }
}
