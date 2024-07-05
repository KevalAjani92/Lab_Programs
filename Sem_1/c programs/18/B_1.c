#include<stdio.h>

void fibbo(int n){
	int i,a=0,b=1,sum=0;
	printf("0 ");
	printf("1 ");
	for(i=1;i<=n-2;i++){
		sum=a+b;
		printf("%d ",sum);
		a=b;
		b=sum;
	}
	sum=0;
}
void main(){
	int n;
	printf("Enter n:");
	scanf("%d",&n);
	
	fibbo(n);
}
