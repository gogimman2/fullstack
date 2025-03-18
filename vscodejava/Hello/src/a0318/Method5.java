package a0318;

public class Method5 {
    public static void main(String[] args) {
        Calculator2 calc2 = new Calculator2();

        int num1 = 10;
        int num2 = 5;
        
        calc2.add(num1, num2);
        System.out.println("뺄셈 : " + Calculator2.subtract(num1, num2));
        System.out.println("곱셈 : " + Calculator2.subtract(num1, num2));
        System.out.println("나눗셈 : " + Calculator2.subtract(num1, num2));
    }
}

class Calculator2 {
    // return 필요 없을때 타입(int, String, double)대신 void
    public void add(int a, int b){
        // 객체만둘경우 static을 빼도됨
        System.out.println("덧셈 : " + (a + b));
    }

    public static int subtract(int a, int b){
        // 모든 메서드는 static으로 선언하여 객체 생성없이 호출가능
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static double divide(int a, int b){
        if (b ==0) {
            throw new ArithmeticException("0으로 나눌수 없습니다.");
        }
        return (double)a / b;
    }
}
