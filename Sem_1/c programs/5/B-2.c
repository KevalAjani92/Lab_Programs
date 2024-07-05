#include<stdio.h>

void main()
{
	int a;
	printf("Enter Your Value:");
	scanf("%d",&a);
	if((a&1)==0){
		printf("Entered Value Is Even");
	}else
	printf("Entered Value Is Odd");
}
