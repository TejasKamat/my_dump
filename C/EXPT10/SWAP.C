#include <stdio.h>

void swap(int *, int *);

void main() {
	int a = 2, b = 3;
	int *ptra = &a, *ptrb = &b;

	clrscr();
	swap(ptra, ptrb);
	printf("The value of a=%d and b=%d\n", a, b);
}
void swap(int *a, int *b) {
	int temp;
	temp = *a;
	*a = *b;
	*a = temp;
}