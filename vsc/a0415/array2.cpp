#include <stdio.h>

int main() {
    int a;
    int result;

    printf("정수를 입력하시요 : ");
    scanf("%d", &a);
    for (int i = a; i >= 1; i--)
    {
        result = a * i;
    }
    printf("%d", result);

    return 0;
}