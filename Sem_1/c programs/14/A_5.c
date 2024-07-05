#include<stdio.h>

void main(){
	int h[5],w[5],i,count=0;
	
	for(i=0;i<5;i++){
		printf("Enter height in h[%d]:",i);
		scanf("%d",&h[i]);
		printf("Enter Weight in w[%d]:",i);
		scanf("%d",&w[i]);
		if(h[i]>170 && w[i]<50){
			count++;
		}
	}
	printf("%d",count);	
}
