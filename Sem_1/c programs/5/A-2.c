#include<stdio.h>

void main()
{
	int a,b,temp;
	printf("Enter Value Of a :");
	scanf("%d",&a);
	printf("Enter Value Of b :");
	scanf("%d",&b);
	temp=a;
	a=b;
	b=temp;
	printf("a=%d\nb=%d",a,b);
}
