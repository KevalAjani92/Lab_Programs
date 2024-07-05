#include<stdio.h>

void main()
{
    int a,b;
    char x;
    printf("Enter First Value:");
    scanf("%d",&a);
    printf("Enter Second Value:");
    scanf("%d",&b);
    printf("Enter Your Choice\nEnter + For Addition\nEnter - For Substraction\nEnter * For Multiplication\nEnter / For Division:");
    scanf(" %c",&x);
    if(x=='+'){
        printf("Addition Is:%d",a+b);
    }
    else if(x=='-'){
         printf("Substraction Is:%d",a-b);
         }
    else if(x=='*'){
         printf("Multiplication Is:%d",a*b);
         }
    else if(x=='/'){
         printf("Division Is:%f",(float)a/b);
         }
}