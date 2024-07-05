#include<stdio.h>
int maze(int cr,int cc,int er,int ec){
    int rightways=0,downways=0;
    if(cr==er && cc==ec) return 1;
    if(cr==er){
        rightways+=maze(cr,cc+1,er,ec);
    }
    if(cc==ec){
        downways+=maze(cr+1,cc,er,ec);
    }
    if(cr<er && cc<ec){
        rightways+=maze(cr,cc+1,er,ec);
        downways+=maze(cr+1,cc,er,ec);
    }
    int totalWays=rightways+downways;
    return totalWays;
}
void main(){
    int m,n;
    printf("Enter Rows Of Maze:");
    scanf("%d",&n);
    printf("Enter cols Of Maze:");
    scanf("%d",&m);
    int res=maze(1,1,n,m);
    printf("%d",res);
}