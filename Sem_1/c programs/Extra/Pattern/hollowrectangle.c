#include<stdio.h>
void main(){
    int i,j,n,m;
    printf("Enter row:");
    scanf("%d",&n);
    printf("Enter cols:");
    scanf("%d",&m);

    for(i=1;i<=n;i++){
        for(j=1;j<=m;j++){
            if(j==1 || i==1 || i==n || j==m){
                printf("* ");
            }else{
                printf("  ");
            }
        }
        printf("\n");
    }
}