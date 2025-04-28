#include <stdio.h>

int main() {
    int num;
    int sum = 0;
    printf("양의 정수를 입력하세요");
    scanf("%d", &num);

    if (num < 0) {
        printf("양의 정수를 입력해야 합니다\n");
        return 1;
    }
    while (num > 0) {
        sum = sum + (num % 10);
        num = num / 10;
    }
    printf("자릿수 합 : %d\n", sum);

    return 0;
}