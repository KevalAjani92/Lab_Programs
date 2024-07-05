#include<stdio.h>

void main(){
    int n;
    printf("Enter a Number:");
    scanf("%d",&n);

    ((n%2)==0)?printf("Even Number"):printf("Odd Number");
}