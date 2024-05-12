#include <stdio.h>

void main()
{
    int number;
    clrscr();

    printf("Enter the number : ");
    scanf("%d", &number);
    if(number % 2 == 0)
	printf("%d is even number\n", number);
    else
	printf("%d is odd number\n", number);

    getch();
}
