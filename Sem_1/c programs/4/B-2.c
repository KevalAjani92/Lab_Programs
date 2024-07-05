#include<stdio.h>

void main()
{
    float p,r,t,SI;
    printf("Enter Value Of Principle :");
    scanf("%f",&p);
    printf("Enter Value Of roi :");
    scanf("%f",&r);
    printf("Enter Value Of time period :");
    scanf("%f",&t);
    SI=(p*r*t)/100.0;
    printf("Simple Interest=%f",SI);
    
}