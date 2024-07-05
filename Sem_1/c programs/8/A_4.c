#include<stdio.h>

void main(){
	int i=1,n,sum=0;
	printf("Enter Number:");
	scanf("%d",&n);
	
	while(i<=n){
		sum=sum+i;
		i++;
	}
	printf("Sum=%d",sum);
}
