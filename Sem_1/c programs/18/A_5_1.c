#include<stdio.h>

void swap(int,int);
void main(){
	int a,b;
	printf("Enter First Number:");
	scanf("%d",&a);
	printf("Enter Second Number:");
	scanf("%d",&b);
	
	printf("Before Swap\n%d %d",a,b);
	swap(a,b);
}
void swap(int a,int b){
	int temp;
	temp=a;
	a=b;
	b=temp;
	printf("\n\nAfter Swap\n%d %d",a,b);

}
