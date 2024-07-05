#include<stdio.h>
int fibbo(int n){
    if(n<=2) return 1;
    return fibbo(n-1)+fibbo(n-2);
}
void main(){
    int n;
    printf("Enter n:");
    scanf("%d",&n);
    int res=fibbo(n);
    printf("%d",res);
}