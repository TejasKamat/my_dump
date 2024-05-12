#include <stdio.h>

void main() {
    int array[10];

    for(int i = 0; i < 10; i++) {
        printf("Enter the element of array : ");
        scanf("%d", &array[i]);
    }

    for(int i = 0; i < 10; i++) {
        printf("Elements of an array is %d\n", array[i]);
    }
}