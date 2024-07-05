#include<stdio.h>

void main(){
	int i=1,x,y,ans=1;
	printf("Enter Value Of Exponent:");
	scanf("%d",&x);
	printf("Enter Value Of Power:");
	scanf("%d",&y);
	
	while(i<=y){
		ans=ans*x;
		i++;
	}
	printf("Ans=%d",ans);
}
