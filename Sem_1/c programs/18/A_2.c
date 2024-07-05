#include<stdio.h>

void maxmin(int,int);
void main(){
	int a,b;
	printf("Enter First Number:");
	scanf("%d",&a);
	printf("Enter Second Number:");
	scanf("%d",&b);
	maxmin(a,b);
}
void maxmin(int a,int b){
	if(a>b){
		printf("Max=%d\n",a);
		printf("Min=%d",b);
	}else{
		printf("Max=%d\n",b);
		printf("Min=%d",a);
	}
}
