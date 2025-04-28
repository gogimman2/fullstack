#include <stdio.h>

int main(){
    int age[] = {20, 22, 18, 35, 48, 26, 87, 70};
    float avg = 0, sum = 0;
    int i;
    int length = sizeof(age) / sizeof(age[0]);

    int min = 100;
    for (i = 0;i < length;i++) {
        if (min > age[i]){
            min = age[i];
        }
    }

    return 0;
}