#include<stdio.h>
void main(){
    int i,j,n;
    printf("Enter an Odd Number:");
    scanf("%d",&n);
    int nsp=n/2,nst=1;

    for(i=1;i<=n;i++){
        for(j=1;j<=nsp;j++){
            printf(" ");
        }
        for(j=1;j<=nst;j++){
            printf("*");
        }
        if(i<(n/2)+1){
                nsp--;
                nst+=2;
            }else{
                nsp++;
                nst-=2;
            }
        printf("\n");
    }
}