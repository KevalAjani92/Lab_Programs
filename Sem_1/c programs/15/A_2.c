#include<stdio.h>

void main(){
	int n;
	printf("Enter Array Size:");
	scanf("%d",&n);
	int a[n],i,count=0;
	
	for(i=0;i<n;i++){
		printf("Enter Element in arr[%d]:",i);
		scanf("%d",&a[i]);
		if(a[i]<0){
			count++;
		}
	}
	printf("%d",count);
}
