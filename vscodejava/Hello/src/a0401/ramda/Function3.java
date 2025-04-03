package a0401.ramda;

interface Calculator2 {
    int sum(int a, int b);
}

public class Function3 {
    public static void main(String[] args) {
        Calculator2 mc = Integer :: sum;  // 각 요소를 합산해라

        int result = mc.sum(3, 4);
        System.out.println(result);
    }
}
