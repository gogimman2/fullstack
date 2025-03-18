package a0318;

public class Ex2 {
    public static void main(String[] args) {
        int w = 3;
        double k = 180;
        double d = square(k);
        System.out.printf("삼겹살 %d인분의 칼로리 : %.2f kcal", w, d);
    }

    private static double square(double k) {
        return k = (double) (k * 5.179 * 3);
    }
}
