#include<stdio.h>

float power(int b,int p);

void main(){
    int p,b;
    printf("Enter Base : ");
    scanf("%d",&b);
    printf("Enter Power : ");
    scanf("%d",&p);
    int i,ans = 1;
    for(i=1;i<=p;i++){
        ans*=b;
    }
    printf("Ans From Iterative : %d",ans);
    printf("\nAns From Recursive : %f",power(2,-4));
}

float power(int b,int p){
    if(p==1){
        return b;
    }
    if(p==0){
        return 1;
    }
    if(p<0){
        return 1.0/b*power(b,p+1);    
    }
    return b*power(b,p-1);
}