package a0320;

public class Class1 {
    public static void main(String[] args) {
        // 객체
        Cat c = new Cat();  // Cat이라는 객체를 생성
        
        // Cat.claw();
        // Cat.name = "네로";
        c.name = "네로";
        c.breeds = "페르시안";
        c.weight = 4.37;

        // 객체상태(필드) 출력
        System.out.printf("이름 %s\n", c.name);  // '.' 닷연산자 - 객체를 접근하기 위한 연산자
        System.out.printf("품종 %s\n", c.breeds);
        System.out.printf("체중 %skg\n", c.weight);
    }
}

class Cat{
    String name;  // 이름 - 인스턴스변수
    String breeds;  // 품종
    double weight;  // 체중

    static void claw(){
        System.out.println("할퀴기");
    }
    void meow(){
        System.out.println("야옹");
    }
}