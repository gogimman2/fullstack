package a0410.market;

import java.util.Scanner;

public class MarketMenu {
    Market market = Market.getInstance();
    Scanner sc = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("\n=== 관리자 메뉴 ===");
            System.out.println("1. 메뉴판 보기");
            System.out.println("2. 메뉴 추가");
            System.out.println("3. 메뉴 삭제");
            System.out.println("4. 가격 수정");
            System.out.println("5. 주문하러 가기");
            System.out.println("6. 종료");
            System.out.print("선택 >> ");

            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("숫자를 입력해주세요.");
                continue;
            }

            switch (choice) {
                case 1:
                    market.getMmenu();
                    break;

                case 2:
                    System.out.print("추가할 제품 이름: ");
                    String itemName = sc.nextLine().trim();

                    System.out.print("가격: ");
                    int price = 0;
                    try {
                        price = Integer.parseInt(sc.nextLine());
                    } catch (Exception e) {
                        System.out.println("숫자를 정확히 입력해주세요.");
                        break;
                    }

                    if (market.marketList.contains(itemName)) {
                        System.out.println("이미 존재하는 제품입니다.");
                        break;
                    }

                    market.marketList.add(itemName);
                    market.marketPrice.add(price);
                    market.menu.put(itemName, price);

                    System.out.println(itemName + " 제품이 추가되었습니다.");
                    break;

                case 3:
                    System.out.print("삭제할 제품 이름: ");
                    String removeName = sc.nextLine().trim();

                    if (market.marketList.contains(removeName)) {
                        int index = market.marketList.indexOf(removeName);
                        market.marketList.remove(index);
                        market.marketPrice.remove(index);
                        market.menu.remove(removeName);

                        System.out.println(removeName + " 제품이 삭제되었습니다.");
                    } else {
                        System.out.println("해당 제품이 없습니다.");
                    }
                    break;

                case 4:
                    System.out.print("가격을 수정할 제품 이름: ");
                    String updateName = sc.nextLine().trim();

                    if (!market.marketList.contains(updateName)) {
                        System.out.println("해당 제품이 없습니다.");
                        break;
                    }

                    System.out.print("새로운 가격: ");
                    int newPrice = 0;
                    try {
                        newPrice = Integer.parseInt(sc.nextLine());
                    } catch (Exception e) {
                        System.out.println("숫자를 정확히 입력해주세요.");
                        break;
                    }

                    int idx = market.marketList.indexOf(updateName);
                    market.marketPrice.set(idx, newPrice);
                    market.menu.put(updateName, newPrice);

                    System.out.println(updateName + "의 가격이 " + newPrice + "원으로 변경되었습니다.");
                    break;

                case 5:
                    System.out.println(">> 주문 기능은 아직 준비 중입니다.");
                    break;

                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default:
                    System.out.println("1~6 중에 선택해주세요.");
            }
        }
    }
}
