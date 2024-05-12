#include <stdio.h>

struct student {
    int age;
    char name[20];
};

void main() {
    int n;

    printf("Enter the number of students : ");
    scanf("%d", &n);

    struct student students[n];

    printf("\t\nGET READY TO ENTER THE INFORMATION ! \n");
    for(int i = 0; n > i; i++) {
        printf("Enter the data of %d student\n", i+1);
        
        printf("\nEnter the name of student : ");
        scanf("%s", &students[i].name);

        printf("Enter the age of student : ");
        scanf("%d", &students[i].age);
    }
    printf("\t \nGET READY TO PRINT THE INFORMATION ! \n");
    for(int i = 0; n > i; i++) {
        printf("The data of %d student\n", i+1);

        printf("The name of student is %s\n", students[i].name);
        printf("The age of student is %d\n", students[i].age);
    }
}