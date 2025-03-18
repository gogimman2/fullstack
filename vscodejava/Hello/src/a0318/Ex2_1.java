package a0318;

public class Ex2_1 {
    public static void main(String[] args) {
        int n = 3;
        double x = calculate5(n);
        System.out.printf("삼겹살 %d인분의 칼로리 : %.2f kcal", n, x);
    }

    private static double calculate5(int amount) {
        int totalGram = amount * 180;
        double totalKcal = totalGram * 5.179;
        return totalKcal;
    }
}