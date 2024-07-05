#include<stdio.h>

void main(){
	int n,i;
	printf("Enter Size Of Array:");
	scanf("%d",&n);
	int a[n],x=n-1,temp=0;
	
	for(i=0;i<n;i++){
		printf("Enter Element In arr[%d]:",i);
		scanf("%d",&a[i]);
	}
	for(i=0;i<n/2;i++){
		temp=a[i];
		a[i]=a[x];
		a[x]=temp;
		x--;
	}
	for(i=0;i<n;i++){
		printf("%d ",a[i]);
	}
}
