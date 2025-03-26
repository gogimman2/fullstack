package a0326.Interface1;

interface Greeting{
    void sayHello();

    // java 8 이상부터 사용가능한 default 매서드
    default void sayGoodbye(){
        System.out.println("안녕히 가세요");
    }
}
class Person implements Greeting{

    @Override
    public void sayHello() {
        System.out.println("안녕하세요");
    }

}

public class DefaultMethodEx {
    public static void main(String[] args) {
        Person person = new Person();
        person.sayHello();
        person.sayGoodbye();

        if (person1 instanceof Person) {
            ((Person)person1)
        }
    }
}
