#include<stdio.h>
#include<math.h>
void main(){
	int n;
	printf("Enter Array Size:");
	scanf("%d",&n);
	int a[n],i,sum=0,count=0,multi=1;
	float avg,GM,HM;
	
	for(i=0;i<n;i++){
		printf("Enter Element in arr[%d]:",i);
		scanf("%d",&a[i]);
		sum=sum+a[i];
		multi=multi*a[i];
	}
	avg=(float)sum/n;
	float d = 1/(float)n;
	GM=pow(multi,d);
	HM=pow(GM,2)/avg;
	
	printf("Average=%f\n",avg);
	printf("Geometric Mean=%f\n",GM);
	printf("Harmonic Mean=%f\n",HM);
}
