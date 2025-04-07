package a0403.stream;

import java.util.Arrays;
import java.util.Comparator;

public class Stream2 {
    public static void main(String[] args) {
        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
        int[] result = Arrays.stream(data)  // Int stream
                             .boxed()  // int -> integer (Intstream -> Stream<Integer>)숫자 -> 객체
                             .filter((a) -> a % 2 == 0)  // 짝수만 필터링
                             .distinct()  // 중복제거
                             .sorted(Comparator.reverseOrder())  // 역순정렬
                             .mapToInt(Integer :: intValue)  // Stream<Integer> -> IntStream
                             .toArray();
        for(int num : result){
            System.out.println(num + " ");
        }
    }
}
