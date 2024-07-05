#include<stdio.h>

void main(){
	int n,count=0;
	printf("Enter size:");
	scanf("%d",&n);
	int a[n],j,i;
	
	for(i=0;i<n;i++){
		printf("Enter Element In arr[%d]:",i);
		scanf("%d",&a[i]);
	}
	for(i=0;i<n-1;i++){
		for(j=i+1;j<n;j++){
			if(a[i]==a[j]){
				count++;
				break;
			}
		}
	}
	printf("%d",count);
}
