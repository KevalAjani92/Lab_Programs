#include<stdio.h>

int sumOfN(int n);

void main(){
    int n;
    printf("Enter n:");
    scanf("%d",&n);
    int i,sum=0;
    for(i=1;i<=n;i++){
        sum+=i;
    }
    printf("Ans From Iterative : %d",sum);
    printf("\nAns From Recursive : %d",sumOfN(n));
}

int sumOfN(int n){
    if(n==1){
        return 1;
    }
    return n+sumOfN(n-1);
}