package a0328.HW;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Book2 b2 = new Book2();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== 도서 관리 시스템 =====");
            System.out.println("1. 도서 추가");
            System.out.println("2. 도서 삭제");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 수정");
            System.out.println("5. 도서 목록 보기");
            System.out.println("6. 파일로 저장");
            System.out.println("7. 파일에서 불러오기");
            System.out.println("0. 종료");
            System.out.print(">>");
            int num;

            try {
                num = scanner.nextInt();
            } catch (Exception e) {
                num = -1;
            }

            switch (num) {
                case 1:
                    b2.badd();
                    break;
                case 2:
                    b2.bdelete();
                    break;
                case 3:
                    b2.bsea();
                    break;
                case 4:
                    b2.bupda();
                    break;
                case 5:
                    b2.ball();
                    break;
                case 0:
                    System.out.println("종료합니다.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("0 ~ 7중 다시 입력해 주십시오");
                    break;
            }
        }
    }
}
