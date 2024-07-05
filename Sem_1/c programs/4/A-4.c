#include<stdio.h>

void main()
{
    int a,b,c;
    float I;
    printf("Enter First Value:");
    scanf("%d",&a);
    printf("Enter Second Value:");
    scanf("%d",&b);
    printf("Enter Third Value:");
    scanf("%d",&c);
    I=(float)(a+b+c)/3.0;
    printf("Average is %f",I);
}