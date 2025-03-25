package a0320;

public class Class5_1 {
    public static void main(String[] args) {
        // person1이라는 객체를 만들고 생성자에 "홍길동" 31 넣어 출력하시오
        Person1 p1 = new Person1("홍길동", 31);
        Person1 p2 = new Person1();

        p2.name = "이순신";
        p2.age = 25;

        System.out.println("이름 : " + p1.name + ", 나이 : " + p1.age);
        System.out.println("이름 : " + p2.name + ", 나이 : " + p2.age);
    }
}

class Person1 {
    String name;
    int age;

    public Person1(){

    }

    public Person1(String n, int a) {
        n = name;
        a = age;
    }

    // 자바 프로그램이 알아서 기본생선자를 만들어 준다.
    // public Person1(){

    // }
}