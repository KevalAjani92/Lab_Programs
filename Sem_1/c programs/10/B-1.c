#include<stdio.h>

void main(){
    int i=1,n,sum=0;
    printf("Emter a Number:");
    scanf("%d",&n);

    while (i<n)
    {
        if (n%i==0)
        {
            sum=sum+i;
        }
        i++;
    }
    if (sum==n)
    {
        printf("Entered Number Is a Perfect Number");
    }
    else
    {
        printf("Entered Number Is Not a Perfect Number");
    }
}