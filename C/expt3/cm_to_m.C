#include <stdio.h>

void main()
{
    float number_in_cm, temp, cm = 100.0;
    clrscr();
    printf("Enter the number in cm : ");
    scanf("%f", &number_in_cm);

    temp = (number_in_cm/cm);
    printf("%fcm in meters is %fm \n", number_in_cm, temp);
    getch();
}