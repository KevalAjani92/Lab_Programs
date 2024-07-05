#include<stdio.h>

void main(){
	int n;
	printf("Enter Array Size:");
	scanf("%d",&n);
	int a[n],i,sum=0,count=0;
	float avg;
	
	for(i=0;i<n;i++){
		printf("Enter Element in arr[%d]:",i);
		scanf("%d",&a[i]);
		sum=sum+a[i];
	}
	avg=sum/n;
	for(i=0;i<n;i++){
		if(a[i]>avg){
			count++;
		}
	}
	printf("Numbers higher than the average=%d",count);
}
