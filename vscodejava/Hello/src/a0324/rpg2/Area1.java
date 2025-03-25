package a0324.rpg2;

public class Area1 {
    public static void main(String[] args) {
        Square s = new Square();
        s.name = "정사각형";
        s.length =3;
        Triangle t = new Triangle();
        t.name = "삼각형";
        t.base =4;
        t.height = 3;
        Circle c = new Circle();
        c.name = "원";
        c.radius = 4;
        Shape[] shapes = {s, t, c}; //부모의 타입으로 업 캐스팅 배열생성

        for(int i = 0; i < shapes.length;i++){
            System.out.printf("%s의 넓이: %.2f\n", shapes[i].name, shapes[i].area());
        }
    }
}
// 상속 관계가 정의된 자식 객체는 부모의 타입으로 해석, 즉 업캐스팅될 수 있습니다.
// 서로다은 자식 객체를 부모의 타입으로 묶어 관리 할 수 있다.

//부모클래스
class Shape{ //도형
    String name;
    double area(){
        return 0;
    }
}
//자식클래스
class Square extends Shape {
    int length;
    double area(){
        return length * length;
    }
}
class Triangle extends Shape {
    int base; //삼각형 밑변의 길이
    int height;
    double area(){
        return base * height * 0.5;
    }
}
class Circle extends Shape {
    int radius;
    double area(){
        return Math.PI * radius * radius;
    }
}