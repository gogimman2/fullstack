package a0402.javamovie;

import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MovieManager {
    private static ArrayList<Movie> movies;
    private static ArrayList<Passenger> passengers;

    private static Map<String, Movie> rm = new HashMap<>();

    private static FileD fd = new FileD();
    Scanner sc = new Scanner(System.in);

    public MovieManager(){
        movies = new ArrayList<>();
        movies.add(new Movie("기생충", "09:00", 15000, true));
        movies.add(new Movie("타짜", "12:00", 15000, true));
        movies.add(new Movie("부산행", "15:00", 15000, true));
        movies.add(new Movie("어벤져스", "18:00", 15000, true));
        movies.add(new Movie("분노의질주", "21:00", 15000, true));
        passengers = new ArrayList<>();
        Movie mv = movies.get(0);
        rm.put("태스트", mv);
    }
    public String mmm = "  〓〓〓〓〓〓〓〓 JAVA MOVIE 〓〓〓〓〓〓〓〓\n" + "│                                             │\n" + "│                                             │\n" + "│                                             │\n" + "│                                             │\n" + "│                                             │\n" + "│_____________________________________________│\n";
    public void bookMovie() throws InterruptedException {
        for(;;){
            displayMovieList("영화표 예메");
            System.out.println("※환불불가※");
            System.out.print("예매할 영화표 입력 > ");
            try {
                int bookNum = Integer.parseInt(sc.next());
                if (bookNum > movies.size() || bookNum < 1) {
                    System.out.println("잘못 입력하셨습니다.");
                    continue;
                }
                System.out.println("선택한 영화표");
                System.out.println("=============================================");
                System.out.println(bookNum + "" + movies.get(bookNum-1));
                System.out.println("=============================================");
                Movie mv = movies.get(bookNum-1);
                if (movies.get(bookNum-1).getInternationalMovie()) {
                    System.out.println("15세 이상 영화는 만15세 이상 예매가능");
                    passengersInfo(mv);
                }else{
                    passengersInfo(mv);
                }
                if (passengers != null && !passengers.isEmpty()) {
                    String seatNum = Integer.toString(seatSelection(mv));
                    passengers.get(passengers.size()-1).setSeat(seatNum);
                    System.out.println("예약중입니다.");
                    Thread.sleep(2000);

                    System.out.println("===================================================================");
                    System.out.println("예약에 성공했습니다.");
                    System.out.println("[" + passengers.get(passengers.size() - 1).getName() + "] 님의 예약정보");
                    System.out.println(bookNum + "" + mv);
                    System.out.println("===================================================================");
                    System.out.println("잠시후 메인 화면으로 이동헙니다.");
                    Thread.sleep(2000);
                    rm.put(passengers.get(passengers.size() - 1).getName(), mv);
                    break;
                }
            } catch (Exception e) {
                System.out.println("잘못 입력하였습니다.");
            }
        }
    }
    private int seatSelection(Movie movie) {
        int seatNum = -1;
        while (true) {
            try {
                System.out.println("=============================================");
                movie.seatToString();
                System.out.println("좌석번호를 선택하세요");
                System.out.print("선택 >");
                int seatInt = sc.nextInt() - 1;
                sc.nextLine();
                if (seatInt + 1 < 1 || seatInt + 1 > 20) {
                    System.out.println("존재하지 않는 좌석입니다.");
                }else if (movie.getSeats().get(seatInt).equals("XX")) {
                    System.out.println("이미 예약된 좌석입니다.");
                }else{
                    movie.getSeats().set(seatInt, "XX");
                    System.out.println("좌석 선택이 완료되었습니다.");
                    seatNum = seatInt;
                    break;
                }
            } catch (Exception e) {
                System.out.println("잘못 입력하였습니다.");
                sc.nextLine();
            }
        }
        return seatNum;
    }
    private void passengersInfo(Movie movie) {
        System.out.println("예매자 정보를 입력하시오");
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("나이 : ");
        try {
            int birthDate = Integer.parseInt(sc.next());
            Passenger p = new Passenger(name, birthDate);
            if (birthDate < 15) {
                System.out.println("만 15세미만은 예약 불가능입니다.");
            }
            else{
                System.out.print("결제 비밀번호");
                String pw = sc.next();
                p = new Passenger(name, birthDate, pw);
                passengers.add(p);
            }
        } catch (DateTimeException e) {
            System.out.println("나이를 입력해 주십시오");
        }
    }
    void displayMovieList(String str) {
        System.out.println("========================= " + str + " =========================");
        int count = 1;
        for(Movie movie : movies){
            System.out.println(count + "" + movie);
            count++;
        }
        System.out.println("==============================================================");
    }
    public void checkReservation(){
        int index = search("예약확인");
        checkPassword(index);
    }
    private void checkPassword(int index) {
        for(;;){
            if (index != -1) {
                System.out.print("결제 비밀번호");
                String pw = sc.next();
                System.out.println();
                if (passengers.get(index).getPw().equals(pw)) {
                    System.out.println("비밀번호가 일치합니다.");
                    System.out.println(ticketPrint(rm, passengers.get(index).getName()));
                    break;
                }
            }
        }
    }
    String ticketPrint(Map<String, Movie> rm, String name) {
        int index = -1;
        if (passengers != null) {
            for(int i = 0;i < passengers.size();i++){
                if (passengers.get(i).getName().equals(name)) {
                    index = i;
                }
            }
        }
        int seat = Integer.parseInt(passengers.get(index).getSeat()) + 1;
        return "ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n\n" + 
               "\t" + name + "님의 티켓정보" + 
               "| 좌석 : " + seat + "번\n" + 
               "." + rm.get(name) + "\n\n" + 
               "ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ";
    }
    private int search(String str) {
        System.out.println("============================== " + str + " ==============================");
        System.out.print("예약자 이름 : ");
        String name = sc.next();
        sc.nextLine();
        int index = -1;
        if (passengers != null) {
            for(int i = 0;i < passengers.size();i++){
                if (passengers.get(i).getName().equals(name)) {
                    index = i;
                }
            }
        }
        return index;
    }
    public void ticketSave(){
        int index = search("티켓조회");
        checkPassword(index);
        fd.ticketSaveFile(rm, passengers.get(index).getName());
    }
    public static ArrayList<Movie> getMovies() {
        return movies;
    }
    public static Map<String, Movie> getrm(){
        return rm;
    }
    public void food() throws InterruptedException {
        System.out.println("===================================================");
        System.out.println("원하시는 세트를 정해주세요");
        System.out.println("|   1. 팝콘, 콜라 세트   |\n|   2. 나초, 콜라 세트   |\n|   3. 오징어, 콜라 세트 |");
        System.out.println("===================================================");
        int num = sc.nextInt();
        sc.nextLine();
        if (num == 1) {
            System.out.println("팝콘, 콜라 세트(10000원)");
            System.out.println("결제를 진행하시겠습니까?");
            System.out.println("예(y) / 아니오(n)");
            String yesno = sc.nextLine();
            if (yesno.equals("예") || yesno.equalsIgnoreCase("y")) {
                System.out.println("결제가 진행중입니다.");
                Thread.sleep(2000);
                System.out.println("결제가 완료되었습니다.");
                Thread.sleep(1000);
                System.out.println("잠시후 메인화면으로 넘어갑니다.");
                Thread.sleep(2000);
            }   else if(yesno.equals("아니오") || yesno.equalsIgnoreCase("y")){
                System.out.println("주문을 취소합니다.");
                Thread.sleep(1000);
                System.out.println("잠시후 메인화면으로 넘어갑니다.");
                Thread.sleep(2000);
            }
        }else if (num ==2) {
            System.out.println("나초, 콜라 세트(11000원)");
            System.out.println("결제를 진행하시겠습니까?");
            System.out.println("예(y) / 아니오(n)");
            String yesno1 = sc.nextLine();
            if (yesno1.equals("예") || yesno1.equalsIgnoreCase("y")) {
                System.out.println("결제가 진행중입니다.");
                Thread.sleep(2000);
                System.out.println("결제가 완료되었습니다.");
                Thread.sleep(1000);
                System.out.println("잠시후 메인화면으로 넘어갑니다.");
                Thread.sleep(2000);
            }   else if(yesno1.equals("아니오") || yesno1.equalsIgnoreCase("y")){
                System.out.println("주문을 취소합니다.");
                Thread.sleep(1000);
                System.out.println("잠시후 메인화면으로 넘어갑니다.");
                Thread.sleep(2000);
            }
        }else if (num == 3) {
            System.out.println("오징어, 콜라 세트(12000원)");
            System.out.println("결제를 진행하시겠습니까?");
            System.out.println("예(y) / 아니오(n)");
            String yesno2 = sc.nextLine();
            if (yesno2.equals("예") || yesno2.equalsIgnoreCase("y")) {
                System.out.println("결제가 진행중입니다.");
                Thread.sleep(2000);
                System.out.println("결제가 완료되었습니다.");
                Thread.sleep(1000);
                System.out.println("잠시후 메인화면으로 넘어갑니다.");
                Thread.sleep(2000);
            }   else if(yesno2.equals("아니오") || yesno2.equalsIgnoreCase("y")){
                System.out.println("주문을 취소합니다.");
                Thread.sleep(1000);
                System.out.println("잠시후 메인화면으로 넘어갑니다.");
                Thread.sleep(2000);
            }
        }else{
            System.out.println("잘못 입력하셨습니다.");
        }
     }
}