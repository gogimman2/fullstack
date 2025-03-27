package a0327.접근제어자;

class DefaultClass{
    void display(){  // default 앞에 아무것고 안 붙이면 접근제어자 default
        System.out.println("패키지(폴더) 내부에서만 접근 가능");
    }
}

public class Default {
    public static void main(String[] args) {
        DefaultClass  obj = new DefaultClass();
        obj.display();  // 정상 실행 (같은 패키지)
    }
}
