#include<stdio.h>

void main(){
	int n,PC=0,NC=0,ZC=0;
	printf("Enter n:");
	scanf("%d",&n);
	int arr[n],i;
	
	for(i=0;i<n;i++){
		printf("Enter an element in arr[%d]:",i);
		scanf("%d",&arr[i]);
	}
	for(i=0;i<n;i++){
		if(arr[i]>0){
			PC++;
		}else if(arr[i]<0){
			NC++;
		}else ZC++;
	}
	printf("Positive Count=%d\n",PC);
	printf("Negative Count=%d\n",NC);
	printf("Zero Count=%d",ZC);
}
