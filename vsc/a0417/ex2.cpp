#include <stdio.h>

int main() {
    int arr[10] = {5, 12, 8, 3, 15, 7, 9, 20, 1, 18};
    int avg = (arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5] + arr[6] + arr[7] + arr[8] + arr[9]) / 10;
    printf("평균 : %d\n", avg);
    int max = arr[0];
    for (int i = 0; i < 10; i++){
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    printf("최대값 : %d\n", max);

    int min = arr[0];
    for (int j = 0; j < 10; j++){
        if (arr[j] < min) {
            min = arr[j];
        }
    }
    printf("최소값 : %d\n", min);

    return 0;
}