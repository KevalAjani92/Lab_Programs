#include<stdio.h>

void main(){
    int n,r,h,sum=0;
    printf("Enter Number:");
    scanf("%d",&n);
    h=n;
    while (n!=0)
    {
        r=n%10;
        sum=sum*10+r;
        n=n/10;
    }
    if (sum==h)
    {
        printf("Entered Numbers Is a Palindrome Number");
    }
    else
    {
        printf("Entered Numbers Is Not a Palindrome Number");
    }
    
}