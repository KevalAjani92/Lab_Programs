#include<stdio.h>
#include<string.h>
  void main(){
  	char s1[10],s2[10];
  	printf("Enter First String:");
  	gets(s1);
  	printf("Enter Second String:");
  	gets(s2);
  	
  	printf("Lower=%s\n",strlwr(s1));
  	printf("Upper=%s\n",strupr(s1));
  	printf("Length=%d %d",strlen(s1),strlen(s2));
  	printf("\nCompare=%d",strcmp(s1,s2));
  	printf("\n%s",strcat(s2,s1));
  	strcpy(s1,s2);
  	printf("\nCopy=%s",s1);
  	printf("\nReverse=%s",strrev(s1));
  }

