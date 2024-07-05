#include<stdio.h>
void print(int a[]);
  void main(){
  	int n;
  	printf("Enter Size Of Array:");
  	scanf("%d",&n);
  	int a[n],i;
  	for(i=0;i<n;i++){
  		printf("Enter Element In arr[%d]:",i);
  		scanf("%d",&a[i]);
	  }
	print(a);
  }
void print(int a[]){
	int i,n;
	for(i=0;i<n;i++){
  		printf("Element a[%d]=%d\n",i,a[i]);
	  }
}
