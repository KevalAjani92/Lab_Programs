#include<stdio.h>
int power(int a,int b){
    if(b==0){
        return 1;
    }
    return a*power(a,b-1);
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