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
    int n,r;
    printf("Enter n:");
    scanf("%d",&n);
    printf("Enter r:");
    scanf("%d",&r);
    int ans=combination(n,r);
    printf("ncr=%d\n",ans);
    printf("npr=%d\n",ans*fact(r));
}