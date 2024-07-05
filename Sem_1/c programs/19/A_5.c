#include<stdio.h>
  void main(){
	char s1[10],x1,x2;
	int i;
	printf("Enter String:");
  	gets(s1);
  	printf("Enter Character For Replace:");
 	scanf(" %c",&x1);
 	printf("Enter replacement:");
 	scanf(" %c",&x2);
 	for(i=0;s1[i]!='\0';i++){
 		if(s1[i]==x1){
		 	s1[i]=x2;	
		 }
	 }
 	printf("%s",s1);
 	
  }

