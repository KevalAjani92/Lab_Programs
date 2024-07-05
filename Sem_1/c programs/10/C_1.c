#include<stdio.h>

void main(){
    int n,i,nd=0,cpn,rem,temp=1,sum=0;
    printf("Enter n:");
    scanf("%d",&n);
    cpn=n;
    while (n!=0)
    {
        n=n/10;
        nd=nd+1;
    }
    n=cpn;
    while (n!=0)
    {
        rem=n%10;
        temp=1;
        for (i = 1; i <=nd; i++)
        {
            temp=temp*rem;
        }
        n=n/10;
        sum=sum+temp;
    }
    if (sum==cpn)
    {
        printf("Arm");
    }
    else
    {
        printf("Not Arm");
    }
    
    
}