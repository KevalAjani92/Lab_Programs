#include<stdio.h>
void main(){
    int i,j,x;
    printf("Enter row:");
    scanf("%d",&x);
    for(i=0;i<=x;i++){
        for(j=0;j<=(x-i);j++){
            printf(" ");
        }
        int first=1;
        for(j=0;j<=i;j++){
            printf("%d ",first);
            first=first*(i-j)/(j+1);
        }
        printf("\n");
    }
}