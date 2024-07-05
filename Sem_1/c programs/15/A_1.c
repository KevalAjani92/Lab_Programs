#include<stdio.h>

void main(){
	int n;
	printf("Enter size of array:");
	scanf("%d",&n);
	
	int a[n],b[n],i;
	for(i=0;i<n;i++){
		printf("Enter element in arr[%d]:",i);
		scanf("%d",&a[i]);
		b[i]=a[i];
	}
	for(i=0;i<n;i++){
		printf("Element of b[%d]=%d\n",i,b[i]);
	}
}
