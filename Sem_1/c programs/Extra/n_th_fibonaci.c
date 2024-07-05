#include<stdio.h>

void main(){
    int n,a=0,b=1,sum=1;
    printf("Enter n:");
    scanf("%d",&n);
   // printf("%d %d ",a,b);
    for (int i = 1;i<=n-2; i++)
    {
       sum=a+b;
       a=b;
       b=sum;
    }
       printf("%d ",sum);

}