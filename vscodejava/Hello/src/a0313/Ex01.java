package a0313;

public class Ex01 {
    public static void main(String[] args) {
        // 세자리 정수의 각 자릿수 총합을 출력하려 한다.
        // num = 374
        // 정수 374의 각 자릿수의 총합 : 14
        // 힌트1. 3 + 7 + 4 = 14
        // 힌트2. 는 %나머지와 / 나누기를 적절히 이용
        // 힌트3. 100으로 나누고 10으로 나누고 나머지 이용
        int num = 789;
        int result1 = num / 100;
        System.out.println("100의 자릿수는 " + result1);
        int result2 = num % 100 / 10;
        System.out.println("10의 자릿수는 " + result2);
        int result3 = num % 100 % 10;
        System.out.println("1의 자릿수는 " + result3);
        int result4 = result1 + result2 + result3;
        System.out.printf("정수 %d의 각 자릿수의 총합 %d: ", num, result4);
    }
}
