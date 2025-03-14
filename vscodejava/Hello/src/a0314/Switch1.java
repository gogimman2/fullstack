package a0314;
import java.util.Scanner;
public class Switch1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("회원 등급을 입력해주세요 : ");
        int grade = scan.nextInt();

        int discount = 0;

        switch (grade) {
            case 1:
                discount = 1000;
                break;
            case 2:
                discount = 2000;
                break;
            case 3:
                discount = 3000;
                break;
            default:
                discount = 500;
                break;
        }
        scan.close();

        System.out.println("발급받은 쿠폰 : " + discount);
    }
}
