#include<stdio.h>
void main(){
	int i,n,count=0,temp1,temp2;
	scanf("%d",&n);
	temp2=n;
	for(i=0;i<=9;i++){
		while(n!=0){
			temp1=n%10;
			n=n/10;
			if(temp1==i){
				count++;
			}
		}
		printf("%d count=%d\n",i,count);
		count=0;
		n=temp2;
	}
}

