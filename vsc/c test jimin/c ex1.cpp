#include <stdio.h>

int main() {
    int a, b;

    printf("두개의 정수를 입력해 주세요 : ");
    scanf("%d", &a);
    scanf("%d", &b);

    printf("%d + %d = %d\n", a, b, a + b);
    printf("%d - %d = %d\n", a, b, a - b);
    printf("%d * %d = %d\n", a, b, a * b);
    printf("%d / %d = %d\n", a, b, a / b);
    printf("%d", a, "%d = %f\n", b, a % b);

    return 0;
}