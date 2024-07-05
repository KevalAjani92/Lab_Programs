#include<stdio.h>

void main(){
	int n;
	printf("Enter Size Of Array:");
	scanf("%d",&n);
	int i,a[n],*ptr;
	
	for(i=0;i<n;i++){
		printf("Enter Element in arr[%d]:",i);
		scanf("%d",&a[i]);
		
	}
	ptr=&a[0];
	for(i=0;i<n;i++){
		printf("Element a[%d]=%d\n",i,*(ptr+i));
	}
}
