#include<stdio.h>

void main(){
	int i=1,ans=0,n;
	printf("Enter n:");
	scanf("%d",&n);
	
	while(i<=n){
		if((i%2)==0){
			ans=ans-i;
		}else ans=ans+i;
		i++;
	}
	printf("%d",ans);
}
