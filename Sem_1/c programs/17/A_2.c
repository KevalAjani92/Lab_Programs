#include<stdio.h>

void main(){
	int n=1011,*ptr1;
	float x=92.06,*ptr2;
	double y=9.11,*ptr3;
	char z='K',*ptr4;
	ptr1=&n;
	ptr2=&x;
	ptr3=&y;
	ptr4=&z;
	
	printf("Addres Of int=%d ",ptr1);
	printf("Value Of int=%d\n",*ptr1);
	
	printf("Addres Of float=%d ",ptr2);
	printf("Value Of float=%f\n",*ptr2);
	
	printf("Addres Of double=%d ",ptr3);
	printf("Value Of double=%lf\n",*ptr3);
	
	printf("Addres Of char=%d ",ptr4);
	printf("Value Of char=%c\n",*ptr4);
}
