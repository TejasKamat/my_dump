#include <stdio.h>

void main() {
	float a = 2, b = 3;
	float *ptra;
	float *ptrb;
	clrscr();
	ptra = &a;
	ptrb = &b;
	printf("value of a=%d\n", a);
	printf("addres of a=%u\n", &a);
	
	// printf("value of a=%d\n", *(&a));
	// printf("Address of a=%u\n", ptra);
	// printf("Value of a=%d", *ptra);

	printf("value of b=%d\n", *(&b));
	printf("Address of b=%u\n", ptrb);
	printf("Value of b=%d", *ptrb);
	getch();
}