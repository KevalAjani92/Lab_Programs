#include<stdio.h>
#include"check.h"

void main(){
	int n;
	printf("Enter Number:");
	scanf("%d",&n);
	checkprime(n);
	printf("\n");
	checkperfect(n);
	printf("\n");
	checkArmstrong(n);
}
