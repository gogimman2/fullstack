package a0326.Interface1;

interface Flyable{
    void fly();
}
interface Swimable{
    void swim();
}
// 여러개의 인터페이스를 구현한 클래스
class Bird implements Flyable, Swimable{
    @Override
    public void fly() {
        System.out.println("새가 날아갑니다.");
    }

    @Override
    public void swim() {
        System.out.println("새가 물에서 해엄칩니다.");
    }
}

public class MultiInterfaceEx {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        bird.swim();
    }
}
