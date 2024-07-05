#include<stdio.h>
int power(int a,int b){
    if(b==0) return 1;
    int x=power(a,b/2);
    if (b%2==0)
    {
        return x*x;
    }
    else
    {
        return x*x*a;
    }
    
}

void main(){
    int a,b,ans;
    printf("Enter base:");
    scanf("%d",&a);
    printf("Enter power:");
    scanf("%d",&b);
    ans=power(a,b);
    printf("%d",ans);
}