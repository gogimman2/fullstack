package a0326.Interface1;

interface Animal{
    void makeSound();
    // 일반메서드 사용불가
}

class Dog implements Animal{}
class Cat implements Animal{}

public class InterfaceExample {
    public static void main(String[] args) {
        // 인터페이스는 추상클래스와 마찬가지로 자신을 객체로 만들수 없다.
        Animal dog = new Dog();
        Animal cat = new Cat();
    }
}
