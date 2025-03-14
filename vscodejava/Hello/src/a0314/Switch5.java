package a0314;
import java.util.*;
public class Switch5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원하는 달을 입력해 주십시오 : ");
        int vac = scanner.nextInt();

        switch (vac) {
            case 12, 1, 2:
                System.out.println("winter");
                break;
            case 3, 4, 5:
                System.out.println("spring");
                break;
            case 6, 7, 8:
                System.out.println("summer");
                break;
            case 9, 10, 11:
                System.out.println("fall");
                break;
            default:
            System.out.println("잘못 입력하였습니다 다시 입력해주십시오");
                break;
        }
        scanner.close();
    }
}
