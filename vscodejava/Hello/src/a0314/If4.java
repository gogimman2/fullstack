package a0314;
import java.util.Scanner;
public class If4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("회원 등급을 입력해주세요 : ");
        int grade = scan.nextInt();

        int discount = 0;

        if (grade == 1) {
            discount = 1000;
        }
        else if (grade == 2) {
            discount = 2000;
        }
        else if (grade == 3) {
            discount = 3000;
        }
        else{
            discount = 500;
        }
        scan.close();

        System.out.println("발급받은 쿠폰 : " + discount);
    }
}
