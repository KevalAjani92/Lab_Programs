#include<stdio.h>

void main()
{
	int a,b,c;
	printf("Enter Value Of a:");
	scanf("%d",&a);
	printf("Enter Value Of b:");
	scanf("%d",&b);
	printf("Enter Value Of c:");
	scanf("%d",&c);
	if(a>b)
		if(a>c)
		printf("a is largest");
		else 
		printf("c is largest");
	else
		if(b>c)
		printf("b is largest");
		else
		printf("c is largest");	
		
}
