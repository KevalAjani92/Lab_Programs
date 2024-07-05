#include<stdio.h>

void main(){
	int i=1,n;
	printf("Enter Numer For Multiplication Table:");
	scanf("%d",&n);
	
	while(i<=10){
		printf("%02d*%02d=%02d\n",n,i,n*i);
		i++;
	}
}
