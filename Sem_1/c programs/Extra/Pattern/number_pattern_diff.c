#include<stdio.h>
void main(){
    int i,j,n;
    printf("Enter a Number:");
    scanf("%d",&n);
    int nsp=1,ndg=n-1;

    for(i=1;i<=2*n-1;i++){
        printf("%d",i);
    }
    printf("\n");
    for(i=1;i<=n-1;i++){
        int a=1;
       for(j=1;j<=ndg;j++){
        printf("%d",a);
        a++;
       }
       for(j=1;j<=nsp;j++){
        printf(" ");
        a++;
       }
        for(j=1;j<=ndg;j++){
        printf("%d",a);
        a++;
       }
       nsp+=2;
       ndg--;
        printf("\n");
    }
}