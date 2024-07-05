#include<stdio.h>
void main(){
    int i,j,n;
    printf("Enter an odd Number:");
    scanf("%d",&n);
    for(i=1;i<=n;i++){
        for(j=1;j<=n;j++){
            if(j==(n/2)+1 || i==(n/2)+1){
                printf("*");
            }else{
                printf(" ");
            }
        }
        printf("\n");
    }
}