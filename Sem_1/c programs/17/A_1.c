#include<stdio.h>

void main(){
	int n,*p;
	printf("Enter n:");
	scanf("%d",&n);
	
	p=&n;
	printf("Address Of Variable=%d\n",p);
	printf("Value Of Variable=%d",*p);
}
