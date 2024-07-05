#include<stdio.h>

void main(){
	int n;
	printf("Enter Array Size:");
	scanf("%d",&n);
	int a[n],i,temp=0,j;
	
	for(i=0;i<n;i++){
		printf("Enter Element in arr[%d]:",i);
		scanf("%d",&a[i]);
	}
	for(i=0;i<n-1;i++){
		for(j=0;j<n-i;j++){
			if(a[j]>a[j+1]){ 
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		}
		}			
	}
	for(i=0;i<n;i++){
		printf("%d",a[i]);
	}
}
