#include<stdio.h>

int sum(int,int);
void main(){
	int a,b;
	printf("Enter First Number:");
	scanf("%d",&a);
	printf("Enter Second Number:");
	scanf("%d",&b);
	int res=sum(a,b);
	
	printf("Sum=%d",res);
	
}
int sum(int a,int b){
	int x;
	x=a+b;
	return x;
}
