#include<stdio.h>

void main(){
	int n;
	printf("Enter n:");
	scanf("%d",&n);
	int arr[n],i;
	
	for(i=0;i<n;i++){
		printf("Enter Element in arr[%d]:",i);
		scanf("%d",&arr[i]);
	}
	printf("Normal Order\n");
	for(i=0;i<n;i++){
		printf("arr[%d]=%d\n",i,arr[i]);
	}
	printf("Reverse Order\n");
	for(i=n-1;i>=0;i--){
		printf("arr[%d]=%d\n",i,arr[i]);
	}
}
