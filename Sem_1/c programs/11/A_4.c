#include<stdio.h>

void main(){
	int x,y,i,prod=1;
	printf("Enter Value Of Exponent:");
	scanf("%d",&x);
	printf("Enter Value Of Power:");
	scanf("%d",&y);
	
	for(i=1;i<=y;i++){
		prod=prod*x;
	}
	printf("%d",prod);
}
