#include<stdio.h>
struct student
{
    char name[10];
    float precentage;
    int age;
};
void main(){
    struct student b[5];

    for (int i = 0; i < 5; i++)
    {
        printf("\nEnter Detail For Student %d\n",i+1);
        printf("Enter Name:");
        scanf("%s",b[i].name);
        printf("Enter Percentage:");
        scanf("%f",&b[i].precentage);
        printf("Enter Age:");
        scanf("%d",&b[i].age);
    }
    for (int i = 0; i < 5; i++)
    {
        printf("\nDetail Of Student %d\n",i+1);
        printf("Name:%s\n",b[i].name);
        printf("Percentage:%f\n",b[i].precentage);
        printf("Age:%d\n",b[i].age);
    }
    
}