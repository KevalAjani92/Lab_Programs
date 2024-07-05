#include<stdio.h>
void sum(int n,int s){
	if(n==0){
		printf("%d",s);
		return;
	}
	sum(n-1,s+n);
}
void main(){
	int n,res;
	printf("Enter n:");
	scanf("%d",&n);
	sum(n,0);
}