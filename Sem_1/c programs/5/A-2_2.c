#include<stdio.h>

void main()
{
	int a,b;
	printf("Enter value Of a:");
	scanf("%d",&a);
	printf("Enter value Of b:");
	scanf("%d",&b);
	a=a+b;
	b=a-b;
	a=a-b;
	printf("a=%d\nb=%d",a,b);
}
