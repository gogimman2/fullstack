package a0320;

public class Class5 {
    public static void main(String[] args) {
        // person1이라는 객체를 만들고 생성자에 "홍길동" 31 넣어 출력하시오
        Person person1 = new Person("홍길동", 31);

        System.out.println("이름 : " + person1.name + ", 나이 : " + person1.age);
    }
}

class Person {
    String name;
    int age;
    public Person(String n, int a) {
        name = n;
        age = a;
    }
}