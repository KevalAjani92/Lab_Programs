#include<stdio.h>

void main(){
    int i,j,n,min;
    printf("Enter n:");
    scanf("%d",&n);

    for(i=1;i<=2*n-1;i++){
        for(j=1;j<=2*n-1;j++){
            int a=i,b=j;
            if(i>n) a=2*n-i;
            if(j>n) b=2*n-j;

            if(a<b) min=a;
            else min=b;
            printf("%d ",n+1-min);
        }
        printf("\n");
    }
}