#include<stdio.h>

void checkprime(int n){
	int i,count=0;
	for(i=2;i<=n/2;i++){
		if(n%i==0){
			count++;
		}
	}
	if(count==0 && n!=1){
        printf("%d,",n);
    }
}
void main(){
    int n,i;
    printf("Enter Number:");
    scanf("%d",&n);

    for(i=1;i<=n;i++){
        if(n%i==0){
            checkprime(i);
        }
    }
}