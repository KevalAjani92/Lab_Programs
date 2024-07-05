#include<stdio.h>
void main(){
    int i,j,n;
    printf("Enter a Number:");
    scanf("%d",&n);
    int nsp=1,nst=n-1;

    for(i=1;i<=2*n-1;i++){
        printf("*");
    }
    printf("\n");
    for(i=1;i<=n-1;i++){
       for(j=1;j<=nst;j++){
        printf("*");
       }
       for(j=1;j<=nsp;j++){
        printf(" ");
       }
        for(j=1;j<=nst;j++){
        printf("*");
       }
       nsp+=2;
       nst--;
        printf("\n");
    }
}