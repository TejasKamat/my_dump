#include <stdio.h>

void main() {
    int n;
    printf("Select the choices !\n");
    printf("1. positive\n");
    printf("2. negative\n");
    printf("3. exit    \n");
    scanf("%d", &n);

    switch (n){
    case 1:
        printf("helllo");
        break;
    
    default:
        break;
    }
}