#include<stdio.h>

void main()
{
    float f,c;
    printf("Enter Value Of Temprature in Fahrenheit:");
    scanf("%f",&f);
    c=((f-32)*5)/9;
    printf("Temprature in Celsius:%f",c);
}