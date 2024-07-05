#include<stdio.h>

void main(){
    int a,b,c;
    printf("Enter First Number:");
    scanf("%d",&a);
    printf("Enter Second Number:");
    scanf("%d",&b);
    printf("Enter Third Number:");
    scanf("%d",&c);

    (a>b)?
        ((a>c)?printf("Largest Number=%d",a):printf("Largest Number=%d",c))
                :((b>c)?printf("Largest Number=%d",b):printf("Largest Number=%d",c));
}