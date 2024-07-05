#include<stdio.h>

void main(){
	int i=1,n=1,sum=0;
	double avg;
	printf("Enter 0 To stop");
	printf("\n");
	while(n!=0){
		printf("Enter Number:");
		scanf("%d",&n);
		sum=sum+n;
		avg=sum/(double)(i-1);
		i++;
	}
	printf("Sum=%d Avg=%lf",sum,avg);
}
