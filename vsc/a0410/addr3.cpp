#include<stdio.h>

int main(){
    int myage = 43;
    int *ptr = &myage;

    printf("%d\n", myage);
    printf("%p\n", &myage);
    printf("%p\n" *ptr);
    printf("%p\n", ptr);

    return 0;
}