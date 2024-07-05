#include<stdio.h>
// only single,Double And Triple Step
int stair(int n){
    if(n==0) return 1;
    else if(n<0) return 0;
    int totalWays=stair(n-1)+stair(n-2)+stair(n-3);
    return totalWays;
}
void main(){
    int n;
    printf("Enter n:");
    scanf("%d",&n);
    int ways=stair(n);
    printf("Number Of Ways:%d",ways);
}