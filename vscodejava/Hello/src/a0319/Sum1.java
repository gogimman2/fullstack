public class Sum1 {
    public static void main(String[] args) {
        int sum = 0;
        float average =0f;
        int[] score = {100, 88, 100, 100, 90};
        // sum 과 average를 구하시오

        for(int i = 0; i < score.length;i++){
            sum = sum + score[i];
        }
        average = sum / (float)score.length;

        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + average);
    }
}
