package a0318;
public class P2 {
    public static void main(String[] args) {
        System.out.println(evenOrOdd(4));
        System.out.println(evenOrOdd(7));
    }

    public static String evenOrOdd(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }
}
