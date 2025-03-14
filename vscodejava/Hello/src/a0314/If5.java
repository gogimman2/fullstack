package a0314;
import java.util.*;
public class If5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("거리를 입력하십시오 : ");
        int distance = scan.nextInt();

        if (distance <= 1) {
            System.out.println("도보를 이용하세요.");
        }
        else if (distance <= 10) {
            System.out.println("자전거를 이용하세요.");
        }
        else if (distance <= 1) {
            System.out.println("자동차를 이용하세요.");
        }
        else{
            System.out.println("비행기를 이용하세요.");
        }
        scan.close();
    }
}
