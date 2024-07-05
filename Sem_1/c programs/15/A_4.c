#include<stdio.h>

void main(){
	int n,x;
	printf("Enter Array Size:");
	scanf("%d",&n);
	int a[n],i,count=0;
	
	for(i=0;i<n;i++){
		printf("Enter Element in arr[%d]:",i);
		scanf("%d",&a[i]);
	}
	printf("Enter an element for search:");
	scanf("%d",&x);
	
	for(i=0;i<n;i++){
		if(a[i]==x){
			count++;
			printf("Entered search element in a[%d]\n",i);
		}
	}
	if (count==0)
	{
		printf("Not Found");
	}
	
}
