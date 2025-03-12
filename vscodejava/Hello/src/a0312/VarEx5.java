package a0312;

public class VarEx5 {
    public static void main(String[] args) {
        double g = 77.0;
        double s = (g - 32.0) / 1.8;
        System.out.printf(
            "화씨 %.1f도는 섭씨로 %.1f도 입니다.",
            g, s
        );
    }
}
