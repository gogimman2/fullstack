package a0321.book;

import java.util.Scanner;

public class BookManagementSystem {

    private static Book[] bookArray = new Book[100]; // 최대 100개의 책을 저장할 배열
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        while(run) {
            System.out.println("-------------------------------------------------");
            System.out.println("1. 책 추가 | 2. 책 목록 조회 | 3. 책 대출 | 4. 책 반납 | 5. 종료");
            System.out.println("-------------------------------------------------");
            System.out.print("선택> ");
            int selectNo = Integer.parseInt(scanner.nextLine()); // 사용자 입력을 받음

            if(selectNo == 1) {
                addBook();
            } else if(selectNo == 2) {
                listBooks();
            } else if(selectNo == 3) {
                borrowBook();
            } else if(selectNo == 4) {
                returnBook();
            } else if(selectNo == 5) {
                run = false; // 종료 선택 시 프로그램 종료
            }
        }
        System.out.println("프로그램 종료.");
    }

    // 책 추가
    private static void addBook() {
        System.out.println("------------");
        System.out.println("책 추가");
        System.out.println("------------");
        System.out.print("책 제목: ");
        String title = scanner.nextLine();
        System.out.print("저자: ");
        String author = scanner.nextLine();
        String status = "대출 가능"; // 책을 추가할 때는 기본적으로 대출 가능 상태로 설정

        Book newBook = new Book(title, author, status);

        for(int i = 0; i < bookArray.length; i++) {
            if(bookArray[i] == null) { // 비어있는 자리에 새 책 추가
                bookArray[i] = newBook;
                System.out.println("책이 추가되었습니다!");
                break;
            }
        }
    }

    // 책 목록 조회
    private static void listBooks() {
        System.out.println("------------");
        System.out.println("책 목록 조회");
        System.out.println("------------");
        for(int i = 0; i < bookArray.length; i++) {
            if(bookArray[i] != null) { // 책이 존재하는 경우
                Book book = bookArray[i];
                System.out.println("책 제목: " + book.getTitle() + " | " +
                                   "저자: " + book.getAuthor() + " | " +
                                   "상태: " + book.getStatus());
            }
        }
    }

    // 책 대출
    private static void borrowBook() {
        System.out.println("------------");
        System.out.println("책 대출");
        System.out.println("------------");
        System.out.print("대출할 책 제목: ");
        String title = scanner.nextLine();

        Book book = findBook(title); // 책 찾기
        if(book != null) {
            if(book.getStatus().equals("대출 가능")) {
                book.setStatus("대출 중");
                System.out.println("책을 대출했습니다!");
            } else {
                System.out.println("이 책은 이미 대출 중입니다.");
            }
        } else {
            System.out.println("책을 찾을 수 없습니다.");
        }
    }

    // 책 반납
    private static void returnBook() {
        System.out.println("------------");
        System.out.println("책 반납");
        System.out.println("------------");
        System.out.print("반납할 책 제목: ");
        String title = scanner.nextLine();

        Book book = findBook(title); // 책 찾기
        if(book != null) {
            if(book.getStatus().equals("대출 중")) {
                book.setStatus("대출 가능");
                System.out.println("책을 반납했습니다!");
            } else {
                System.out.println("이 책은 대출 중이 아니므로 반납할 수 없습니다.");
            }
        } else {
            System.out.println("책을 찾을 수 없습니다.");
        }
    }

    // 책 제목으로 책 찾기
    private static Book findBook(String title) {
        for(int i = 0; i < bookArray.length; i++) {
            if(bookArray[i] != null && bookArray[i].getTitle().equals(title)) {
                return bookArray[i];
            }
        }
        return null; // 책이 없으면 null 반환
    }
}

// Book 클래스
class Book {
    private String title; // 책 제목
    private String author; // 책 저자
    private String status; // 책 상태 (대출 가능, 대출 중)

    public Book(String title, String author, String status) {
        this.title = title;
        this.author = author;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}