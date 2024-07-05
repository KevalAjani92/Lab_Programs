#include<stdio.h>

void checkprime(int n){
	int i,count=0;
	for(i=2;i<=n/2;i++){
		if(n%i==0){
			count++;
		}
	}
	if(count==0 && n!=1){
		printf("Entered Number Is Prime");
	}else printf("Entered Number Is Non Prime");

}
void checkperfect(int n){
	int i,sum=0;
	for(i=1;i<n;i++){
		if(n%i==0){
			sum+=i;
		}
	}
	if(sum==n){
		printf("Entered Number Is a Perfect Number");
	}else printf("Entered Number Is Not a Perfect Number");
}
void checkArmstrong(int n){
	int i,j,count=0,cpn,rem,temp=1,sum=0;
	cpn=n;
	for(i=1;n!=0;i++){
		n=n/10;
		count++;
	}
	n=cpn;
	for(i=1;n!=0;i++){
		temp=1;
		rem=n%10;
			for(j=1;j<=count;j++){
				temp=temp*rem;
			}
		sum=sum+temp;
		n=n/10;
	}
	if(sum==cpn){
		printf("Entered Number Is a Armstrong Number");
	}else printf("Entered Number Is Not a Armstrong Number");
}
