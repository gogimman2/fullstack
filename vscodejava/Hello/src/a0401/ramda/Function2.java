package a0401.ramda;

interface Calculator1 {
    int sum(int a, int b);
}

public class Function2 {
    public static void main(String[] args) {
        Calculator1 mc = (int a, int b) -> a + b;  // 람다 적용한 함수
        // 계산후 리턴 -> a + b;

        // 이렇게 람다 함수를 사용하면 MyCalculator와 같은 실제 클래스 없이도 Calculator1 객체를 생성할수 있고, 일반 코드보다 훨씬 간결하다.
        int result = mc.sum(3, 4);
        System.out.println(result);
    }
}
