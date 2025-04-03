package a0401.ramda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ramda1 {
    public static void main(String[] args) {
        // List<String> name = new ArrayList<>();
        // name.add("apple");
        // name.add("banana");
        // name.add("orange");
        // for(int i = 0;i < name.size();i++){
        //     System.out.println(name.get(i));
        // }
        List<String> names = Arrays.asList("apple", "banana", "orange");
        System.out.println();
        for(String name : names){
            System.out.println(name);
        }
        // 람다 foreach
        names.forEach(name -> System.out.println(name));
        System.out.println();
        
        // 스트림
        // 길이가 6이상(스펠링릐 갯수) 요소만 필터링해라
        names.stream()
             .filter(name -> name.length() >= 6)
             .forEach(System.out :: println);
    }
}
