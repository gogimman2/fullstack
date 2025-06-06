package a0331.sort.hak3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        // 학생 수 입력
        System.out.print("학생 수를 입력하세요: ");
        int n = sc.nextInt();
        sc.nextLine(); // 개행 문자 소비

        // 학생 배열 생성
        // Student[] students = new Student[n];

        // 학생 정보 입력
        for (int i = 0; i < n; i++) {
            System.out.print("학생 이름: ");
            String name = sc.nextLine();
            System.out.print("학생 나이: ");
            int age = sc.nextInt();
            System.out.print("학생 학번: ");
            int studentId = sc.nextInt();
            sc.nextLine(); // 개행 문자 소비

            //students[i] = new Student(name, age, studentId);
            students.add(new Student(name, age, studentId));
        }

        // 삽입 정렬 실행
        Collections.sort(students);

        // 정렬된 결과 출력
        System.out.println("정렬된 학생 목록:");
        for (Student student : students) {
            System.out.println(student);
        }

        sc.close(); // Scanner 닫기
    }
}

// 학생 클래스 정의
class Student implements Comparable<Student>{
    // Student 클래스가 Compareable<Student> 구현
    private String name;
    private int age;
    private int studentId;

    // 생성자
    public Student(String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    // Getter 메서드
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", studentId=" + studentId + "]";
    }

    @Override
    public int compareTo(Student o) {
        // 나이, 아이디를 기준으로 정렬하려면 int 사용못함
        // 숫자비교일경우 참조변수로 변경해야함
        return Integer.compare(this.age, o.age);
    }

//     @Override
//     public int compareTo(Student o) {
//         return this.name.compareTo(o.name);
//     }
}