#include<stdio.h>
#include<string.h>
  void main(){
	char s[10],x;
	int i,count=0;
	printf("Enter String:");
  	gets(s);  
 	printf("Enter Character For Search:");
 	scanf("%c",&x);
 	
 	for(i=0;s[i]!='\0';i++){
 		if(s[i]==x){
 			count++;
			printf("Entered Search Character at s[%d]\n",i);	
		 }
	 }
	if(count==0){
		printf("Not Found");
	}
  }

