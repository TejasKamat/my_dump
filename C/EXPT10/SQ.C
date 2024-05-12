#include <stdio.h>

void sq(int *);

void main() {
	int side;
	clrscr();
	printf("Enter the side : ");
	scanf("%d", &side);
	sq(&side);
	printf("The area of square = [%d]", side);

	getch();
}
void sq(int *side) {
	*side *= *side;
}