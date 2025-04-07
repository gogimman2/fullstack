package a0402.javamovie;

import java.util.Scanner;

public class MovieReservationMain {
    public static void main(String[] args) {
        MovieManager mm = new MovieManager();
        Scanner sc = new Scanner(System.in);
        FileD fd = new FileD();
        System.out.println(mm.mmm);
        System.out.println(" ======= JavaMovie에 오신걸 환영합니다. =======");

        Outter:while (true) {
            System.out.println("1. 영화 목록\n2. 영화 예매\n3. 예약 조회\n4. 티켓 저장\n5. 영화표 업로드\n6. 음식 예약\n0. 종료");
            System.out.print("메뉴입력 >");

            String menuStr = sc.next();
            sc.nextLine();

            int menu = -1;
            try {
                menu = Integer.parseInt(menuStr);
            } catch (NumberFormatException e) {
                menu = 9;
            }
            switch (menu) {
                case 1:
                    mm.displayMovieList("영화표목록");
                    break;
                case 2:
                    try {
                        mm.bookMovie();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    mm.checkReservation();
                    break;
                case 4:
                    mm.ticketSave();
                    break;
                case 5:
                    fd.upload();
                    break;
                case 6:
                try {
                    mm.food();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    break Outter;
                default:
                    break;
            }
        }
    }
}
