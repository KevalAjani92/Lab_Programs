#include<stdio.h>

void main(){
    int n,r,sum=0;
    printf("Enter Number:");
    scanf("%d",&n);

    printf("Digits Of Entered Number:");
    while (n!=0)    
    {
        r=n%10;
        sum=sum*10+r;
        n=n/10;
    }
    while (sum!=0)
    {
        r=sum%10;
        printf("\n%d",r);
        sum=sum/10;

    }
    
}