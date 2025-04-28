package a0410.market;

import java.util.Scanner;

public class MarketAdmin {
    Scanner sc = new Scanner(System.in);
    public void start() {
        System.out.println("1. 관리자 메뉴(비밀번호 입력)\n2. 주문하러가기");
        System.out.print(">>");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("비밀번호를 입력해주세요.");
            System.out.print(">>");
            int pw = sc.nextInt();
            if (pw == 1234) {
                MarketMenu MarketMenu = new MarketMenu();
                MarketMenu.start();
            } else{
                System.out.println("비밀번호가 틀리셨습니다.");
                return;
            }
        } else if (choice == 2) {
            MarketService MarketService = new MarketService();
            MarketService.start();
        } else {
            System.out.println("1번 아니면 2번을 입력해주세요.");
        }
    }
}
