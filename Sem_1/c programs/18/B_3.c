#include<stdio.h>

void primeinterval(int n,int x){
	int i,count=0,j;
	for(i=n;i<=x;i++){
		count=0;
		if(i==1){
			continue;
		}else{
			for(j=2;j<=i/2;j++){
			if(i%j==0){
				count++;
			}
		}
				if(count==0){
					printf("%d\n",i);
				}
		}
		
	}
	
}
void main(){
	int n,x;
	printf("Enter First Number Of Interval:");
	scanf("%d",&n);
	printf("Enter Last Number Of Interval:");
	scanf("%d",&x);
	
	primeinterval(n,x);
}
