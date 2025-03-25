package a0325;

abstract class Vehicle{
    String name;

    public Vehicle(String name){
        this.name = name;
    }

    abstract void move();

    void displayInfo(){
        System.out.println("이 차량은 " + name + " 입니다.");
    };
}

class Car extends Vehicle{

    public Car(String name) {
            super(name);
        }
    
    @Override
    void move() {
        System.out.println("자동차 " + name + "이(가) 도로를 달립니다.");
    }
}

class Bicycle extends Vehicle{

    public Bicycle(String name) {
            super(name);
        }
    
    @Override
    void move() {
        System.out.println("자전거 " + name + "이(가) 패달을 밟으며 이동합니다.");
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Vehicle car = new Car("차");
        car.move();
        car.displayInfo();

        Vehicle bicycle = new Bicycle("자전거");
        bicycle.move();
        bicycle.displayInfo();
    }
}
