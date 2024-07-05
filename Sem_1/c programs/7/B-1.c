#include<stdio.h>

void main(){
    int a,b,c,x;
    printf("Enter First Number:");
    scanf("%d",&a);
    printf("Enter Second Number:");
    scanf("%d",&b);
    printf("Enter Third Number:");
    scanf("%d",&c);

    x=(a>b);
    switch (x)
    {
    case 1:
        printf("%d",a*c);
        break;
    case 0:
        printf("%d",b*c);
        break;

    default:printf("Invalid Input");
        break;
    }
}