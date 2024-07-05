#include<stdio.h>

void main()
{
    const float pie=3.14;
    float r,A;
    printf("Enter Value Of Radius:");
    scanf("%f",&r);
    A=pie*r*r;
    printf("Area is %f",A);
}