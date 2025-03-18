package a0318;

public class Ex1 {
    public static void main(String[] args) {
        double n = 3;
        double w = square(n);
        System.out.printf("한 변의 길이가 %.1f인 정육면체의 부피 : %.1f" + n, w);
    }

    public static double square(double n) {
        double result = n * n * n;
        return result;
    }
}
