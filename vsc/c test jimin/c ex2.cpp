#include <stdio.h>

int main() {
    int a;
    printf("하나의 정수를 입력해주세요 : ");
    scanf("%d", &a);
    if (a % 2 == 0){
        printf("짝수입니다.");
    } else {
        printf("홀수입니다.");
    }

    return 0;
}