#include<stdio.h>

float max(float a,float b,float c){
	float max;
	if(a>b && a>c){
		max=a;
	}else if(b>a && b>c){
		max=b;
	}else if(c>a && c>b){
		max=c;
	}
	return max;
}
void main(){
	float a,b,c;
	printf("Enter First Number:");
	scanf("%f",&a);
	printf("Enter Second Number:");
	scanf("%f",&b);
	printf("Enter Third Number:");
	scanf("%f",&c);
	float res=max(a,b,c);
	
	printf("Max=%f",res);
}
