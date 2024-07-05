#include<stdio.h>

void main(){
	int n,max=0,min;
	printf("Enter n:");
	scanf("%d",&n);
	int arr[n],i,sum=0;
	float avg=0;
	
	
	for(i=0;i<n;i++){
		printf("Enter an element in arr[%d]:",i);
		scanf("%d",&arr[i]);
	}min=arr[4];
	for(i=0;i<n;i++){
		if(arr[i]>max){
			max=arr[i];
		}		
		if(arr[i]<min){
			min=arr[i];
		}
			sum=sum+arr[i];
	}
	avg=(float)sum/n;
	printf("Max=%d\n",max);
	printf("Min=%d\n",min);
	printf("Sum=%d\n",sum);
	printf("Avg=%f",avg);
}
