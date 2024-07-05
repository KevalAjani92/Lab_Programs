#include<stdio.h>

void main()
{
    int a;
    printf("Enter Your Integer:");
    scanf("%d",&a);
    if ((a&1)==1)
    {
        printf("Last Digit Of Integer Is Odd");
    }
    else printf("Last Digit Of Integer Is Even");
}