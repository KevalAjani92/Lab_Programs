#include<stdio.h>

int fact(int n);

void main(){
    int n;
    printf("Enter n:");
    scanf("%d",&n);
    int i,ans=1;
    for(i=1;i<=n;i++){
        ans *= i;
    }
    printf("Ans From Iterative : %d",ans);
    printf("\nAns From Recurssion : %d",fact(n));

}
int fact(int n){
    if(n==0 || n==1){
        return 1;
    }
    return n*fact(n-1);
}