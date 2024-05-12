#include <stdio.h>

int main()
{
    int a = 10, b = 5, result;
    clrscr();
    // printf("The value of a is %d and b is %d\n", a, b);

    // printf("The value of a > b is %d \n", a > b);
    // printf("The value of a <= b is %d \n", a <= b);

    // printf("The value of a > b is %d \n", a < b);
    // printf("The value of a <= b is %d \n", a <= b);

    // printf("The value of a == b is %d \n", a == b);
    // printf("The value of a != b is %d \n", a != b);

    // logical operators
    result = (a == b) && (a < b);
    printf("(a == b) && (a < b) is %d", result);

    result = (a > b) || (a == b);
    printf("(a > b) ||  (a == b) is %d", result);

    printf("!(a == b) is %d", !(a == b));
    return 0;
}