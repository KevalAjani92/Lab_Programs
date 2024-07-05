#include<stdio.h>

void main(){
	int i=1,n,oddcount=0,evencount=0;
	while(i<=10){
		printf("Enter Number:");
		scanf("%d",&n);
		if((n%2)==0){
			evencount++;
		}else{
			oddcount++;
		}
		i++;
	}
	printf("Oddcount=%d",oddcount);
	printf("\nEvencount=%d",evencount);
}
