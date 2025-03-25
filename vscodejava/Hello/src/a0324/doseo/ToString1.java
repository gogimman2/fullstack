package a0324.doseo;

//모든 자바 클래스는 Object라는 클래스를 상속 한다. 보통은 생략
public class ToString1 extends Object {
    public static void main(String[] args) {
        Person person = new Person("홍길동", 25);
        System.out.println(person.toString());
        //객체 person -> person.toString()을 생략된 형태
        //toString() 은 object에서 상속 받은 메서드 , 객체의 문자열 표현 정의하는 메서드 
        //기본적으로 person객체를 접근 문자열 출력(person@4617c264-주소형태를 문자열로 인쇄)
    }
}
class Person {

    private String name;
    private int age;  

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }    

}
// 오버로딩과 오버라이딩의 차이 예제로 만들어 오시오
// this와 this() 의 차이 를 예제로 만들어 오시오