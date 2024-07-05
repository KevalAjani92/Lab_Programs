#include<stdio.h>

void main(){
	int a,b,*ptr1,*ptr2;
	printf("Enter First Number:");
	scanf("%d",&a);
	printf("Enter Second Number:");
	scanf("%d",&b);
	
	ptr1=&a;
	ptr2=&b;
	
	*ptr1=*ptr1^*ptr2;
	*ptr2=*ptr1^*ptr2;
	*ptr1=*ptr1^*ptr2;
	
	printf("First Number=%d",*ptr1);
	printf("Second Number=%d",*ptr2);
	
}
