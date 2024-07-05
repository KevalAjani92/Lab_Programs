#include<stdio.h>
void preInpost(int n){
    if(n==0) return;
    printf("Pre %d\n",n);
    preInpost(n-1);
    printf("In %d\n",n);
    preInpost(n-1);
    printf("Post %d\n",n);
    return;
}
void main(){
    int n;
    printf("Enter n:");
    scanf("%d",&n);
    preInpost(n);
}