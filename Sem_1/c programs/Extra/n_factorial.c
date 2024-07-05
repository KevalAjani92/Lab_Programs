#include<stdio.h>

void factorial(int n){
    int i,prod=1;
    for(i=1;i<=n;i++){
        prod=prod*i;
    }
    printf("Factorial Of %d = %d\n",n,prod);
}
void main(){
    int i,n;
    printf("Enter Nth Number:");
    scanf("%d",&n);

    for(i=1;i<=n;i++){
        factorial(i);
    }
}