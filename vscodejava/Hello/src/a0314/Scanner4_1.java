package a0314;
import java.util.*;;
public class Scanner4_1 {
    public static void main(String[] args) {
        Scanner scan = new
        Scanner(System.in);
        System.out.print("실수를 입력해 주십시오 : ");
        float num = scan.nextFloat();

        // System.out.printf("%.2f", num);
        num = (num + 0.005f) * 100;
        System.out.println(num);  // 159.754
        int i = (int) num;
        System.out.println(i);  // 159
        num = (float) i / 100;
        System.out.println(num);
        scan.close();
    }
}
