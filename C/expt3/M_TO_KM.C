#include <stdio.h>

void main()
{
    float number_in_m, temp, m = 1000.0;
    clrscr();
    printf("Enter the number in meters : ");
    scanf("%f", &number_in_m);

    temp = (number_in_m/m);
    printf("%fm in km is %fkm \n", number_in_m, temp);
    getch();
}