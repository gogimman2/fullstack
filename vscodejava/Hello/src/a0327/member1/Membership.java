package a0327.member1;

import java.util.Scanner;

public class Membership {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberMager memberMager = new MemberMager(); 
        while (true) {
            System.out.println("\n===== 회원 관리 프로그램 =====");
            System.out.println("1. 회원 추가");
            System.out.println("2. 회원 검색");
            System.out.println("3. 회원 수정");
            System.out.println("4. 회원 삭제");
            System.out.println("5. 전체 회원 목록 보기");
            System.out.println("6. 종료");
            System.out.print("메뉴를 선택하세요 : ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기
            switch (choice) {
                case 1:
                    // 이름, 나이, 이메일을 입력받아 회원을 추가하는 addMember() 매서드 만들기
                    System.out.print("이름을 입력하세요: ");
                    String name = scanner.nextLine();
                    System.out.print("나이를 입력하세요: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // 버퍼 비우기
                    System.out.print("이메일을 입력하세요: ");
                    String email = scanner.nextLine();
                    Member newMember = new Member(name, age, email);
                    memberMager.addMember(newMember);
                    break;
                case 2:
                    System.out.println("검색할 회원의 이름을 입력하시오 : ");
                    String searchName = scanner.nextLine();
                    Member foundMember = memberMager.findMember(searchName);
                    if (foundMember != null) {
                        System.out.println("회원정보 : " + foundMember);
                    }
                    else{
                        System.out.println("해당이름의 회원없음");
                    }
                    break;
                case 3:
                    System.out.print("수정할 이름을 입력하세요: ");
                    String updateName = scanner.nextLine();
                    System.out.print("새로운 나이를 입력하세요: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine(); // 버퍼 비우기
                    System.out.print("새로운 이메일을 입력하세요: ");
                    String newEmail = scanner.nextLine();
                    memberMager.updateMember(updateName, newAge, newEmail);
                    System.out.println("회원정보가 수정되었습니다.");
                    break;
                case 4:
                    System.out.print("삭제할 이름을 입력하세요: ");
                    String deleteName = scanner.nextLine();
                    memberMager.deleteMember(deleteName);
                    System.out.println("회원정보가 삭제되었습니다.");
                    break;
                case 5:
                    // 회원목록을 출력하는
                    // displayAllMembers()매서드만들기
                    memberMager.displayAllMembers();
                    break;
                case 6:
                    System.out.println("프로그램 종료");
                    scanner.close();
                    System.exit(0);
                default:
                System.out.println("잘못된 선택입니다.");
                    break;
            }
        }
    }   
}
