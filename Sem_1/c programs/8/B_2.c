#include<stdio.h>

void main(){
	int i=100,count=0;
	
	while(i<=200){
		if((i%7)==0 && (i%5)!=0){
			printf("%d\n",i);
			count++;
		}
		i++;

	}
	printf("Count=%d",count);
}
