#include<stdio.h>
int fact(int x){
    int i,prod=1;
    for(i=1;i<=x;i++){
        prod*=i;
    }
    return prod;
}
int combination(int n,int r){
    int res;
    res=fact(n)/(fact(r)*fact(n-r));
    return res;
}
void main(){
    int i,j,x;
    printf("Enter row:");
    scanf("%d",&x);
    for(i=0;i<=x;i++){
        for(j=0;j<=(x-i);j++){
            printf(" ");
        }
        int j=0,y=0;

        for(y=0;y<2*i+1;y++){
            if((y%2)==0){
                printf("%d",combination(i,j));
                j++;
            }
            else{
                printf(" ");
            }  
        }
        printf("\n");
    }
}