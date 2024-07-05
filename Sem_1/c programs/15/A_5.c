#include<stdio.h>
void main(){
	char a[100],i,count=0;
	printf("Enter String:");
	gets(a);
	printf("%s",a);
	
	for(i=0;a[i]!='\0';i++){
		count++;
	}
	printf("\nLength Of String=%d",count);
}

