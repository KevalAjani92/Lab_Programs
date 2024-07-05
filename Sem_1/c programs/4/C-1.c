#include<stdio.h>

void main()
{
	int s,m,h;
	printf("Enter Time in Second:");
	scanf("%d",&s);
	h=s/3600;
	m=(s-3600*h)/60;
	s=(s-(3600*h)-(m*60));
	printf("%02d:%02d:%02d",h,m,s);
}
