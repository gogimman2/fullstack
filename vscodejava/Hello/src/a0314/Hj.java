package a0314;
import java.util.*;
public class Hj {
    public static void main(String[] args) {
        // 사용자로부터 세 개의 정수를 입력받아, 가장 큰 수를 출력하는 프로그램을 작성하세요.
        Scanner scan = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력해 주십시오 : ");
        int num1 = scan.nextInt();
        System.out.print("두번째 숫자를 입력해 주십시오 : ");
        int num2 = scan.nextInt();
        System.out.print("세번째 숫자를 입력해 주십시오 : ");
        int num3 = scan.nextInt();

        if (num1 > num2) {
            System.out.println(num1);
        }
        else if (num2 > num3) {
            System.out.println(num2);
        }
        else if (num3 > num1) {
            System.out.println(num3);
        }
        scan.close();
    }
}
