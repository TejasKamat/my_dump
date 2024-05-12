#include <stdio.h>

void main() {
    int i, fact = 1, n = 1;

    printf("Enter the number of which you want to get factorial");
    scanf("%d", &i);

    // for(int n = 1; n <= i; i--) {
    //     fact = fact *i;
    // }

    while(i >= n) {
        fact = fact * n;
        n++;
    }
    printf("Factorial is %d", fact);
}
