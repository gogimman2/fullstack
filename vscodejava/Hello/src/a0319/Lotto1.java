import java.util.Arrays;

public class Lotto1 {
    public static void main(String[] args) {
        int[] ball = new int[45];

        for(int i = 0;i < ball.length;i++){
            ball[i] = i + 1;
        }
        System.out.println(Arrays.toString(ball));
        var n = 0;
        var tmp = 0;
        // for(int i = 0;i < 1000;i++){
        //     n = (int)(Math.random() * 45);
        //     tmp = ball[0];
        //     ball[0] = ball[n];
        //     ball[n] = tmp;
        // }
        // System.out.println(Arrays.toString(ball));
        for(int i = 0;i < 6;i++){
            n = (int)(Math.random() * 45);
            tmp = ball[i];
            ball[i] = ball[n];
            ball[n] = tmp;
        }
        System.out.println(Arrays.toString(ball));

        for(int i = 0;i < 6;i++){
            System.out.printf("ball[%d] = %d%n", i, ball[i]);
        }
    }
}
