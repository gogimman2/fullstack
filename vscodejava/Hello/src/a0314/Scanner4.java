package a0314;
import java.util.*;;
public class Scanner4 {
    public static void main(String[] args) {
        Scanner scan = new
        Scanner(System.in);
        System.out.print("실수를 입력해 주십시오 : ");
        float num = scan.nextFloat();

        System.out.printf("%.2f", num);
        scan.close();
    }
}
