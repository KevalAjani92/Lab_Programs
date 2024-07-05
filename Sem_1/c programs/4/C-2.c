#include<stdio.h>

void main()
{
    int d,w,y;
    printf("Enter Days:");
    scanf("%d",&d);
    y=d/365;
    w=(d-(365*y))/7;
    d=(d-(365*y)-(w*7));
    printf("%02d year,%02d week and %02d days",y,w,d);
}