package a0321;

public class StudentTest {
    public static void main(String[] args) {
        Student park = new Student(2019122104,"park");
        Student kim = new Student(2019112043,"kim");
        Student lee = new Student(2019152371,"lee");
        System.out.printf("Student 객체의 수: %d",Student.count);
    }
}
class Student{
    //클래스 변수
    static int count = 0;

    //인스턴스 변수
    int id;
    String name;
    //생성자
    Student(int i, String n){
        Student.count++; //클래스변수에 객체가 생성된때마다 1씩증가
        id = i;
        name = n;
    }

}