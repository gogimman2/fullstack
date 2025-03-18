package a0318;

public class Ex3 {
    public static void main(String[] args) {
        // 연비 = 이동거리 / 사용량
        // 휘발유 8.86리터(L)를 충전한 자동차의 총 주행거리가 182.736km일 때, 해당 자동차의 연비를
        // 계산하는 프로그램을 작성하시오. 단, 연비 계산 과정은 메소드의 호출과 정의를 통해 구한다.
        // 가솔린의 사용량
        double g = 8.86;
        // 이동거리
        double d = 182.736;
        // 연비 계산
        double eff = calc(g, d);
        System.out.printf("연비 : %.2f km/L", eff);
    }

    private static double calc(double g, double d) {
        return d / g;
    }
}
// calc - 메소드 이름
// double g, double d - 매게변수, 입력변수, 피리미터
// retuen d / g : 반환값
// 반환타입
