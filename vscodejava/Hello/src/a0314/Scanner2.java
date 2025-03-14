package a0314;
import java.util.Scanner;
public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("단어를 입력하세요 : ");
        String sentence = scanner.nextLine();  // 1줄 입력받기

        System.out.println("당신이 선택한 단어 : " + sentence);
        scanner.close();
    }
}
