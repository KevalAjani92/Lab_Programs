#include<stdio.h>

float si(float p,float r,float t){
	float x;
	x=(p*r*t)/100;
	return x;
	
}
void main(){
	float p,r,t;
	printf("Enter Value Of Principle:");
	scanf("%f",&p);
	printf("Enter Value Of Interest:");
	scanf("%f",&r);
	printf("Enter Value Of Time:");
	scanf("%f",&t);
	
	float res=si(p,r,t);
	printf("Simple Interest=%f",res);
}
