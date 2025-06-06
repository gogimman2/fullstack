package a0401;

import java.util.ArrayList;
import java.util.List;

class Student{
   
    private int id;
    private String name;
    private int age;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

}

public class List3 {
    public static void main(String[] args) {
         //ArrayList 생성
        List<Student> studentList = new ArrayList<>();

        //객체추가
        studentList.add(new Student(101, "Alice", 20));
        studentList.add(new Student(102, "Bob", 22));
        studentList.add(new Student(103, "Charlie", 21));

        // ArrayList 내용 출력
        System.out.println("Student List 출력");
        printList(studentList);
        // 1번 인덱스를 가져온뒤 프린트해보세요
        Student student = studentList.get(1);
        // String name = studentList.get(1).getName(); -> 이름만 가져오는거
        System.out.println(student);
        System.out.println();

        // 모든 student 이름만 출력
        System.out.println("\n모든 학생의 이름 출력");
        studentList.stream()
                   .map(Student :: getName)  // 이름만 추출
                   .forEach(System.out :: println);

        // 데이터추가
        // 104, "David", 23
        System.out.println("\n새로운 학생 추가");
        Student ss = new Student(104, "David", 23);
        studentList.add(ss);
        // studentList.add(new Student(104, "David", 23));
        System.out.println(student);

        // 데이터 변경 102, "Robert", 25
        System.out.println("\n특정 학생 변경");
        updateStudent(studentList, 102, "Robert", 25);
        printList(studentList);

        //데이터 삭제
        System.out.println("\n특정 학생 삭제");
        deleteStudent(studentList, 103);
        printList(studentList);
        //특정 학생 검색
        System.out.println("\n 특정 학생 검색");
        Student searchedStudent = findStudentById(studentList, 104);
        System.out.println(searchedStudent != null ? searchedStudent:"학생을 찾을 수 없습니다." );
    }

    private static Student findStudentById(List<Student> studentList, int id) {
        return studentList.stream()
                          .filter(student -> student.getId() == id)
                          .findFirst()  // 학생이 여러번 있어도 첫번째 학생만 선택
                          .orElse(null);  // 학생을 찾으면 해당 학생을 반환 찾지 못 하면 null 반환
    }

    private static void deleteStudent(List<Student> studentList, int id) {
        boolean removed = studentList.removeIf(student -> student.getId() == id) ;
            System.out.println(removed ? "학생 ID" + id + "정보가 삭제되었습니다." :  "학생 ID" + id + "를 찾을수 없습니다.");
    }

    private static void updateStudent(List<Student> studentList, int id, String newName, int newAge) {
        boolean updated = studentList.stream()
                                     .filter(student -> student.getId() == id)
                                     .peek(student -> {
                                        student.setName(newName);
                                        student.setAge(newAge);
                                     })
                                     .findFirst()
                                     .isPresent();
        System.out.println(updated ? "학생 ID" + id + "정보가 수정되었습니다." :  "학생 ID" + id + "를 찾을수 없습니다.."); 
                                     
    }

    private static void printList(List<Student> studentList) {
        studentList.forEach(System.out :: println);
    }
}