#include<stdio.h>

void main(){
    int n,r,sum=0;
    printf("Enter Number:");
    scanf("%d",&n);

    while (n!=0)
    {
        r=n%10;
        sum=sum*10+r;
        n=n/10;
    }
    printf("%d",sum);
}