#include<stdio.h>

void main(){
	int i,j,n=5,a=1,J=65;
	for(i=1;i<=n;i++){
		for(j=1;j<=n-i;j++){
			printf(" ");
		}
		for(j=1;j<=2*i-1;j++){
			if(j%2==1){
				if(i%2==1){
				printf("%d",a);
				a++;
				}else{
					printf("%c",J);
				J++;
				} 
			}else printf(" ");
		}
		a=1;
		printf("\n");
	}
}	
