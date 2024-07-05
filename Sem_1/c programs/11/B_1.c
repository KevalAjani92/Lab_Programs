#include<stdio.h>

void main(){
	int i,n,x=0,y=1,fs=1;
	printf("Enter n:");
	scanf("%d",&n);
	printf("0 ");
	
	for(i=1;i<=n-1;i++){
		printf("%d ",fs);
		fs=x+y;
		x=y;
		y=fs;
	}
}
