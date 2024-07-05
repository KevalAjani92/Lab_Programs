#include<stdio.h>

void main(){
	int n,OC=0,EC=0;
	printf("Enter n:");
	scanf("%d",&n);
	int arr[n],i;
	
	for(i=0;i<n;i++){
		printf("Enter an element in arr[%d]:",i);
		scanf("%d",&arr[i]);
		if(arr[i]%2==0){
			EC++;
		}else OC++;
	}
	
	printf("Odd Count=%d\n",OC);
	printf("Even Count=%d\n",EC);
}
