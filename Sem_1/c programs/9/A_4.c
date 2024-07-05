#include<stdio.h>

void main(){
	int i=1,n,count=1;
	printf("Enter Number:");
	scanf("%d",&n);
	
	while(i<=n){
		count=count*i;
		i++;
	}
	printf("Factorial of Entered Number:%d",count);
}
