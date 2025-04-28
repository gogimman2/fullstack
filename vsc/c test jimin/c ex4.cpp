#include <stdio.h>

int main() {
    int arr[5];
    printf("5개의 정수를 입력해주세요 : ");
    for (int i = 0; i < 5; i++){
        scanf("%d", &arr[i]);
    }

    int max;
    max = arr[0];
    printf("%d", max);
    for (int i = 0; i < 5; i++){
        if (arr[i] > max){
            max = arr[i];
        }
    }
    printf("%d", max);

    return 0;
}