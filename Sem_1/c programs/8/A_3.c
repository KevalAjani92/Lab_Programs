#include<stdio.h>

void main(){
	int a,b;
	printf("Enter First Number:");
	scanf("%d",&a);
	printf("Enter Second Number:");
	scanf("%d",&b);
	
	if(a<b){
			while(a<=b){
		if((a%2)==0){
			printf("%d\n",a);
		}
		a++;
		}
	}else 	while(b<=a){
		if((b%2)==0){
			printf("%d\n",b);
		}
		b++;
	}

}
