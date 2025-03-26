package a0326.grade;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeManager {
   private static ArrayList<Student> students = new ArrayList<>();
   private static Scanner scanner = new Scanner(System.in);
   private static int idCounter = 1;

    public static void main(String[] args) {
        while(true){
            System.out.println("\n=== 성적 관리 프로그램 ===");
            System.out.println("1. 성적 추가");
            System.out.println("2. 성적 조회");
            System.out.println("3. 성적 수정");
            System.out.println("4. 성적 삭제");
            System.out.println("5. 종료");
            System.out.print("선택: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); //개행문자처리

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("프로그램 종료");
                    return;
                default:
                System.out.println("잘못된 입력입니다. 다시 선택하세요");
                    break;
            }
        }
    }
    
    private static void deleteStudent() {
        System.out.println("삭제할 학생 ID 입력 : ");
        int id = scanner.nextInt();
        scanner.nextInt();

        for(Student student : students){  // students 리스트를 순회하며
            if (student.getId() == id) {
                students.remove(student);
                System.out.println("성적이 삭제되었습니다.");
                return;  // return 써주지 않으면 학생을 찾아 수정후에도 끝까지 루프를 실행
            }
        }
        System.out.println("성적이 삭제되었습니다.");
    }

    private static void updateStudent() {
        System.out.println("수정할 학생 ID 입력 : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for(Student student : students){  // students 리스트를 순회하며
            if (student.getId() == id) {
                System.out.println("새로운 점수 입력 : ");
                int newScore = scanner.nextInt();
                scanner.nextLine();

                student.setScore(newScore);
                System.out.println("성적이 수정되었습니다.");
                return;  // return 써주지 않으면 학생을 찾아 수정후에도 끝까지 루프를 실행
            }
        }
        System.out.println("해당 ID의 학생을 찾을수가 없습니다.");
    }

    private static void viewStudent() {
        if (students.isEmpty()) {  // 학생이 없으면(ArrayList가 비어있으면)
            System.out.println("등록된 성적이 없습니다.");
        }
        else{
            System.out.println("\n-------성적목록-------");
            for(Student s : students){
                s.display();  // 직접만든 출력 메서드를 사용
                // System.out.println(s.toString());  // toString을 이용
            }
        }
    }

    //성적추가                
    private static void addStudent() {
        System.out.print("학생 이름:");
        String name = scanner.nextLine();
        System.out.print("점수 입력: ");
        int score = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리
        
        //차선책
        // Student student = new Student();
        // student.setId(idCounter++);
        // student.setName(name);
        // student.setScore(score);

        Student student = new Student(idCounter++, name, score);
        students.add(student);
        System.out.println("성적이 추가되었습니다.");
    }
}
