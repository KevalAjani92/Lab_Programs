#include<stdio.h>

void main()
{
	float f,i;
	printf("Enter Value in Feet :");
	scanf("%f",&f);
	if (f>0 || f==0)
	{
		i=f*12;
		printf("Value In Inches:%f",i);
	}
	else{
		printf("Invalid Value");
	}
}
ṇ