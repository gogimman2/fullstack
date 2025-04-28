package a0410.market;

import java.util.Scanner;

public class MarketMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("일반 사용자면 1번 관리자면 2번을 눌러주세요.");
        System.out.print(">>");
        int choice = sc.nextInt();
        if (choice == 1) {
            MarketService MarketService = new MarketService();
            MarketService.start();
        } else if (choice == 2) {
            MarketAdmin MarketAdmin = new MarketAdmin();
            MarketAdmin.start();
        } else {
            System.out.println("1번 아니면 2번을 입력해주세요.");
        }
    }
}