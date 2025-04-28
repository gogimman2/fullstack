#include<stdio.h>

int x = 5;

void myFunction(){
    int x = 22;
    printf("%d\n", x);
}

int main(){
    myFunction();
    printf("%d", x);
    return 0;
}