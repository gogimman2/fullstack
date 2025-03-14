package a0314;
import java.util.*;
public class Scanner3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력해 주십시오 : ");
        int integer = scan.nextInt();
        System.out.print("두번째 숫자를 입력해 주십시오 : ");
        int integer2 = scan.nextInt();

        System.out.print(integer+" "+integer2);
        scan.close();
    }
}
