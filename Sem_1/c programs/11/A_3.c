#include<stdio.h>

void main(){
	int n,i;
	printf("Enter n:");
	scanf("%d",&n);
	for(i=1;i<=10;i++){
		printf("%03d*%03d=%03d\n",n,i,n*i);
	}
	
}
