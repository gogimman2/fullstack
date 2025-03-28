package a0328.HW;

import java.util.ArrayList;
import java.util.Scanner;

public class Book2 {
    private ArrayList<Book> slist;
    Scanner scanner = new Scanner(System.in);

    public Book2(){
        slist = new ArrayList<Book>();
        Book b1 = new Book(0, "자바의 정석", "남궁성", "12345", 32000);
        Book b2 = new Book(1, "Effective Java", "Joshua Bloch", "54321", 45000);
        Book b3 = new Book(2, "Effective Java", "Joshua Bloch", "54321", 45000);
        Book b4 = new Book(3, "스프링 부트와 AWS", "이동욱", "98765", 28000);
        Book b5 = new Book(4, "코틀린 인 액션", "Dmitry Jemerov", "13579", 40000);
        slist.add(b1);
        slist.add(b2);
        slist.add(b3);
        slist.add(b4);
        slist.add(b5);
    }

    public void badd() {
        Book b = new Book();
        b.setId(slist.size());
        System.out.println("<도서추가>");
        System.out.print("제목 : ");
        b.setTitle(scanner.next());
        System.out.print("저자 : ");
        b.setName(scanner.next());
        System.out.print("ISBN : ");
        b.setISBN(scanner.next());
        System.out.print("가격 : ");
        b.setPrice(scanner.nextInt());
        slist.add(b);
        System.out.println("도서 추가 완료");
    }

    public void bdelete() {
        System.out.println("<도서 삭제>");
        int index = searchIndex();
        if (index == -1) {
            System.out.println("찾는 ISBN가 없습니다.");
        }
        else{
            String ISBN = slist.get(index).getISBN();
            slist.remove(index);
            System.out.println("도서 정보를 삭제했습니다.");
        }
    }

    private int searchIndex() {
        int index = -1;
        System.out.println("도서 ISBN을 입력해 주세요");
        System.out.print(">>");
        String ISBN = scanner.next();
        for(int i = 0;i < slist.size();i++){
            if (slist.get(i).getISBN().equals(ISBN)) {
                index = i;
                break;
            }
        }
        return index;
    }

	public void bsea() {
		System.out.println("<도서 검색>");
        int index = searchIndex();
        if (index == -1) {
            System.out.println("찾는 도서다 없습니다.");
        }
        else{
            Book b = select(index);
            System.out.println(b);
        }
	}

    private Book select(int index) {
        return slist.get(index);
    }

    public void bupda() {
        System.out.println("<도서 정보 수정");
        int index = searchIndex();
        if (index == -1) {
            System.out.println("찾는 도서가 없습니다.");
        }
        else{
            Book b = new Book();
            b.setTitle(slist.get(index).getTitle());
            b.setName(slist.get(index).getName());
            b.setISBN(slist.get(index).getISBN());
            b.setPrice(slist.get(index).getPrice());
            System.out.print("도서 제목 : ");
            b.setTitle(scanner.next());
            System.out.print("도서 작가 : ");
            b.setName(scanner.next());
            System.out.print("도서 ISBN : ");
            b.setISBN(scanner.next());
            System.out.print("도서 가격 : ");
            b.setPrice(scanner.nextInt());
            slist.set(index, b);
            System.out.println("도서 수정 완료");
        }
    }

    public void ball() {
        for(int i = 0;i < slist.size();i++){
            System.out.println(slist.get(i).toString());
        }
    }
}
