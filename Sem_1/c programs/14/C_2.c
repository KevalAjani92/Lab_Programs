#include<stdio.h>

void main(){
	int n,x,i;
	printf("Enter Size Of Array:");
	scanf("%d",&n);
	int a[n],k;
	
	for(i=0;i<n;i++){
		printf("Enter Element in arr[%d]:",i);
		scanf("%d",&a[i]);
	}
	x=a[0];
	printf("\nMissing Elements Are:");
	for(i=0;i<n;i++){
		if(a[i]!=x){
			printf("%d,",x);
			i--;
		}
		x++;
	}
}
